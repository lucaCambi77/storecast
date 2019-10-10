/**
 * 
 */
package de.storecast.gildedRose.item;

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

    }

}
