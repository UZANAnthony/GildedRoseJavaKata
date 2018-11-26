package edu.insightr.gildedrose;

public abstract class Sulfuras extends Item implements IVisitable{
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
