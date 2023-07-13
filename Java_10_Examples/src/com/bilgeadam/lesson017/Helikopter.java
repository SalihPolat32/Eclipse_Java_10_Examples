package com.bilgeadam.lesson017;

public class Helikopter extends Arac implements IHavaTasiti {

	@Override
	public void kalkisYap() {
		System.out.println(getClass().getSimpleName() + " Kalkış Yapıyor.");
	}

	@Override
	public void inisYap() {
		System.out.println(getClass().getSimpleName() + " İniş Yapıyor.");
	}

	@Override
	public void hizlanma() {
		
	}

	@Override
	public void yavaslama() {
		
	}
}
