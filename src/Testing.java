import codegen.translate.arithmetic.F.*;
import codegen.translate.branch.I.*;
import codegen.translate.io.STORE;
import ir.tac.OpCode;
import ir.tac.OpType;
import ir.tac.Operand;
import ir.tac.TAC;

import java.io.IOException;

public class Testing
{
    public static void main(String[] args) throws IOException
    {
        int row = 0;

        TAC instr = new TAC();
        instr.opCode = OpCode.DIVF;
        instr.op1 = new Operand(OpType.FLOAT, "$T0");
        instr.op2 = new Operand(OpType.FLOAT, "$T1");
        instr.op3 = new Operand(OpType.FLOAT, "$T2");

        DIVF mcfunction = new DIVF(row, instr);

        System.out.print(mcfunction);
    }
}
