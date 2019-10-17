/**
 * 
 */
package de.storecast.gildedRose.item;

/**
 * @author luca
 *
 */
public abstract class Items
{

    private Item item;
    private boolean canSell = false;
    public static final int MAX_QUALITY = 50;
    public static final int SULFURAS_QUALITY = 80;

    /**
     * 
     */
    public Items(Item item)
    {
        this.item = item;
    }

    public Item getItem()
    {
        return item;
    };

    public boolean canSell()
    {
        return canSell;
    };

    public void processBackstagePassedToConcert()
    {
        if (item.sellIn < 0)
        {
            item.quality = 0;
        }
        else
        {
            incrementQuality();
            if (item.sellIn < 10)
                incrementQuality();
            if (item.sellIn < 5)
                incrementQuality();
        }
    };

    public void incrementQuality()
    {
        if (getItem().quality < MAX_QUALITY)
        {
            getItem().quality++;
            if (getItem().quality < MAX_QUALITY && getItem().sellIn < 0)
            {
                getItem().quality++;
            }
        }
    };

    public void decrementQuality()
    {

    };

    public void updateQuality()
    {
        item.sellIn--;
    };
}
