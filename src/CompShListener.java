// Generated from CompSh.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompShParser}.
 */
public interface CompShListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompShParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CompShParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CompShParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CompShParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CompShParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CompShParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CompShParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CompShParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CompShParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CompShParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CompShParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CompShParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CompShParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(CompShParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(CompShParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#redirect}.
	 * @param ctx the parse tree
	 */
	void enterRedirect(CompShParser.RedirectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#redirect}.
	 * @param ctx the parse tree
	 */
	void exitRedirect(CompShParser.RedirectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CompShParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CompShParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#channel_selector}.
	 * @param ctx the parse tree
	 */
	void enterChannel_selector(CompShParser.Channel_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#channel_selector}.
	 * @param ctx the parse tree
	 */
	void exitChannel_selector(CompShParser.Channel_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#execute_cmd}.
	 * @param ctx the parse tree
	 */
	void enterExecute_cmd(CompShParser.Execute_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#execute_cmd}.
	 * @param ctx the parse tree
	 */
	void exitExecute_cmd(CompShParser.Execute_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#store_cmd}.
	 * @param ctx the parse tree
	 */
	void enterStore_cmd(CompShParser.Store_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#store_cmd}.
	 * @param ctx the parse tree
	 */
	void exitStore_cmd(CompShParser.Store_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#ish_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIsh_cmd(CompShParser.Ish_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#ish_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIsh_cmd(CompShParser.Ish_cmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CompShParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CompShParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(CompShParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(CompShParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(CompShParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(CompShParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(CompShParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(CompShParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(CompShParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(CompShParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReal(CompShParser.ExprRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReal(CompShParser.ExprRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(CompShParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(CompShParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(CompShParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRelational}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(CompShParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOr(CompShParser.ExprAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOr(CompShParser.ExprAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConvertType}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConvertType(CompShParser.ExprConvertTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConvertType}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConvertType(CompShParser.ExprConvertTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(CompShParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(CompShParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPar}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(CompShParser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPar}
	 * labeled alternative in {@link CompShParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(CompShParser.ExprParContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CompShParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CompShParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopUntil}
	 * labeled alternative in {@link CompShParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopUntil(CompShParser.LoopUntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopUntil}
	 * labeled alternative in {@link CompShParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopUntil(CompShParser.LoopUntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopWhile}
	 * labeled alternative in {@link CompShParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopWhile(CompShParser.LoopWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopWhile}
	 * labeled alternative in {@link CompShParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopWhile(CompShParser.LoopWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopWhileDo}
	 * labeled alternative in {@link CompShParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopWhileDo(CompShParser.LoopWhileDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopWhileDo}
	 * labeled alternative in {@link CompShParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopWhileDo(CompShParser.LoopWhileDoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompShParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(CompShParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompShParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(CompShParser.Expr_listContext ctx);
}