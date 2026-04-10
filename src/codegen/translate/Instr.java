package codegen.translate;

import codegen.block.Block;

import java.util.List;

public abstract class Instr
{
    public List<Block> blocks;

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for (Block block : this.blocks)
        {
            sb.append(block.toString()).append("\n");
        }

        return sb.toString().trim();
    }
}
