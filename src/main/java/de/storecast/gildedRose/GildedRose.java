package de.storecast.gildedRose;

import de.storecast.gildedRose.item.Item;

class GildedRose {
    Item[] items;

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";

    public static final int MAX_QUALITY = 50;
    public static final int SULFURAS_QUALITY = 80;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public GildedRose() {}

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        for (Item item : items) {
            String itemName = item.name;
            // We don't need to modify SULFURAS, just check that quality is 80
            if(itemName.equals(SULFURAS)) {
                if(item.quality != SULFURAS_QUALITY) {
                    throw new IllegalArgumentException("Sulfuras quality should be 80!");
                }
            } else {
                item.sellIn--;
                if (itemName.equals(AGED_BRIE)) {
                    incrementQuality(item);
                } else if (itemName.equals(BACKSTAGE_PASSES_TO_CONCERT)) {
                    processBackstagePassedToConcert(item);
                } else {
                    decrementQuality(item);
                }
            }
        }
    }

    /**
     * Contains logic for 'Backstage passes to a TAFKAL80ETC concert' processing
     * @param item
     */
    private void processBackstagePassedToConcert(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            incrementQuality(item);
            if (item.sellIn < 10) incrementQuality(item);
            if (item.sellIn < 5) incrementQuality(item);
        }
    }

    /**
     * Increments quality if it's possible
     * @param item
     */
    private void incrementQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
            if (item.quality < MAX_QUALITY && item.sellIn < 0) {
                item.quality++;
            }
        }
    }

    /**
     * Decrements quality if it's possible
     * @param item
     */
    private void decrementQuality(Item item) {
        if(item.quality > 0) {
            item.quality--;
            if (item.quality > 0 && item.sellIn < 0) {
                item.quality--;
            }
        }
    }
}
