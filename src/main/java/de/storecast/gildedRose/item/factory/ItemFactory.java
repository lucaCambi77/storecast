/**
 * 
 */
package de.storecast.gildedRose.item;

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
                break;
        }
        return null;
    }
}
