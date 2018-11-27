package edu.insightr.gildedrose;

public class DextirityVest extends Item implements IVisitable{
    public DextirityVest(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
