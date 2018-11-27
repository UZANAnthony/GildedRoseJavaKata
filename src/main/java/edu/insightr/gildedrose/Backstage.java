package edu.insightr.gildedrose;

public class Backstage extends Item implements IVisitable{
    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
