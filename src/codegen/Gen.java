package codegen;

import ast.Operator;
import codegen.block.Block;
import codegen.translate.Instr;
import ir.Code;
import ir.tac.OpCode;
import ir.tac.TAC;

import java.util.*;

public class Gen
{
    public List<Instr> instrList;
    public Map<String, Integer> look;
    public int width;

    public Gen(Code code)
    {
        this.instrList = new ArrayList<>();
        this.look = new HashMap<>();
        this.width = 0;

        this.address(code);
        this.run(code);
    }

    private void address(Code code)
    {
        for (TAC instr : code.lines)
        {
            this.width += Gen.getWidth(instr.opCode);

            if (instr.opCode == OpCode.LABEL)
            {
                this.look.put(instr.op1.id, this.width);
            }
        }
    }

    private void run(Code code)
    {
        for (TAC line : code.lines)
        {

        }
    }

    // AUXILIARY

    public static int getWidth(OpCode opCode)
    {
        return switch (opCode)
        {
            case ADDF -> 2;
            case SUBF -> 3;
            case BLTF, BGTF, BLEF, BGEF, BEQF, BNEF -> 6;
            default -> 1;
        };
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for (Instr instr : this.instrList)
        {
            sb.append(instr.toString()).append("\n");
        }

        return sb.toString();
    }
}
