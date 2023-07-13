package com.bilgeadam.lesson011.enums;

public enum EAylar {

	HAZIRAN(30, "Yaz"), TEMMUZ(31, "Yaz"), AGUSTOS(31, "Yaz"), EYLUL(30, "Sonbahar"), EKIM(31, "Sonbahar"),
	KASIM(30, "Sonbahar"), ARALIK(31, "Kış");

	int gun;
	String mevsim;

	EAylar(int i, String deger) {

		gun = i;
		mevsim = deger;
	}
	
	public String mevsimGetir() {
		return mevsim.toUpperCase();
	}
}