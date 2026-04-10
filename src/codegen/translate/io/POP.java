package codegen.translate.io;

import codegen.Translate;
import codegen.block.Chain;
import codegen.block.Impulse;
import codegen.translate.Instr;
import ir.tac.TAC;

import java.util.ArrayList;

public class POP extends Instr
{
    public POP(int row, TAC instr)
    {
        this.blocks = new ArrayList<>();

        // POP TO EACH VAR FROM STACK

        String modify = "data modify storage mem ";
        String from = " set from storage stack data[-1]";
        String remove = "data remove storage stack data[-1]";

        this.blocks.add(new Impulse(row, 0, modify + instr.args.getFirst().id + from));
        this.blocks.add(new Chain(row, this.blocks.size(), remove));

        for (int i = 1; i < instr.args.size(); i++)
        {
            this.blocks.add(new Chain(row, this.blocks.size(), modify + instr.args.get(i).id + from));
            this.blocks.add(new Chain(row, this.blocks.size(), remove));
        }

        // NEXT INSTR

        this.blocks.addAll(Translate.nextInstr(row, this.blocks.size()));
    }
}
