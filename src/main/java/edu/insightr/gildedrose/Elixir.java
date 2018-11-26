package edu.insightr.gildedrose;

public abstract class Elixir extends Item implements IVisitable{
    public Elixir(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
