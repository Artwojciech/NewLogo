// Generated from C:/Users/macie/OneDrive/Dokumenty/kompilatory/NewLogo/antlr/NewLogoParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NewLogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NewLogoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NewLogoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#sumOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOp(NewLogoParser.SumOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(NewLogoParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(NewLogoParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#brExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrExpression(NewLogoParser.BrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(NewLogoParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(NewLogoParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(NewLogoParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(NewLogoParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#compExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpression(NewLogoParser.CompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#logicOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(NewLogoParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#logicBrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicBrExpression(NewLogoParser.LogicBrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(NewLogoParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(NewLogoParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(NewLogoParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(NewLogoParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#selfOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfOp(NewLogoParser.SelfOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(NewLogoParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#incOrDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncOrDec(NewLogoParser.IncOrDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#varIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIncrement(NewLogoParser.VarIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(NewLogoParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(NewLogoParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#funcDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(NewLogoParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#drawingFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawingFunction(NewLogoParser.DrawingFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(NewLogoParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#callArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArguments(NewLogoParser.CallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(NewLogoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NewLogoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(NewLogoParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(NewLogoParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(NewLogoParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(NewLogoParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewLogoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(NewLogoParser.PrintStatementContext ctx);
}