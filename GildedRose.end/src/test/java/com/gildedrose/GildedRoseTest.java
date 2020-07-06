package com.gildedrose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GildedRoseTest {
	Item[] samples = new Item[] { new Item("+5 Dexterity Vest", 10, 20), //
			new Item("Aged Brie", 2, 0), //
			new Item("Elixir of the Mongoose", 5, 7), //
			new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
			new Item("Sulfuras, Hand of Ragnaros", -1, 80),
			new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
			new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
			new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
			// this conjured item does not work properly yet
			new Item("Conjured Mana Cake", 3, 6) };

	@ParameterizedTest
	@CsvSource({ 
		"2, 0, 1, 1", 
		"-1, 48, -2, 50", 
		"2, 50, 1, 50", 
		})
	void productAgedBrieTest(int sellIn, int quality, int sellInResult, int qualityResult) {
		String name = "Aged Brie";
		Item product = new Item(name, sellIn, quality);
		GildedRose app = new GildedRose(new Item[] { product });
		app.updateQuality();
		assertAll(name, () -> assertEquals(name, product.name, "name"),
				() -> assertEquals(sellInResult, product.sellIn, "sellIn"),
				() -> assertEquals(qualityResult, product.quality, "quality"));
	}

	@ParameterizedTest
	@CsvSource({ 
		"1, 0, 1, 0", 
		"0, 1, 0, 1", 
		"-1, 1, -1, 1", 
		})
	void productSulfurasTest(int sellIn, int quality, int sellInResult, int qualityResult) {
		String name = "Sulfuras, Hand of Ragnaros";
		Item product = new Item(name, sellIn, quality);
		GildedRose app = new GildedRose(new Item[] { product });
		app.updateQuality();
		assertAll(name, () -> assertEquals(name, product.name, "name"),
				() -> assertEquals(sellInResult, product.sellIn, "sellIn"),
				() -> assertEquals(qualityResult, product.quality, "quality"));
	}

	@ParameterizedTest
	@CsvSource({ 
		"11, 0, 10, 1", 
		"7, 1, 6, 3", 
		"7, 49, 6, 50", 
		"5, 3, 4, 6", 
		"0, 3, -1, 0", 
		})
	void productPassesTest(int sellIn, int quality, int sellInResult, int qualityResult) {
		String name = "Backstage passes to a TAFKAL80ETC concert";
		Item product = new Item(name, sellIn, quality);
		GildedRose app = new GildedRose(new Item[] { product });
		app.updateQuality();
		assertAll(name, () -> assertEquals(name, product.name, "name"),
				() -> assertEquals(sellInResult, product.sellIn, "sellIn"),
				() -> assertEquals(qualityResult, product.quality, "quality"));
	}

	@ParameterizedTest
	@CsvSource({ 
		"11, 10, 10, 9", 
		"7, 1, 6, 0", 
		"5, 0, 4, 0", 
		"0, 3, -1, 1", 
		})
	void otherProductTest(int sellIn, int quality, int sellInResult, int qualityResult) {
		String name = "Normal Product";
		Item product = new Item(name, sellIn, quality);
		GildedRose app = new GildedRose(new Item[] { product });
		app.updateQuality();
		assertAll(name, () -> assertEquals(name, product.name, "name"),
				() -> assertEquals(sellInResult, product.sellIn, "sellIn"),
				() -> assertEquals(qualityResult, product.quality, "quality"));
	}

	@ParameterizedTest
	@CsvSource({ 
		"11, 10, 10, 8", 
		"7, 1, 6, 0", 
		"0, 5, -1, 1", 
		"-1, 3, -2, 0", 
		})
	void productConjureTest(int sellIn, int quality, int sellInResult, int qualityResult) {
		String name = "Conjured Mana Cake";
		Item product = new Item(name, sellIn, quality);
		GildedRose app = new GildedRose(new Item[] { product });
		app.updateQuality();
		assertAll(name, () -> assertEquals(name, product.name, "name"),
				() -> assertEquals(sellInResult, product.sellIn, "sellIn"),
				() -> assertEquals(qualityResult, product.quality, "quality"));
	}

}
