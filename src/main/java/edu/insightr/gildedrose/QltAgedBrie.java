package edu.insightr.gildedrose;

public class QltAgedBrie implements Strategy{
    public void update(Item i){
        if (i.getQuality() < 50) {
            i.setQuality(i.getQuality() + 1);
        }
    }
}
