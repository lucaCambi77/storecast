/**
 * 
 */
package de.storecast.gildedRose.item.enums;

/**
 * @author luca
 *
 */
public enum ItemEnum
{

    AGED_BRIE("Aged Brie"), BACKSTAGE_PASSES_TO_CONCERT("Backstage passes to a TAFKAL80ETC concert"), SULFURAS(
            "Sulfuras, Hand of Ragnaros"), CONJURED("Conjured"), DEFAULT("Default");

    private String description;

    ItemEnum(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
