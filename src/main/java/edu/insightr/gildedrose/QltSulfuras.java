package edu.insightr.gildedrose;

public class QltSulfuras implements Strategy{
    public void update(Item i){
        i.setQuality(80);
        i.setSellIn(0);
    }
}
