/**
 * 
 */
package de.storecast.gildedRose.item;

/**
 * @author luca
 *
 */
public class Conjured extends Items
{

    /**
     * @param item
     */
    public Conjured(Item item)
    {
        super(item);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean canSell()
    {
        // TODO Auto-generated method stub
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
        // TODO Auto-generated method stub

    }

    @Override
    public void updateQuality()
    {
        // TODO Auto-generated method stub

    }

}
