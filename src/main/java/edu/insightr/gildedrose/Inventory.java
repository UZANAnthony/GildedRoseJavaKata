package edu.insightr.gildedrose;

public class Inventory {

    private Item[] items;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };

    }

    public Item[] getItems() {
        return this.items;
    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
            //System.out.println(item.getClass());
        }
        System.out.println("***************");
        System.out.println("\n");
    }

    public void updateQuality() {

        Context context1 = new Context(new QltDexterityVest());
        Context context2 = new Context(new QltAgedBrie());
        Context context3 = new Context(new QltElixir());
        Context context4 = new Context(new QltSulfuras());
        Context context5 = new Context(new QltBackstage());
        Context context6 = new Context(new QltConjured());

        context1.executeStrategy(items[0]);
        context2.executeStrategy(items[1]);
        context3.executeStrategy(items[2]);
        context4.executeStrategy(items[3]);
        context5.executeStrategy(items[4]);
        context6.executeStrategy(items[5]);


        /*for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != "Aged Brie"
                    && items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                if (items[i].getQuality() > 0) {
                    if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            } else {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);

                    if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }

                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }

                        if (items[i].getSellIn() < 0){//ADD
                            items[i].setQuality(0);
                        }
                    }
                }
            }

            if (items[i].getName() == "Sulfuras, Hand of Ragnaros") { //2 errors update
                items[i].setSellIn(items[i].getSellIn() - items[i].getSellIn());
            }

            if (items[i].getSellIn() < 0) {
                if (items[i].getName() != "Aged Brie") {
                    if (items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getQuality() > 0) {
                            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                                items[i].setQuality(items[i].getQuality() - 1);
                            }
                        }
                    } else {
                        items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }

            if(items[i].getName().indexOf("Conjured") != -1){   //ADD
                if(items[i].getQuality() > 0){
                    items[i].setQuality(items[i].getQuality() - 1);
                    if(items[i].getSellIn() < 0){
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            }
        }*/
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        for (int i = 0; i < 10; i++) {
            inventory.updateQuality();
            inventory.printInventory();
        }
    }
}
