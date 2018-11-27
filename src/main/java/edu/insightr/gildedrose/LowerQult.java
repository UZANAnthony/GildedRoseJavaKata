package edu.insightr.gildedrose;

public class LowerQult implements Strategy{
    @Override
    public void update(Item i){
        i.setQuality(i.getQuality() - 1);
    }
}
