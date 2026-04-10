import ast.AST;
import ast.ProgramNode;
import ir.IR;
import semantic.SymbolTableBuilder;
import util.File;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import gen.MCCLexer;
import gen.MCCParser;

import java.io.IOException;

public class Driver
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Minecraft Command Compiler TESTING!");
        String source = File.read("./src/testing/test1/code.mcc");
        CharStream input = CharStreams.fromString(source);

        MCCLexer lexer = new MCCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MCCParser parser = new MCCParser(tokens);

        ParseTree tree = parser.program();
        ProgramNode prog = (ProgramNode) new AST().visit(tree);
        File.write(prog.toString(), "./src/testing/test1/code.ast");

        SymbolTableBuilder stb = new SymbolTableBuilder(prog);
        stb.resolve();
        File.write(stb.toString(),"./src/testing/test1/code.sym");

        IR ir = new IR(prog, stb);
        File.write(ir.toString(), "./src/testing/test1/code.ir");
    }
}