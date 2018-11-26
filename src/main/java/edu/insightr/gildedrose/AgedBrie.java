package edu.insightr.gildedrose;

public abstract class AgedBrie extends Item implements IVisitable{

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
