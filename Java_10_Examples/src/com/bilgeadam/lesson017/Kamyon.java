package com.bilgeadam.lesson017;

public class Kamyon extends Arac implements IKaraTasiti, IYuk {
	
	int kasaUzunlugu;

	@Override
	public void sur() {
		System.out.println("Harekete Geçildi.");
	}
	
	@Override
	public void yukAl() {
		System.out.println(getClass().getSimpleName() + " Yük Alıyor.");
	}

	@Override
	public void yukBosalt() {
		System.out.println(getClass().getSimpleName() + " Yük Boşaltıyor.");
	}
	
	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName() + " Hızlanıyor.");
		hiz +=5;
		hizGoster();
	}

	@Override
	public void yavaslama() {
		System.out.println(getClass().getSimpleName() + " Yavaşlıyor.");
		if (hiz > 0) {
			hiz -=5;
			hizGoster();
		}
	}
}