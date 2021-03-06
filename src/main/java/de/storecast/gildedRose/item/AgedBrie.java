/**
 * 
 */
package de.storecast.gildedRose.item;

import de.storecast.gildedRose.item.factory.Items;

/**
 * @author luca
 *
 */
public class AgedBrie extends Items
{

    /**
     * @param item
     */
    public AgedBrie(Item item)
    {
        super(item);
    }

    @Override
    public boolean canSell()
    {
        return false;
    }

    @Override
    public void processBackstagePassedToConcert()
    {
        super.processBackstagePassedToConcert();

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
        incrementQuality();

    }

}
