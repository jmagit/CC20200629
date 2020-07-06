package com.gildedrose;

public class GildedRose {
	public static final int CALIDAD_MAXIMA = 50;
	public static final int DEGRADACION_ESTANDAR = 1;

	Item[] items;

	public GildedRose(Item[] items) {
		if (items == null) 
			throw new IllegalArgumentException("Items collections not null");
		for (Item item : items) {
			if (item == null) 
				throw new IllegalArgumentException("Item null");
		}
		this.items = items;
	}

	public void updateQuality() {
		for (int productIndex = 0; productIndex < items.length; productIndex++) {
			if (esSulfuras(productIndex))
				continue;
			quitaUnDia(productIndex);
			if(esQueso(productIndex) ) {
				updateQuesoQuality(productIndex);
			} else if(esEntrada(productIndex)) {
				updateEntradaQuality(productIndex);
			} else if(esConjurado(productIndex)) {
				updateConjuradoQuality(productIndex);;
			} else {
				updateProductosQuality(productIndex);
			}
		}
	}

	private void updateQuesoQuality(int productIndex) {
		añadeCalidad(productIndex, haCaducado(productIndex) ? 2 : 1);
	}

	private void updateEntradaQuality(int productIndex) {
		if(haCaducado(productIndex)) {
			ponACeroCalidad(productIndex);
		} else if(quedan5DiasOMenos(productIndex)) {
			añadeCalidad(productIndex, 3);
		} else if(quedan10diasOMenos(productIndex)) {
			añadeCalidad(productIndex, 2);
		} else {
			añadeCalidad(productIndex, 1);
		}
	}

	private void updateConjuradoQuality(int productIndex) {
		if(haCaducado(productIndex)) {
			quitaCalidad(productIndex, 4 * DEGRADACION_ESTANDAR);
		} else {
			quitaCalidad(productIndex, 2 * DEGRADACION_ESTANDAR);
		}
	}

	private void updateProductosQuality(int productIndex) {
		if(haCaducado(productIndex)) {
			quitaCalidad(productIndex, 2 * DEGRADACION_ESTANDAR);
		} else {
			quitaCalidad(productIndex, DEGRADACION_ESTANDAR);
		}
	}

	private boolean esSulfuras(int productIndex) {
		return items[productIndex].name.equals("Sulfuras, Hand of Ragnaros");
	}

	private boolean esEntrada(int productIndex) {
		return items[productIndex].name.equals("Backstage passes to a TAFKAL80ETC concert");
	}

	private boolean esQueso(int productIndex) {
		return items[productIndex].name.equals("Aged Brie");
	}
	
	private boolean esConjurado(int productIndex) {
		return items[productIndex].name.equals("Conjured Mana Cake");
	}


	private boolean quedan5DiasOMenos(int productIndex) {
		return items[productIndex].sellIn < 5;
	}

	private boolean quedan10diasOMenos(int productIndex) {
		return items[productIndex].sellIn < 10;
	}

	private boolean haCaducado(int productIndex) {
		return items[productIndex].sellIn < 0;
	}

	private void quitaUnDia(int productIndex) {
		items[productIndex].sellIn = items[productIndex].sellIn - 1;
	}

	private void ponACeroCalidad(int productIndex) {
		quitaCalidad(productIndex, items[productIndex].quality);
	}

	private void quitaCalidad(int productIndex, int cantidad) {
//		int rslt = items[productIndex].quality - cantidad;
//		items[productIndex].quality = rslt < 0 ? 0 : rslt;
//
//		items[productIndex].quality = items[productIndex].quality - cantidad < 0 ?
//				0 : items[productIndex].quality - cantidad;

		if (items[productIndex].quality - cantidad < 0) {
			items[productIndex].quality = 0;
		} else {
			items[productIndex].quality = items[productIndex].quality - cantidad;
		}
		
//		items[productIndex].quality = items[productIndex].quality - 1;
//		if (items[productIndex].quality < 0) {
//			items[productIndex].quality = 0;
//		}
	}
	private void añadeCalidad(int productIndex, int cantidad) {
		if (items[productIndex].quality + cantidad > CALIDAD_MAXIMA) {
			items[productIndex].quality = CALIDAD_MAXIMA;
		} else {
			items[productIndex].quality = items[productIndex].quality + cantidad;
		}
	}

}
