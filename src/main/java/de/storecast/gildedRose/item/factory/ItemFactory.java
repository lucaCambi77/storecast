/**
 * 
 */
package de.storecast.gildedRose.item.factory;

import de.storecast.gildedRose.item.AgedBrie;
import de.storecast.gildedRose.item.BackstagePassesToConcert;
import de.storecast.gildedRose.item.Conjured;
import de.storecast.gildedRose.item.DefaultItem;
import de.storecast.gildedRose.item.Item;
import de.storecast.gildedRose.item.Sulfuras;
import de.storecast.gildedRose.item.enums.ItemEnum;

/**
 * @author luca
 *
 */
public class ItemFactory
{

    public Items createItem(ItemEnum item, int sellIn, int quality)
    {
        switch (item)
        {
            case AGED_BRIE:

                return new AgedBrie(new Item(item.getDescription(), sellIn, quality));

            case SULFURAS:
                return new Sulfuras(new Item(item.getDescription(), sellIn, quality));

            case BACKSTAGE_PASSES_TO_CONCERT:
                return new BackstagePassesToConcert(new Item(item.getDescription(), sellIn, quality));

            case CONJURED:
                return new Conjured(new Item(item.getDescription(), sellIn, quality));

            default:
                return new DefaultItem(new Item(item.getDescription(), sellIn, quality));
        }
    }
}
