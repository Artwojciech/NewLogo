import DrawingTools.DrawingPanel;
import antlr.NewLogoParser;
import antlr.NewLogoParserBaseVisitor;

import java.awt.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;

public class Visitor extends NewLogoParserBaseVisitor<Value> {
    DrawingPanel panel;
    Hashtable<String, Value> variables = new Hashtable<>();

    @Override
    public Value visitProgram(NewLogoParser.ProgramContext ctx) {
        panel = DrawingPanel.createPanel(800, 600);
        visitChildren(ctx);
        return new Value(0);
    }

    @Override
    public Value visitAtom(NewLogoParser.AtomContext ctx) {
        return new Value(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Value visitValue(NewLogoParser.ValueContext ctx) {
        if(ctx.STRING_CONST() != null) {
            String argument = ctx.getText();
            argument = argument.substring(1, argument.length()-1);
            return new Value(argument);
        }
        else if (ctx.CHAR_CONST() != null) {
            String argument = ctx.getText();
            return new Value(argument.charAt(1));
        }
        else {
            return visitChildren(ctx);
        }
    }

    @Override
    public Value visitVariable(NewLogoParser.VariableContext ctx) {
        return variables.get(ctx.getText());
    }

    @Override
    public Value visitVarDeclaration(NewLogoParser.VarDeclarationContext ctx) {
        String varName = ctx.variable().getText();
        Value value = ctx.value().accept(this);
        if(variables.containsKey(varName)) {
            System.err.println("Variable " + varName + " already declared!");
            return new Value(0);
        }
        variables.put(varName, value);
        return value;
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
                Value.multiply(next, new Value(-1));
            }
            result = Value.add(result, next);
        }
        return result;
    }

    @Override
    public Value visitMulExpression(NewLogoParser.MulExpressionContext ctx) {
        Value result = ctx.getChild(0).accept(this);
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            Value next = ctx.getChild(i + 1).accept(this);
            if (Objects.equals(ctx.getChild(i).accept(this), new Value(-1))) {
                Value.multiply(next, new Value(-1));
            }
            result = Value.multiply(result, next);
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
            return drawingFunction(ctx.function().drawingFunction(), arguments.getFirst());
        }
        
        return new Value(0);
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
                System.err.println("Invalid color!");
            }
            panel.linecol(color);
        }
        else if (ctx.CHANGEBG() != null) {
            Color color = null;
            try {
                color = (Color) Color.class.getField(argument.getString()).get(null);
            } catch (Exception e) {
                System.err.println("Invalid color!");
            }
            panel.changebg(color);
        }
        else if (ctx.LINEWIDTH() != null) {
            panel.linewidth(argument.getInt());
        }
        else if (ctx.ISBORDER() != null) {
            return new Value(panel.isBorder());
        }
        else if (ctx.PRINT() != null) {
            System.out.println(argument.getValue());
        }
        else return new Value(1);
        return new Value(0);
    }
}
