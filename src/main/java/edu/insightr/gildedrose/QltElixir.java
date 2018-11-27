package edu.insightr.gildedrose;

public class QltElixir implements Strategy{
    public void update(Item i){
        if(i.getQuality() > 0){
            i.setQuality(i.getQuality() - 1);
            if (i.getSellIn() < 0){
                i.setQuality(i.getQuality() - 1);
            }
        }
    }
}
