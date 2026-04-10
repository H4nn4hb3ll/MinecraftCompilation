package ir.tac;

public class Operand
{
    public OpType type;
    public OpType.Meta meta;
    public String id;

    public Operand(OpType type, OpType.Meta meta, String id)
    {
        this.type = type;
        this.meta = meta;
        this.id = id;
    }

    public Operand(OpType type, String id)
    {
        this.type = type;
        this.meta = OpType.Meta.VAR;
        this.id = id;
    }

    public Operand(String id)
    {
        this.id = id;
        this.meta = OpType.Meta.VAR;
    }

    @Override
    public String toString()
    {
        return this.id;
    }
}
