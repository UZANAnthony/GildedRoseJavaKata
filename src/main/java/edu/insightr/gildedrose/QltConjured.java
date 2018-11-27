package edu.insightr.gildedrose;

public class QltConjured implements Strategy{
    public void update(Item i){
        if(i.getQuality() > 0){
            i.setQuality(i.getQuality() - 2);
            if (i.getSellIn() < 0){
                i.setQuality(i.getQuality() - 1);
            }
        }
    }
}
