package codegen.translate.structure;

import codegen.Translate;
import codegen.translate.Instr;

public class LABEL extends Instr
{
    public LABEL(int row)
    {
        this.blocks = Translate.nextInstr(row, 0);
    }
}
