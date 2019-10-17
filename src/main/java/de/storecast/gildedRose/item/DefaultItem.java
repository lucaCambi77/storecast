/**
 * 
 */
package de.storecast.gildedRose.item;

import de.storecast.gildedRose.item.factory.Items;

/**
 * @author luca
 *
 */
public class DefaultItem extends Items
{

    /**
     * @param item
     */
    public DefaultItem(Item item)
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
        decrementQuality();

    }

}
