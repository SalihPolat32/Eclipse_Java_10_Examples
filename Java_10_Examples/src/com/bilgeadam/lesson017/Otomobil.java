package com.bilgeadam.lesson017;

public class Otomobil extends Arac implements IKaraTasiti {
	
	@Override
	public void sur() {
		System.out.println("Harekete Geçildi.");
	}
	
	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName() + " Hızlanıyor.");
		hiz +=20;
		hizGoster();
	}

	@Override
	public void yavaslama() {
		System.out.println(getClass().getSimpleName() + " Yavaşlıyor.");
		if (hiz > 0) {
			hiz -=20;
			hizGoster();
		}
	}
}