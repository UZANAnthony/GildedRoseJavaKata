package edu.insightr.gildedrose;

public class QltBackstage implements Strategy{
    public void update(Item i){
        if (i.getQuality() < 50) {
            if (i.getSellIn() < 11) {
                if (i.getQuality() < 50) {
                    i.setQuality(i.getQuality() + 2);
                }
            }
            if (i.getSellIn() < 6) {
                if (i.getQuality() < 50) {
                    i.setQuality(i.getQuality() + 1);
                }
            }
            if (i.getSellIn() < 0){//ADD
                i.setQuality(0);
            }
        }
    }
}
