/**
 * 
 */
package de.storecast.gildedRose.item;

import de.storecast.gildedRose.item.factory.Items;

/**
 * @author luca
 *
 */
public class BackstagePassesToConcert extends Items
{

    /**
     * @param item
     */
    public BackstagePassesToConcert(Item item)
    {
        super(item);
    }

    @Override
    public boolean canSell()
    {
        return true;
    }

    @Override
    public void processBackstagePassedToConcert()
    {
        if (getItem().sellIn < 0)
        {
            getItem().quality = 0;
        }
        else
        {
            incrementQuality();
            if (getItem().sellIn < 10)
                incrementQuality();
            if (getItem().sellIn < 5)
                incrementQuality();
        }

    }

    @Override
    public void incrementQuality()
    {
        super.incrementQuality();

    }

    @Override
    public void decrementQuality()
    {
        super.decrementQuality();

    }

    @Override
    public void updateQuality()
    {
        super.updateQuality();
        processBackstagePassedToConcert();

    }

}
