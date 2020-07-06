package com.gildedrose;

public class GildedRose {
	public static final int PERDIDA_DE_CALIDAD_SIN_CADUCAR = 1;
	public static final int PERDIDA_DE_CALIDAD_CADUCADO = 2;

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int productIndex = 0; productIndex < items.length; productIndex++) {
			if (esSulfuras(productIndex))
				continue;
			quitaUnDia(productIndex);
			if (esQueso(productIndex)) {
				updateQuesoQuality(productIndex);
			} else if (esEntrada(productIndex)) {
				updateEntradasQuality(productIndex);
			} else if (esConjuro(productIndex)) {
				updateConjuroQuality(productIndex);
			} else {
				updateProductoQuality(productIndex);
			}
		}
	}

	private void updateQuesoQuality(int productIndex) {
		if (haCaducado(productIndex)) {
			subeLaCalidad(productIndex, 2);
		} else {
			subeLaCalidad(productIndex, 1);
		}
	}

	private void updateEntradasQuality(int productIndex) {
		if (haCaducado(productIndex)) {
			ponCalidadACero(productIndex);
		} else if (faltan5DiasOMenos(productIndex)) {
			subeLaCalidad(productIndex, 3);
		} else if (faltan10DiasOMenos(productIndex)) {
			subeLaCalidad(productIndex, 2);
		} else {
			subeLaCalidad(productIndex, 1);
		}
	}

	private void updateConjuroQuality(int productIndex) {
		if (haCaducado(productIndex)) {
			bajaLaCalidad(productIndex, 2 * PERDIDA_DE_CALIDAD_CADUCADO);
		} else {
			bajaLaCalidad(productIndex, 2 * PERDIDA_DE_CALIDAD_SIN_CADUCAR);
		}
	}

	private void updateProductoQuality(int productIndex) {
		if (haCaducado(productIndex)) {
			bajaLaCalidad(productIndex, PERDIDA_DE_CALIDAD_CADUCADO);
		} else {
			bajaLaCalidad(productIndex, PERDIDA_DE_CALIDAD_SIN_CADUCAR);
		}
	}

	private boolean esQueso(int productIndex) {
		return items[productIndex].name.equals("Aged Brie");
	}

	private boolean esEntrada(int productIndex) {
		return items[productIndex].name.equals("Backstage passes to a TAFKAL80ETC concert");
	}

	private boolean esSulfuras(int productIndex) {
		return items[productIndex].name.equals("Sulfuras, Hand of Ragnaros");
	}

	private boolean esConjuro(int productIndex) {
		return items[productIndex].name.equals("Conjured Mana Cake");
	}

	private boolean haCaducado(int productIndex) {
		return items[productIndex].sellIn < 0;
	}

	private boolean faltan5DiasOMenos(int productIndex) {
		return items[productIndex].sellIn < 5;
	}

	private boolean faltan10DiasOMenos(int productIndex) {
		return items[productIndex].sellIn < 10;
	}

	private void ponCalidadACero(int productIndex) {
		items[productIndex].quality = 0;
	}

	private void bajaLaCalidad(int productIndex, int cantidad) {
//		items[productIndex].quality = items[productIndex].quality - cantidad > 0 ? 
//				0 : (items[productIndex].quality - cantidad);
		if (items[productIndex].quality - cantidad < 0) {
			items[productIndex].quality = 0;
		} else {
			items[productIndex].quality = items[productIndex].quality - cantidad;
		}
	}

	private void subeLaCalidad(int productIndex, int cantidad) {
//		items[productIndex].quality = items[productIndex].quality + cantidad > 50 ? 
//				50 : (items[productIndex].quality + cantidad);
		if (items[productIndex].quality + cantidad > 50) {
			items[productIndex].quality = 50;
		} else {
			items[productIndex].quality = items[productIndex].quality + cantidad;
		}
	}

	private void quitaUnDia(int productIndex) {
		items[productIndex].sellIn = items[productIndex].sellIn - 1;
	}

}
