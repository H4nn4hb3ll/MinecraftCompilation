// Generated from src/MCC.g4 by ANTLR 4.9.3
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MCCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MCCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MCCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MCCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MCCParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(MCCParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(MCCParser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(MCCParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MCCParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MCCParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MCCParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MCCParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MCCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(MCCParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#cmdStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdStmt(MCCParser.CmdStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(MCCParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#branchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchStmt(MCCParser.BranchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(MCCParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(MCCParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(MCCParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MCCParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(MCCParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#retStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(MCCParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#contStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContStmt(MCCParser.ContStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MCCParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#fStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStr(MCCParser.FStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#fStrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStrVal(MCCParser.FStrValContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MCCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MCCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MCCParser.FactorContext ctx);
}