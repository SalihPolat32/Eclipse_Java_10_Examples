package com.bilgeadam.lesson032.factory.pizzaApp;

public class KlasikPizza extends Pizza {

	public KlasikPizza(ETur tur, EHamurTipi hamurtipi, EBoyut boyut) {
		super(tur, hamurtipi, boyut);
	}

	@Override
	public String toString() {
		return "KlasikPizza [getFiyat()=" + getFiyat() + ", getTur()=" + getTur() + ", getHamurtipi()=" + getHamurtipi()
				+ ", getBoyut()=" + getBoyut() + "]";
	}
}