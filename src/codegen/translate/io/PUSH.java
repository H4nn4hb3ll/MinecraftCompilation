package codegen.translate.io;

import codegen.Translate;
import codegen.block.Chain;
import codegen.block.Impulse;
import codegen.translate.Instr;
import ir.tac.TAC;

import java.util.ArrayList;

public class PUSH extends Instr
{
    public PUSH(int row, TAC instr)
    {
        this.blocks = new ArrayList<>();

        // PUSH EACH ITEM TO STACK

        String push = "data modify storage stack data append from storage mem ";

        this.blocks.add(new Impulse(row, 0, push + instr.args.getFirst().id));

        for (int i = 1; i < instr.args.size(); i++)
        {
            this.blocks.add(new Chain(row, i, push + instr.args.get(i).id));
        }

        // NEXT INSTR

        this.blocks.addAll(Translate.nextInstr(row, this.blocks.size()));
    }
}
