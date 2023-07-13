package com.bilgeadam.lesson017;

public abstract class Ucak extends Arac implements IHavaTasiti{
	
	int kanatUzunlugu;

	@Override
	public void kalkisYap() {
		System.out.println("Kalkış Yapılıyor.");
	}

	@Override
	public void inisYap() {
		System.out.println("İniş Yapılıyor.");		
	}
	
	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName() + " Hızlanıyor.");
		hiz +=50;
		hizGoster();
	}

	@Override
	public void yavaslama() {
		System.out.println(getClass().getSimpleName() + " Yavaşlıyor.");
		if (hiz > 0) {
			hiz -=50;
			hizGoster();
		}
	}
}