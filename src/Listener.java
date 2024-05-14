import antlr.NewLogoParser;
import antlr.NewLogoParserListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.transform.Source;

public class Listener implements NewLogoParserListener {

    @Override
    public void enterProgram(NewLogoParser.ProgramContext ctx) {
    }

    @Override
    public void exitProgram(NewLogoParser.ProgramContext ctx) {
        System.out.println("Program: " + ctx.getText());
    }

    @Override
    public void enterSumOp(NewLogoParser.SumOpContext ctx) {

    }

    @Override
    public void exitSumOp(NewLogoParser.SumOpContext ctx) {

    }

    @Override
    public void enterMulOp(NewLogoParser.MulOpContext ctx) {

    }

    @Override
    public void exitMulOp(NewLogoParser.MulOpContext ctx) {

    }

    @Override
    public void enterAtom(NewLogoParser.AtomContext ctx) {

    }

    @Override
    public void exitAtom(NewLogoParser.AtomContext ctx) {

    }

    @Override
    public void enterBrExpression(NewLogoParser.BrExpressionContext ctx) {

    }

    @Override
    public void exitBrExpression(NewLogoParser.BrExpressionContext ctx) {

    }

    @Override
    public void enterMulExpression(NewLogoParser.MulExpressionContext ctx) {

    }

    @Override
    public void exitMulExpression(NewLogoParser.MulExpressionContext ctx) {

    }

    @Override
    public void enterMathExpression(NewLogoParser.MathExpressionContext ctx) {

    }

    @Override
    public void exitMathExpression(NewLogoParser.MathExpressionContext ctx) {

    }

    @Override
    public void enterBoolConst(NewLogoParser.BoolConstContext ctx) {

    }

    @Override
    public void exitBoolConst(NewLogoParser.BoolConstContext ctx) {

    }

    @Override
    public void enterCompOp(NewLogoParser.CompOpContext ctx) {

    }

    @Override
    public void exitCompOp(NewLogoParser.CompOpContext ctx) {

    }

    @Override
    public void enterCompExpression(NewLogoParser.CompExpressionContext ctx) {

    }

    @Override
    public void exitCompExpression(NewLogoParser.CompExpressionContext ctx) {

    }

    @Override
    public void enterLogicOp(NewLogoParser.LogicOpContext ctx) {

    }

    @Override
    public void exitLogicOp(NewLogoParser.LogicOpContext ctx) {

    }

    @Override
    public void enterLogicBrExpression(NewLogoParser.LogicBrExpressionContext ctx) {

    }

    @Override
    public void exitLogicBrExpression(NewLogoParser.LogicBrExpressionContext ctx) {

    }

    @Override
    public void enterLogicExpression(NewLogoParser.LogicExpressionContext ctx) {

    }

    @Override
    public void exitLogicExpression(NewLogoParser.LogicExpressionContext ctx) {

    }

    @Override
    public void enterVarType(NewLogoParser.VarTypeContext ctx) {

    }

    @Override
    public void exitVarType(NewLogoParser.VarTypeContext ctx) {

    }

    @Override
    public void enterVarDeclaration(NewLogoParser.VarDeclarationContext ctx) {

    }

    @Override
    public void exitVarDeclaration(NewLogoParser.VarDeclarationContext ctx) {

    }

    @Override
    public void enterValue(NewLogoParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(NewLogoParser.ValueContext ctx) {

    }

    @Override
    public void enterSelfOp(NewLogoParser.SelfOpContext ctx) {

    }

    @Override
    public void exitSelfOp(NewLogoParser.SelfOpContext ctx) {

    }

    @Override
    public void enterVarAssign(NewLogoParser.VarAssignContext ctx) {

    }

    @Override
    public void exitVarAssign(NewLogoParser.VarAssignContext ctx) {

    }

    @Override
    public void enterIncOrDec(NewLogoParser.IncOrDecContext ctx) {

    }

    @Override
    public void exitIncOrDec(NewLogoParser.IncOrDecContext ctx) {

    }

    @Override
    public void enterVarIncrement(NewLogoParser.VarIncrementContext ctx) {

    }

    @Override
    public void exitVarIncrement(NewLogoParser.VarIncrementContext ctx) {

    }

    @Override
    public void enterArgument(NewLogoParser.ArgumentContext ctx) {

    }

    @Override
    public void exitArgument(NewLogoParser.ArgumentContext ctx) {

    }

    @Override
    public void enterArguments(NewLogoParser.ArgumentsContext ctx) {

    }

    @Override
    public void exitArguments(NewLogoParser.ArgumentsContext ctx) {

    }

    @Override
    public void enterFuncDefinition(NewLogoParser.FuncDefinitionContext ctx) {

    }

    @Override
    public void exitFuncDefinition(NewLogoParser.FuncDefinitionContext ctx) {

    }

    @Override
    public void enterDrawingFunction(NewLogoParser.DrawingFunctionContext ctx) {

    }

    @Override
    public void exitDrawingFunction(NewLogoParser.DrawingFunctionContext ctx) {

    }

    @Override
    public void enterFunction(NewLogoParser.FunctionContext ctx) {

    }

    @Override
    public void exitFunction(NewLogoParser.FunctionContext ctx) {

    }

    @Override
    public void enterCallArguments(NewLogoParser.CallArgumentsContext ctx) {

    }

    @Override
    public void exitCallArguments(NewLogoParser.CallArgumentsContext ctx) {

    }

    @Override
    public void enterFunctionCall(NewLogoParser.FunctionCallContext ctx) {

    }

    @Override
    public void exitFunctionCall(NewLogoParser.FunctionCallContext ctx) {

    }

    @Override
    public void enterStatement(NewLogoParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(NewLogoParser.StatementContext ctx) {

    }

    @Override
    public void enterConditionalStatement(NewLogoParser.ConditionalStatementContext ctx) {

    }

    @Override
    public void exitConditionalStatement(NewLogoParser.ConditionalStatementContext ctx) {

    }

    @Override
    public void enterLoopStatement(NewLogoParser.LoopStatementContext ctx) {

    }

    @Override
    public void exitLoopStatement(NewLogoParser.LoopStatementContext ctx) {

    }

    @Override
    public void enterBreakStatement(NewLogoParser.BreakStatementContext ctx) {

    }

    @Override
    public void exitBreakStatement(NewLogoParser.BreakStatementContext ctx) {

    }

    @Override
    public void enterReturnStatement(NewLogoParser.ReturnStatementContext ctx) {

    }

    @Override
    public void exitReturnStatement(NewLogoParser.ReturnStatementContext ctx) {

    }

    @Override
    public void enterPrintStatement(NewLogoParser.PrintStatementContext ctx) {

    }

    @Override
    public void exitPrintStatement(NewLogoParser.PrintStatementContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
