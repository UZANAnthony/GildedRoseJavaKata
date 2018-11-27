package edu.insightr.gildedrose;

public class UpperQult implements Strategy {
    @Override
    public void update(Item i){
        i.setQuality(i.getQuality() + 1);
    }
}
