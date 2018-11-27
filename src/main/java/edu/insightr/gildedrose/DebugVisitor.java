package edu.insightr.gildedrose;

interface IVisitor{
    void visit(IVisitable o);
    void visit(AgedBrie o);
    void visit(Backstage o);
    void visit(Conjured o);
    void visit(DextirityVest o);
    void visit(Elixir o);
    void visit(Sulfuras o);
}

public class DebugVisitor implements IVisitor{

    public void visit(AgedBrie o){
        if (o.getQuality() < 50) {
            o.setQuality(o.getQuality() + 1);
        }
    }

    public void visit(Backstage o){
        if (o.getQuality() < 50) {
            if (o.getSellIn() < 11) {
                if (o.getQuality() < 50) {
                    o.setQuality(o.getQuality() + 1);
                }
            }
            if (o.getSellIn() < 6) {
                if (o.getQuality() < 50) {
                    o.setQuality(o.getQuality() + 1);
                }
            }
            if (o.getSellIn() < 0){//ADD
                o.setQuality(0);
            }
        }
    }

    public void visit(Conjured o){
        if(o.getQuality() > 0){
            o.setQuality(o.getQuality() - 2);
            if (o.getSellIn() < 0){
                o.setQuality(o.getQuality() - 1);
            }
        }
    }

    public void visit(DextirityVest o){
        if(o.getQuality() > 0){
            o.setQuality(o.getQuality() - 1);
            if (o.getSellIn() < 0){
                o.setQuality(o.getQuality() - 1);
            }
        }
    }

    public void visit(Elixir o){
        if(o.getQuality() > 0){
            o.setQuality(o.getQuality() - 1);
            if (o.getSellIn() < 0){
                o.setQuality(o.getQuality() - 1);
            }
        }
    }

    public void visit(Sulfuras o){
        o.setSellIn(o.getSellIn() - o.getSellIn());
    }

    public void visit(IVisitable o){
        System.out.println("Test");
    }

}


