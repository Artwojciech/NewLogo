// Generated from C:/Users/macie/OneDrive/Dokumenty/kompilatory/NewLogo/antlr/NewLogoParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NewLogoParser}.
 */
public interface NewLogoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NewLogoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NewLogoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#sumOp}.
	 * @param ctx the parse tree
	 */
	void enterSumOp(NewLogoParser.SumOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#sumOp}.
	 * @param ctx the parse tree
	 */
	void exitSumOp(NewLogoParser.SumOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(NewLogoParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(NewLogoParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(NewLogoParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(NewLogoParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#brExpression}.
	 * @param ctx the parse tree
	 */
	void enterBrExpression(NewLogoParser.BrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#brExpression}.
	 * @param ctx the parse tree
	 */
	void exitBrExpression(NewLogoParser.BrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(NewLogoParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(NewLogoParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(NewLogoParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(NewLogoParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(NewLogoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(NewLogoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(NewLogoParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(NewLogoParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(NewLogoParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(NewLogoParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#compVal}.
	 * @param ctx the parse tree
	 */
	void enterCompVal(NewLogoParser.CompValContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#compVal}.
	 * @param ctx the parse tree
	 */
	void exitCompVal(NewLogoParser.CompValContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#compExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpression(NewLogoParser.CompExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#compExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpression(NewLogoParser.CompExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#logicBrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicBrExpression(NewLogoParser.LogicBrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#logicBrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicBrExpression(NewLogoParser.LogicBrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#logicAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndExpression(NewLogoParser.LogicAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#logicAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndExpression(NewLogoParser.LogicAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(NewLogoParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(NewLogoParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(NewLogoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(NewLogoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(NewLogoParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(NewLogoParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(NewLogoParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(NewLogoParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(NewLogoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(NewLogoParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#selfOp}.
	 * @param ctx the parse tree
	 */
	void enterSelfOp(NewLogoParser.SelfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#selfOp}.
	 * @param ctx the parse tree
	 */
	void exitSelfOp(NewLogoParser.SelfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(NewLogoParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(NewLogoParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#varSelfOp}.
	 * @param ctx the parse tree
	 */
	void enterVarSelfOp(NewLogoParser.VarSelfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#varSelfOp}.
	 * @param ctx the parse tree
	 */
	void exitVarSelfOp(NewLogoParser.VarSelfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#incOrDec}.
	 * @param ctx the parse tree
	 */
	void enterIncOrDec(NewLogoParser.IncOrDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#incOrDec}.
	 * @param ctx the parse tree
	 */
	void exitIncOrDec(NewLogoParser.IncOrDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#varIncrement}.
	 * @param ctx the parse tree
	 */
	void enterVarIncrement(NewLogoParser.VarIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#varIncrement}.
	 * @param ctx the parse tree
	 */
	void exitVarIncrement(NewLogoParser.VarIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(NewLogoParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(NewLogoParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(NewLogoParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(NewLogoParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(NewLogoParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(NewLogoParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#drawingFunction}.
	 * @param ctx the parse tree
	 */
	void enterDrawingFunction(NewLogoParser.DrawingFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#drawingFunction}.
	 * @param ctx the parse tree
	 */
	void exitDrawingFunction(NewLogoParser.DrawingFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(NewLogoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(NewLogoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void enterCallArguments(NewLogoParser.CallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void exitCallArguments(NewLogoParser.CallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(NewLogoParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(NewLogoParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NewLogoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NewLogoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(NewLogoParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(NewLogoParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(NewLogoParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(NewLogoParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(NewLogoParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(NewLogoParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#repeatLoop}.
	 * @param ctx the parse tree
	 */
	void enterRepeatLoop(NewLogoParser.RepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#repeatLoop}.
	 * @param ctx the parse tree
	 */
	void exitRepeatLoop(NewLogoParser.RepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(NewLogoParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(NewLogoParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(NewLogoParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(NewLogoParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewLogoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(NewLogoParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewLogoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(NewLogoParser.ReturnStatementContext ctx);
}