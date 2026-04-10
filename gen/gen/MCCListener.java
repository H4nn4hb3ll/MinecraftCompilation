// Generated from src/MCC.g4 by ANTLR 4.9.3
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MCCParser}.
 */
public interface MCCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MCCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MCCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MCCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MCCParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MCCParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(MCCParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(MCCParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(MCCParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(MCCParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MCCParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MCCParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MCCParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MCCParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MCCParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MCCParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MCCParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MCCParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MCCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MCCParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MCCParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MCCParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(MCCParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(MCCParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#cmdStmt}.
	 * @param ctx the parse tree
	 */
	void enterCmdStmt(MCCParser.CmdStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#cmdStmt}.
	 * @param ctx the parse tree
	 */
	void exitCmdStmt(MCCParser.CmdStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(MCCParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(MCCParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#branchStmt}.
	 * @param ctx the parse tree
	 */
	void enterBranchStmt(MCCParser.BranchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#branchStmt}.
	 * @param ctx the parse tree
	 */
	void exitBranchStmt(MCCParser.BranchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(MCCParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(MCCParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(MCCParser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(MCCParser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(MCCParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(MCCParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MCCParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MCCParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(MCCParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(MCCParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(MCCParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(MCCParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#contStmt}.
	 * @param ctx the parse tree
	 */
	void enterContStmt(MCCParser.ContStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#contStmt}.
	 * @param ctx the parse tree
	 */
	void exitContStmt(MCCParser.ContStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(MCCParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(MCCParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#fStr}.
	 * @param ctx the parse tree
	 */
	void enterFStr(MCCParser.FStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#fStr}.
	 * @param ctx the parse tree
	 */
	void exitFStr(MCCParser.FStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#fStrVal}.
	 * @param ctx the parse tree
	 */
	void enterFStrVal(MCCParser.FStrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#fStrVal}.
	 * @param ctx the parse tree
	 */
	void exitFStrVal(MCCParser.FStrValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MCCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MCCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MCCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MCCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MCCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MCCParser.FactorContext ctx);
}