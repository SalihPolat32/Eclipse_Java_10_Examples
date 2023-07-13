package com.bilgeadam.lesson016.polimorfizm;

public class HavaPokemonu extends Pokemon implements IUcabilir, IDatabase {

	public HavaPokemonu(int id, String ad, int guc, int can, int seviye) {
		super(id, ad, guc, can, seviye);
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " Hava Saldırısı Yapıyor.");
	}

	@Override
	public void havalan() {
		System.out.println(getAd() + " Havalanıyor.");
	}

	@Override
	public void inisYap() {
		System.out.println(getAd() + " İniş Yapıyor.");
	}

	@Override
	public void save() {
		System.out.println(getAd() + " Database'e Kayıt Edildi.");	
	}
}