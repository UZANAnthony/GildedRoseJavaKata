package edu.insightr.gildedrose;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(Item i){
        strategy.update(i);
    }
}
