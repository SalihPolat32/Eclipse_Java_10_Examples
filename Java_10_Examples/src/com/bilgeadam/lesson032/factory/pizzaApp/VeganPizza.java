package com.bilgeadam.lesson032.factory.pizzaApp;

public class VeganPizza extends Pizza {

	public VeganPizza(ETur tur, EHamurTipi hamurtipi, EBoyut boyut) {
		super(tur, hamurtipi, boyut);
	}

	@Override
	public String toString() {
		return "VeganPizza [getFiyat()=" + getFiyat() + ", getTur()=" + getTur() + ", getHamurtipi()=" + getHamurtipi()
				+ ", getBoyut()=" + getBoyut() + "]";
	}
}