package codegen.translate.io;

import codegen.Translate;
import codegen.block.Chain;
import codegen.block.Impulse;
import codegen.translate.Instr;
import ir.tac.Operand;
import ir.tac.TAC;

import java.util.ArrayList;

public class FORMAT extends Instr
{
    public FORMAT(int row, TAC instr)
    {
        this.blocks = new ArrayList<>();

        // APPEND PARTS TO DATA ARRAY

        String append = "data modify storage format data append from storage mem ";

        this.blocks.add(new Impulse(row, 0, append + instr.args.getFirst().id));

        for (int i = 1; i < instr.args.size(); i++)
        {
            this.blocks.add(new Chain(row, i, append + instr.args.get(i).id));
        }

        // WRITE TO SIGN

        String sign = "setblock ~ ~1 ~ oak_sign{front_text:{messages:[" +
                "'{\\\"storage\\\":\\\"format\\\",\\\"nbt\\\":\\\"data[].value\\\",\\\"separator\\\":\\\"\\\"}'" +
                ",'{\\\"text\\\":\\\"\\\"}'" +
                ",'{\\\"text\\\":\\\"\\\"}'" +
                ",'{\\\"text\\\":\\\"\\\"}']}} destroy";

        this.blocks.add(new Chain(row, this.blocks.size(), sign));

        // SUMMON STAND

        String stand = "summon armor_stand ~ ~1 ~ {Tags:[\\\"format\\\"]" +
                ",Invisible:1b,Invulnerable:1b,NoGravity:1b}";

        this.blocks.add(new Chain(row, this.blocks.size(), stand));

        // SET CUSTOM NAME

        String name = "data modify entity @e[tag=format,limit=1,sort=nearest] CustomName" +
                " set from block ~ ~1 ~-2 front_text.messages[0]";

        this.blocks.add(new Chain(row, this.blocks.size(), name));

        // REMOVE SIGN

        this.blocks.add(new Chain(row, this.blocks.size(), "setblock ~ ~1 ~-3 air"));

        // ENCHANT FLATTENING

        String enchant = "enchant @e[tag=format,limit=1,sort=nearest] mending 1";

        this.blocks.add(new Chain(row, this.blocks.size(), enchant));

        // GET LAST OUTPUT

        String last = "data modify storage format result set from block ~ ~ ~-1 LastOutput";

        this.blocks.add(new Chain(row, this.blocks.size(), last));

        // TRIM

        String trim = "data modify storage format result set string storage format result 108 -21";

        this.blocks.add(new Chain(row, this.blocks.size(), trim));

        // SAVE

        String save = "data modify storage mem " + instr.op1.id + ".value" +
                " set from storage format result";

        this.blocks.add(new Chain(row, this.blocks.size(), save));

        // REMOVE STAND

        this.blocks.add(new Chain(row, this.blocks.size(), "kill @e[tag=format]"));

        // CLEAR DATA ARRAY

        this.blocks.add(new Chain(row, this.blocks.size(), "data remove storage format data"));

        // NEXT INSTR

        this.blocks.addAll(Translate.nextInstr(row, this.blocks.size()));
    }
}
