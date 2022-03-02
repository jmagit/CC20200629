/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 26 07:49:06 GMT 2021
 */

package com.gildedrose;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GildedRose_ESTest extends GildedRose_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0);
      itemArray0[0] = item0;
      item0.setSellIn(11);
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      gildedRose0.updateQuality();
      assertEquals(50, GildedRose.CALIDAD_MAXIMA);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      Item[] itemArray1 = gildedRose0.getItems();
      assertFalse(itemArray1.equals((Object)itemArray0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Aged Brie", 24, 24);
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      item0.setSellIn(1);
      gildedRose0.updateQuality();
      gildedRose0.updateQuality();
      Item item1 = gildedRose0.getItem(0);
      assertEquals((-1), item1.sellIn);
      assertEquals(27, item1.quality);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      Item item0 = new Item("", 4406, 2684);
      itemArray0[0] = item0;
      itemArray0[1] = item0;
      Item item1 = new Item("", 1812, (-1));
      itemArray0[2] = item1;
      itemArray0[3] = itemArray0[0];
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      Item item2 = gildedRose0.getItem(2);
      assertEquals(1812, item2.sellIn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 2587);
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      Item item1 = gildedRose0.getItem(0);
      assertEquals(0, item1.getSellIn());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Aged Brie", 24, 24);
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      item0.quality = 1711;
      item0.quality = (-181);
      Item item1 = gildedRose0.getItem(0);
      assertEquals(24, item1.sellIn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item((String) null, 0, 0);
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      // Undeclared exception!
      try { 
        gildedRose0.updateQuality();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", 48, 48);
      itemArray0[0] = item0;
      item0.setSellIn(7);
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      gildedRose0.updateQuality();
      gildedRose0.updateQuality();
      assertEquals(1, GildedRose.DEGRADACION_ESTANDAR);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("com.gildedrose.GildeRoseExcepton", (-10), (-10));
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      item0.setSellIn(1);
      gildedRose0.updateQuality();
      assertEquals(1, GildedRose.DEGRADACION_ESTANDAR);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Conjured Mana Cake", 10, 10);
      itemArray0[0] = item0;
      item0.setSellIn(1);
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      gildedRose0.updateQuality();
      gildedRose0.updateQuality();
      assertEquals(1, GildedRose.DEGRADACION_ESTANDAR);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", (-6), (-6));
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      item0.setSellIn(18);
      gildedRose0.updateQuality();
      assertEquals(1, GildedRose.DEGRADACION_ESTANDAR);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0);
      itemArray0[0] = item0;
      item0.setSellIn(7);
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      gildedRose0.updateQuality();
      gildedRose0.updateQuality();
      gildedRose0.updateQuality();
      assertEquals(50, GildedRose.CALIDAD_MAXIMA);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("com.gildedrose.GildeRoseExcepton", (-10), (-10));
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      gildedRose0.updateQuality();
      assertEquals(1, GildedRose.DEGRADACION_ESTANDAR);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", (-6), (-6));
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      item0.setName("Sulfuras, Hand of Ragnaros");
      gildedRose0.updateQuality();
      assertEquals(1, GildedRose.DEGRADACION_ESTANDAR);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Item[] itemArray0 = new Item[16];
      GildedRose gildedRose0 = null;
      try {
        gildedRose0 = new GildedRose(itemArray0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Item null
         //
         verifyException("com.gildedrose.GildedRose", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GildedRose gildedRose0 = null;
      try {
        gildedRose0 = new GildedRose((Item[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Es obligatorio contar con la lista de productos
         //
         verifyException("com.gildedrose.GildedRose", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0);
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      // Undeclared exception!
      try { 
        gildedRose0.getItem((-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("com.gildedrose.GildedRose", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0);
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      gildedRose0.updateQuality();
      assertEquals(1, GildedRose.DEGRADACION_ESTANDAR);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Item item0 = new Item("Conjured Mana Cake", 10, 10);
      itemArray0[0] = item0;
      GildedRose gildedRose0 = new GildedRose(itemArray0);
      Item[] itemArray1 = gildedRose0.getItems();
      assertEquals(1, itemArray1.length);
  }
}