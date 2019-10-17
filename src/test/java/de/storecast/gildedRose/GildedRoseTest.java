package de.storecast.gildedRose;

import org.junit.Assert;
import org.junit.Test;

import de.storecast.gildedRose.item.enums.ItemEnum;
import de.storecast.gildedRose.item.factory.ItemFactory;
import de.storecast.gildedRose.item.factory.Items;

/**
 * Created by Unicorn on 30.03.2017.
 */
public class GildedRoseTest
{

    private ItemFactory factory = new ItemFactory();

    @Test
    public void testUpdateQualityBackstage()
    {
        Items backStage = factory.createItem(ItemEnum.BACKSTAGE_PASSES_TO_CONCERT, 7, 0);

        GildedRose gildedRose = new GildedRose(new Items[] { backStage });
        gildedRose.updateQuality();

        Assert.assertEquals(6, backStage.getItem().sellIn);
        Assert.assertEquals(2, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(5, backStage.getItem().sellIn);
        Assert.assertEquals(4, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(4, backStage.getItem().sellIn);
        Assert.assertEquals(7, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(3, backStage.getItem().sellIn);
        Assert.assertEquals(10, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(2, backStage.getItem().sellIn);
        Assert.assertEquals(13, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(1, backStage.getItem().sellIn);
        Assert.assertEquals(16, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(0, backStage.getItem().sellIn);
        Assert.assertEquals(19, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-1, backStage.getItem().sellIn);
        Assert.assertEquals(0, backStage.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-2, backStage.getItem().sellIn);
        Assert.assertEquals(0, backStage.getItem().quality);
    }

    @Test
    public void testUpdateQualityAgedBrie()
    {
        Items agedBrie = factory.createItem(ItemEnum.AGED_BRIE, 6, 0);

        GildedRose gildedRose = new GildedRose(new Items[] { agedBrie });

        Assert.assertEquals(6, agedBrie.getItem().sellIn);
        Assert.assertEquals(0, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(5, agedBrie.getItem().sellIn);
        Assert.assertEquals(1, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(4, agedBrie.getItem().sellIn);
        Assert.assertEquals(2, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(3, agedBrie.getItem().sellIn);
        Assert.assertEquals(3, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(2, agedBrie.getItem().sellIn);
        Assert.assertEquals(4, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(1, agedBrie.getItem().sellIn);
        Assert.assertEquals(5, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(0, agedBrie.getItem().sellIn);
        Assert.assertEquals(6, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-1, agedBrie.getItem().sellIn);
        Assert.assertEquals(8, agedBrie.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-2, agedBrie.getItem().sellIn);
        Assert.assertEquals(10, agedBrie.getItem().quality);
    }

    @Test
    public void testUpdateQualitySulfuras()
    {
        Items sulfuras = factory.createItem(ItemEnum.SULFURAS, 5, Items.SULFURAS_QUALITY);

        GildedRose gildedRose = new GildedRose(new Items[] { sulfuras });

        for (int i = 0; i < 3; i++)
        {
            gildedRose.updateQuality();
            Assert.assertEquals(5, sulfuras.getItem().sellIn);
            Assert.assertEquals(Items.SULFURAS_QUALITY, sulfuras.getItem().quality);
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateQualitySulfurasWrongQuality()
    {
        Items sulfuras = factory.createItem(ItemEnum.SULFURAS, 0, 0);

        GildedRose gildedRose = new GildedRose(new Items[] { sulfuras });
        gildedRose.updateQuality();
    }

    @Test
    public void testUpdateQualityCustom()
    {
        Items testItem = factory.createItem(ItemEnum.DEFAULT, 2, 7);

        GildedRose gildedRose = new GildedRose(new Items[] { testItem });
        gildedRose.updateQuality();
        Assert.assertEquals(1, testItem.getItem().sellIn);
        Assert.assertEquals(6, testItem.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(0, testItem.getItem().sellIn);
        Assert.assertEquals(5, testItem.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-1, testItem.getItem().sellIn);
        Assert.assertEquals(3, testItem.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-2, testItem.getItem().sellIn);
        Assert.assertEquals(1, testItem.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-3, testItem.getItem().sellIn);
        Assert.assertEquals(0, testItem.getItem().quality);
    }

    @Test
    public void testUpdateQualityConjured()
    {
        Items conjured = factory.createItem(ItemEnum.CONJURED, 2, 4);

        GildedRose gildedRose = new GildedRose(new Items[] { conjured });
        gildedRose.updateQuality();
        Assert.assertEquals(1, conjured.getItem().sellIn);
        Assert.assertEquals(2, conjured.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(0, conjured.getItem().sellIn);
        Assert.assertEquals(0, conjured.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-1, conjured.getItem().sellIn);
        Assert.assertEquals(0, conjured.getItem().quality);

        Items conjured1 = factory.createItem(ItemEnum.CONJURED, 2, 11);

        gildedRose = new GildedRose(new Items[] { conjured1 });
        gildedRose.updateQuality();
        Assert.assertEquals(1,
                conjured1.getItem().sellIn);
        Assert.assertEquals(9, conjured1.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(0,
                conjured1.getItem().sellIn);
        Assert.assertEquals(7, conjured1.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-1,
                conjured1.getItem().sellIn);
        Assert.assertEquals(3, conjured1.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-2,
                conjured1.getItem().sellIn);
        Assert.assertEquals(0, conjured1.getItem().quality);
        gildedRose.updateQuality();
        Assert.assertEquals(-3,
                conjured1.getItem().sellIn);
        Assert.assertEquals(0, conjured1.getItem().quality);
    }

}
