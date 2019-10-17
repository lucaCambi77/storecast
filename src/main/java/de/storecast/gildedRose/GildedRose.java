package de.storecast.gildedRose;

import de.storecast.gildedRose.item.factory.Items;

public class GildedRose
{
    private Items[] items;


    public GildedRose(Items[] items)
    {
        this.items = items;
    }

    public GildedRose()
    {
    }

    public Items[] getItems()
    {
        return items;
    }

    public void updateQuality()
    {
        for (Items item : items)
            item.updateQuality();
    }

}
