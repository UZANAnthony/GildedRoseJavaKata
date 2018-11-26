package edu.insightr.gildedrose;

public abstract class Conjured extends Item implements IVisitable{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
