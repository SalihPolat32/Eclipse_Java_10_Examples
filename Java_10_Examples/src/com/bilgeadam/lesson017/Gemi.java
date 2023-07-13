package com.bilgeadam.lesson017;

public abstract class Gemi extends Arac implements IDenizTasiti {

	int odaSayisi;

	@Override
	public void yelkenAc() {
		System.out.println("Yelken Açılıyor.");		
	}

	@Override
	public void limanaYanas() {
		System.out.println("Limana Yanaşılıyor.");
	}

	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName() + " Hızlanıyor.");
		hiz +=10;
		hizGoster();
	}

	@Override
	public void yavaslama() {
		System.out.println(getClass().getSimpleName() + " Yavaşlıyor.");
		if (hiz > 0) {
			hiz -=10;
			hizGoster();
		}
		
		
	}

	@Override
	public String toString() {
		return "Gemi [odaSayisi=" + odaSayisi + ", hiz=" + hiz + "]";
	}
}