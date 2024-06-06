import DrawingTools.DrawingPanel;
import antlr.NewLogoParser;
import antlr.NewLogoParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Visitor extends NewLogoParserBaseVisitor<Value> {
    DrawingPanel panel;
    Stack<Hashtable<String, Value>> variables = new Stack<>();
    Hashtable<String, Func> functions = new Hashtable<>();

    @Override
    public Value visitProgram(NewLogoParser.ProgramContext ctx) {
        panel = DrawingPanel.createPanel(800, 600);
        variables.push(new Hashtable<>());
        visitChildren(ctx);
        return defaultResult();
    }

    @Override
    protected Value defaultResult() {
        return new Value(0);
    }
    
    protected Value getVariable(String name) {
        for (int i = variables.size() - 1; i >= 0; i--) {
            if (variables.get(i).containsKey(name)) {
                return variables.get(i).get(name);
            }
        }
        System.err.println("Variable " + name + " not declared!");
        return null;
    }
    
    protected boolean setVariable(String name, Value value) {
        for (int i = variables.size() - 1; i >= 0; i--) {
            if (variables.get(i).containsKey(name)) {
                variables.get(i).put(name, value);
                return true;
            }
        }
        System.err.println("Variable " + name + " not declared!");
        return false;
    }
    
    protected boolean variableExists(String name) {
        for (int i = variables.size() - 1; i >= 0; i--) {
            if (variables.get(i).containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Value visitAtom(NewLogoParser.AtomContext ctx) {
        return new Value(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Value visitValue(NewLogoParser.ValueContext ctx) {
        if (ctx.CHAR_CONST() != null) {
            String argument = ctx.getText();
            return new Value(argument.charAt(1));
        }
        else {
            return visitChildren(ctx);
        }
    }

    @Override
    public Value visitString(NewLogoParser.StringContext ctx) {
        Value result = new Value(ctx.getChild(0).getText().substring(1, ctx.getChild(0).getText().length() - 1));
        
        for (int i = 2; i < ctx.getChildCount(); i += 2) {
            result = Value.add(result, new Value(ctx.getChild(i).getText().substring(1, ctx.getChild(i).getText().length() - 1)));
        }
        
        return result;
    }

    @Override
    public Value visitVariable(NewLogoParser.VariableContext ctx) {
        return getVariable(ctx.getText());
    }

    @Override
    public Value visitVarDeclaration(NewLogoParser.VarDeclarationContext ctx) {
        String varName = ctx.variable().getText();
        Value value = ctx.value().accept(this);
        Value.ValueType type = value.getType();
        if (type != value.getType()) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Invalid type for variable " + varName);
            return new Value(0);
        }
        if(variables.peek().containsKey(varName)) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Variable " + varName + " already declared in scope!");
            return new Value(0);
        }
        variables.peek().put(varName, value);
        return value;
    }

    @Override
    public Value visitVarAssign(NewLogoParser.VarAssignContext ctx) {
        String varName = ctx.variable().getText();
        Value value = ctx.value().accept(this);
        if(!setVariable(varName, value)) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Variable " + varName + " not declared!");
            return new Value(0);
        }
        
        return value;
    }

    @Override
    public Value visitVarIncrement(NewLogoParser.VarIncrementContext ctx) {
        if(ctx.incOrDec().INCREMENT() != null) {
            return Value.add(getVariable(ctx.variable().getText()), new Value(1));
        }
        else {
            return Value.add(getVariable(ctx.variable().getText()), new Value(-1));
        }
    }

    @Override
    public Value visitSelfOp(NewLogoParser.SelfOpContext ctx) {
        if (ctx.INC_SELF() != null) {
            return new Value(1);
        }
        else if (ctx.DEC_SELF() != null) {
            return new Value(-1);
        }
        else if (ctx.MUL_SELF() != null) {
            return new Value(2);
        }
        else if (ctx.DIV_SELF() != null) {
            return new Value(-2);
        }
        else return defaultResult();
    }

    @Override
    public Value visitVarSelfOp(NewLogoParser.VarSelfOpContext ctx) {
        if (!variableExists(ctx.variable().getText())) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Variable " + ctx.variable().getText() + " not declared!");
            return new Value(0);
        }
        
        Value value = ctx.value().accept(this);
        Value newValue = switch (ctx.selfOp().accept(this).getInt()) {
            case 1 -> Value.add(getVariable(ctx.variable().getText()), value);
            case -1 -> Value.add(getVariable(ctx.variable().getText()), Value.multiply(value, new Value(-1)));
            case 2 -> Value.multiply(getVariable(ctx.variable().getText()), value);
            case -2 -> Value.divide(getVariable(ctx.variable().getText()), value);
            default -> defaultResult();
        };

        setVariable(ctx.variable().getText(), newValue);
        
        return newValue;
    }

    @Override
    public Value visitSumOp(NewLogoParser.SumOpContext ctx) {
        if(ctx.MINUS() != null) {
            return new Value(-1);
        }
        return new Value(1);
    }

    @Override
    public Value visitMathExpression(NewLogoParser.MathExpressionContext ctx) {
        Value result = ctx.getChild(0).accept(this);
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            Value next = ctx.getChild(i + 1).accept(this);
            if (Objects.equals(ctx.getChild(i).accept(this), new Value(-1))) {
                next = Value.multiply(next, new Value(-1));
            }
            result = Value.add(result, next);
        }
        return result;
    }

    @Override
    public Value visitMulOp(NewLogoParser.MulOpContext ctx) {
        if(ctx.DIVIDE() != null) {
            return new Value(-1);
        }
        else if(ctx.MULTIPLY() != null) {
            return new Value(1);
        }
        else return new Value(0); //modulo
    }

    @Override
    public Value visitMulExpression(NewLogoParser.MulExpressionContext ctx) {
        Value result = ctx.getChild(0).accept(this);
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            Value next = ctx.getChild(i + 1).accept(this);
            if (Objects.equals(ctx.getChild(i).accept(this), new Value(-1))) {
                result = Value.divide(result, next);
            }
            else if (Objects.equals(ctx.getChild(i).accept(this), new Value(1))) {
                result = Value.multiply(result, next);
            }
            else {
                result = new Value(result.getInt() % next.getInt());
            }
        }
        return result;
    }

    @Override
    public Value visitBrExpression(NewLogoParser.BrExpressionContext ctx) {
        return ctx.mathExpression().accept(this);
    }

    @Override
    public Value visitFunctionCall(NewLogoParser.FunctionCallContext ctx) {
        List<Value> arguments = new ArrayList<>();
        for (NewLogoParser.ValueContext value : ctx.callArguments().value()) {
            arguments.add(value.accept(this));
        }
        
        if (ctx.function().drawingFunction() != null) {
            if(ctx.function().drawingFunction().ISBORDER() != null) {
                return new Value(panel.isBorder());
            }
            else {
                return drawingFunction(ctx.function().drawingFunction(), arguments.getFirst());
            }
        }
        else {
            return callFunction(ctx.function().VARIABLE().getText(), arguments);
        }
    }
    
    public Value drawingFunction(NewLogoParser.DrawingFunctionContext ctx, Value argument) {
        if (ctx.FORWARD() != null) {
            panel.forward(argument.getInt());
        }
        else if (ctx.LTURN() != null) {
            panel.lturn(argument.getInt());
        }
        else if (ctx.RTURN() != null) {
            panel.rturn(argument.getInt());
        }
        else if (ctx.CLEAR() != null) {
            panel.clear();
        }
        else if (ctx.LINECOL() != null) {
            Color color = null;
            try {
                color = (Color) Color.class.getField(argument.getString()).get(null);
            } catch (Exception e) {
                System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Invalid color!");
            }
            panel.linecol(color);
        }
        else if (ctx.CHANGEBG() != null) {
            Color color = null;
            try {
                color = (Color) Color.class.getField(argument.getString()).get(null);
            } catch (Exception e) {
                System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Invalid color!");
            }
            panel.changebg(color);
        }
        else if (ctx.LINEWIDTH() != null) {
            panel.linewidth(argument.getInt());
        }
        else if (ctx.PRINT() != null) {
            System.out.println(argument.getValue());
        }
        else return new Value(1);
        return defaultResult();
    }

    @Override
    public Value visitLogicBrExpression(NewLogoParser.LogicBrExpressionContext ctx) {
        return ctx.logicExpression().accept(this);
    }

    @Override
    public Value visitLogicAndExpression(NewLogoParser.LogicAndExpressionContext ctx) {
        Value result;
        if (ctx.NOT() != null) {
            result = new Value(!ctx.getChild(1).accept(this).getBool());
        }
        else {
            result = ctx.getChild(0).accept(this);
        }
        
        for (int i = 2; i < ctx.getChildCount(); i += 2) {
            Value next = ctx.getChild(i).accept(this);
            result = Value.multiply(result, next);
        }
        return result;
    }

    @Override
    public Value visitLogicExpression(NewLogoParser.LogicExpressionContext ctx) {
        Value result;
        if (ctx.NOT() != null) {
            result = new Value(!ctx.getChild(1).accept(this).getBool());
        }
        else {
            result = ctx.getChild(0).accept(this);
        }

        for (int i = 2; i < ctx.getChildCount(); i += 2) {
            Value next = ctx.getChild(i).accept(this);
            result = Value.add(result, next);
        }
        return result;
    }

    @Override
    public Value visitBoolConst(NewLogoParser.BoolConstContext ctx) {
        if (ctx.TRUE() != null) {
            return new Value(true);
        }
        else {
            return new Value(false);
        }
    }

    @Override
    public Value visitCompOp(NewLogoParser.CompOpContext ctx) {
        if (ctx.EQUAL() != null) {
            return new Value(0);
        }
        else if (ctx.NOT_EQUAL() != null) {
            return new Value(1);
        }
        else if (ctx.GREATER() != null) {
            return new Value(2);
        }
        else if (ctx.LESSER() != null) {
            return new Value(-2);
        }
        else if (ctx.GREATER_EQUAL() != null) {
            return new Value(3);
        }
        else {
            return new Value(-3);
        }
    }

    @Override
    public Value visitCompExpression(NewLogoParser.CompExpressionContext ctx) {
        Value value1 = ctx.getChild(0).accept(this);
        Value value2 = ctx.getChild(2).accept(this);
        
        if (value1.getType() != value2.getType()) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Cannot compare values of different types!");
            return new Value(0);
        }

        return switch (ctx.getChild(1).accept(this).getInt()) {
            case 0 -> new Value(value1.getValue().equals(value2.getValue()));
            case 1 -> new Value(!value1.getValue().equals(value2.getValue()));
            case 2 -> new Value(value1.getInt() > value2.getInt());
            case -2 -> new Value(value1.getInt() < value2.getInt());
            case 3 -> new Value(value1.getInt() >= value2.getInt());
            case -3 -> new Value(value1.getInt() <= value2.getInt());
            default -> defaultResult();
        };
    }

    @Override
    public Value visitCompVal(NewLogoParser.CompValContext ctx) {
        if (ctx.CHAR_CONST() != null) {
            String argument = ctx.getText();
            return new Value(argument.charAt(1));
        }
        else {
            return visitChildren(ctx);
        }
    }

    @Override
    public Value visitConditionalStatement(NewLogoParser.ConditionalStatementContext ctx) {
        Value condition = ctx.value().accept(this);
        if (condition.getType() != Value.ValueType.BOOL) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Invalid condition!");
            return new Value(0);
        }
        
        if(condition.getBool()) {
            ctx.statementBlock(0).accept(this);
        }
        else if(ctx.statementBlock().size() > 1) {
            ctx.statementBlock(1).accept(this);
        }
        
        return defaultResult();
    }

    @Override
    public Value visitRepeatLoop(NewLogoParser.RepeatLoopContext ctx) {
        Value n = ctx.value().accept(this);

        try {
            for (int i = 0; i < n.getInt(); i++) {
                ctx.statementBlock().accept(this);
            }
        }
        catch (BreakException e) {
            return defaultResult();
        }

        return defaultResult();
    }

    @Override
    public Value visitWhileLoop(NewLogoParser.WhileLoopContext ctx) {
        Value condition = ctx.value().accept(this);
        if (condition.getType() != Value.ValueType.BOOL) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Invalid condition!");
            return new Value(0);
        }
        
        try {
            while (condition.getBool()) {
                ctx.statementBlock().accept(this);
                condition = ctx.value().accept(this);
            }
        }
        catch (BreakException e) {
            return defaultResult();
        }
        
        return defaultResult();
    }

    @Override
    public Value visitStatementBlock(NewLogoParser.StatementBlockContext ctx) {
        variables.push(new Hashtable<>());
        Value value;
        try {
            value = visitChildren(ctx);
        }
        catch (Exception e) {
            variables.pop();
            throw e;
        }
        variables.pop();
        return value;
    }

    @Override
    public Value visitFuncDefinition(NewLogoParser.FuncDefinitionContext ctx) {
        String funcName = ctx.VARIABLE().getText();
        if (functions.containsKey(funcName)) {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Function " + funcName + " already declared!");
            return new Value(1);
        }
        
        Value.ValueType returnType;
        if (ctx.varType() == null) returnType = null;
        else if (ctx.varType().BOOL() != null) returnType = Value.ValueType.BOOL;
        else if (ctx.varType().INT() != null) returnType = Value.ValueType.INT;
        else if (ctx.varType().STRING() != null) returnType = Value.ValueType.STRING;
        else if (ctx.varType().CHAR() != null) returnType = Value.ValueType.CHAR;
        else {
            System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Unknown type!");
            return new Value(1);
        }
        
        ArrayList<Pair<Value.ValueType, String>> parameters = new ArrayList<>();
        for (NewLogoParser.ArgumentContext arg : ctx.arguments().argument()) {
            NewLogoParser.VarTypeContext varType = arg.varType();
            if (varType.BOOL() != null) parameters.add(new Pair<>(Value.ValueType.BOOL, arg.variable().getText()));
            else if (varType.INT() != null) parameters.add(new Pair<>(Value.ValueType.INT, arg.variable().getText()));
            else if (varType.STRING() != null) parameters.add(new Pair<>(Value.ValueType.STRING, arg.variable().getText()));
            else if (varType.CHAR() != null) parameters.add(new Pair<>(Value.ValueType.CHAR, arg.variable().getText()));
            else {
                System.err.println(ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " - Unknown type!");
                return new Value(1);
            }
        }
        
        functions.put(funcName, new Func(ctx.statementBlock(), returnType, parameters));
        
        return new Value(0);
    }
    
    public Value callFunction(String funcName, List<Value> arguments) {
        Func func = functions.get(funcName);
        if (func == null) {
            System.err.println("Function " + funcName + " not declared!");
            return new Value(0);
        }
        
        if (func.getParameters().size() != arguments.size()) {
            System.err.println("Invalid number of arguments for function " + funcName);
            return new Value(0);
        }
        
        variables.push(new Hashtable<>());
        for (int i = 0; i < arguments.size(); i++) {
            if (func.getParameters().get(i).a != arguments.get(i).getType()) {
                System.err.println("Invalid type for argument " + func.getParameters().get(i).b);
                return new Value(0);
            }
            variables.peek().put(func.getParameters().get(i).b, arguments.get(i));
        }
        
        Value result = null;
        
        try {
            for(NewLogoParser.StatementContext statement : func.getBlock().statement()) {
                statement.accept(this);
            }
        }
        catch (ReturnException e) {
            result = e.getReturnValue();
        }
        
        variables.pop();
        
        if (func.getReturnType() == null) {
            if (result != null) {
                System.err.println("Void function " + funcName + " cannot return a value!");
            }
            return new Value(0);
        }
        
        if (result == null) {
            System.err.println("No return statement in function " + funcName);
        }
        else if (result.getType() != func.getReturnType()) {
            System.err.println("Invalid return type for function " + funcName);
            return null;
        }
        
        return result;
    }

    @Override
    public Value visitReturnStatement(NewLogoParser.ReturnStatementContext ctx) {
        if (ctx.value() == null) {
            throw new ReturnException(null);
        }
        Value value = ctx.value().accept(this);
        throw new ReturnException(value);
    }

    @Override
    public Value visitBreakStatement(NewLogoParser.BreakStatementContext ctx) {
        throw new BreakException();
    }
}
