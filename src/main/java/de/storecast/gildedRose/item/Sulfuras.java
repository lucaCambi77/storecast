/**
 * 
 */
package de.storecast.gildedRose.item;

import de.storecast.gildedRose.item.factory.Items;

/**
 * @author luca
 *
 */
public class Sulfuras extends Items
{

    /**
     * @param item
     */
    public Sulfuras(Item item)
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

    }

    @Override
    public void incrementQuality()
    {

    }

    @Override
    public void decrementQuality()
    {

    }

    @Override
    public void updateQuality()
    {
        if (getItem().quality != SULFURAS_QUALITY)
            throw new IllegalArgumentException("Sulfuras quality should be 80!");

    }

}
