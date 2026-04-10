package codegen.translate.arithmetic.I;

import codegen.Translate;
import codegen.block.Chain;
import codegen.block.Impulse;
import codegen.translate.Instr;
import ir.tac.TAC;

import java.util.ArrayList;

public abstract class CalcI extends Instr
{
    public CalcI(int row, TAC instr, String op)
    {
        this.blocks = new ArrayList<>();

        // ADD SCOREBOARD

        this.blocks.add(new Impulse(row, 0, "scoreboard objectives add calc dummy"));

        // EXECUTE STORE

        this.blocks.add(new Chain(row, this.blocks.size(), "execute store result score a calc run data get storage mem " + instr.op2.id + ".value"));
        this.blocks.add(new Chain(row, this.blocks.size(), "execute store result score b calc run data get storage mem " + instr.op3.id + ".value"));

        // SCOREBOARD OPERATION

        this.blocks.add(new Chain(row, this.blocks.size(), "scoreboard players operation a calc " + op + " b calc"));

        // SAVE

        this.blocks.add(new Chain(row, this.blocks.size(), "execute store result storage mem " + instr.op1.id + ".value int 1 run scoreboard players get a calc"));

        // REMOVE SCOREBOARD

        this.blocks.add(new Chain(row, this.blocks.size(), "scoreboard objectives remove calc"));

        // NEXT INSTR

        this.blocks.addAll(Translate.nextInstr(row, this.blocks.size()));
    }
}
