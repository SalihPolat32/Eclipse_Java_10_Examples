package com.bilgeadam.lesson017;
/*
 * Ucaklarda hız 50 ser 50 ser artsın ve azalsın
 * gemilerde hız 10 ser 10 ser artsın ve azalsın
 * otomobillerde hız 20 ser 20 ser artsın ve azalsın
 * kamyonlarda hız 5 ser 5 ser artsın ve azalsın
 */

public abstract class Arac implements IHaraket {
	
	int hiz;

	@Override
	public abstract void hizlanma();

	@Override
	public abstract void yavaslama();
	
	public void hizGoster() {
		System.out.println("Hızınız: " + hiz);
	}

	@Override
	public String toString() {
		return "Arac [hiz=" + hiz + "]";
	}
}