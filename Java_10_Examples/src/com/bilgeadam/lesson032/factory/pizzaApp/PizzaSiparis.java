package com.bilgeadam.lesson032.factory.pizzaApp;

public class PizzaSiparis {

	public void menu() {

		System.out.println("Pizza Sipariş Menusu");
		Pizza pizza = pizzaSec3();
		sipariHazirlama(pizza);
	}
	/*
	 * Türü, Hamuru ve Boyutu seçip bir factory sınıfına yollayıp bize bir pizza
	 * dönmesini istiyoruz.
	 */

	// 1. YÖNTEM
	private Pizza pizzaSec() {

		EBoyut boyut = boyutSec();
		System.out.println(boyut);
		ETur tur = turSec();
		System.out.println(tur);
		EHamurTipi hamurTipi = hamurTipiSec();
		System.out.println(hamurTipi);

		return PizzaFactory.pizzaOlustur(boyut, tur, hamurTipi);
	}

	public ETur turSec() {

		for (ETur tur : ETur.values()) {
			System.out.println((tur.ordinal() + 1) + " - " + tur);
		}

		int secim = Utility.intDegerAlma("Lütfen Pizzanın Türünü Tipini Seçiniz:");

		return ETur.values()[secim - 1];
	}

	public EHamurTipi hamurTipiSec() {

		for (EHamurTipi hamurTipi : EHamurTipi.values()) {
			System.out.println((hamurTipi.ordinal() + 1) + " - " + hamurTipi);
		}

		int secim = Utility.intDegerAlma("Lütfen Pizzanın Hamur Tipini Seçiniz:");

		return EHamurTipi.values()[secim - 1];
	}

	public EBoyut boyutSec() {

		for (EBoyut boyut : EBoyut.values()) {
			System.out.println((boyut.ordinal() + 1) + " - " + boyut);
		}

		int secim = Utility.intDegerAlma("Lütfen Pizza Boyutunu Seçiniz:");

		return EBoyut.values()[secim - 1];
	}
	
	// 2. YÖNTEM
	private Pizza pizzaSec2() {

		EBoyut boyut = (EBoyut) secim(EBoyut.values(), "Lütfen Pizza Boyutunu Seçiniz:");
		System.out.println(boyut);
		ETur tur = (ETur) secim(ETur.values(), "Lütfen Pizzanın Türünü Tipini Seçiniz:");
		System.out.println(tur);
		EHamurTipi hamurTipi = (EHamurTipi) secim(EHamurTipi.values(), "Lütfen Pizzanın Hamur Tipini Seçiniz:");
		System.out.println(hamurTipi);

		return PizzaFactory.pizzaOlustur(boyut, tur, hamurTipi);
	}

	public Enum secim(Enum[] dizi, String sorgu) {

		for (Enum deger : dizi) {
			System.out.println((deger.ordinal() + 1) + " - " + deger);
		}

		int secim = Utility.intDegerAlma(sorgu);

		return dizi[secim - 1];
	}
	
	// 3. YÖNTEM
	public <T> T secim2(T[] dizi, String sorgu) {
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i + 1) + " - " + dizi[i]);
		}
		
		int secim = Utility.intDegerAlma(sorgu);

		return dizi[secim - 1];
	}
	
	private Pizza pizzaSec3() {

		EBoyut boyut = secim2(EBoyut.values(), "Lütfen Pizza Boyutunu Seçiniz:");
		System.out.println(boyut);
		ETur tur = secim2(ETur.values(), "Lütfen Pizzanın Türünü Tipini Seçiniz:");
		System.out.println(tur);
		EHamurTipi hamurTipi = secim2(EHamurTipi.values(), "Lütfen Pizzanın Hamur Tipini Seçiniz:");
		System.out.println(hamurTipi);

		return PizzaFactory.pizzaOlustur(boyut, tur, hamurTipi);
	}
	
	private void sipariHazirlama(Pizza pizza) {

		System.out.println("Siparişiniz ==> " + pizza);
		System.out.println("Hazırlanıyor...");
	}
}