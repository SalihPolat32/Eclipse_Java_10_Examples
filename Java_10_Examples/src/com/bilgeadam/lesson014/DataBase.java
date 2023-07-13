package com.bilgeadam.lesson014;

import java.util.Scanner;

public class DataBase {

	public static Kullanici[] kullanicilar = new Kullanici[6];
	public static int index;

	public static void baslangicVerisiEkle() {

		Kullanici kullanici1 = new Kullanici(index + 1, "salihpolat", "spd327", "Salih Polat");
		kullanicilar[index] = kullanici1;
		index++;
		Kullanici kullanici2 = new Kullanici(index + 1, "musty", "abc123", "Mustafa ÖZTÜRK");
		kullanicilar[index] = kullanici2;
		index++;
		Kullanici kullanici3 = new Kullanici(index + 1, "canss", "160596", "Cansu HATIL");
		kullanicilar[index] = kullanici3;
		index++;

	}

	public static void kullaniciEkle(Kullanici kullanici) {

		if (kullanicilar[kullanicilar.length - 1] != null) {
			arrayByoutArttırma();
		}

		kullanicilar[index] = kullanici;
		index++;
	}

	private static void arrayByoutArttırma() {

		Kullanici[] temp = new Kullanici[kullanicilar.length + 5];

		for (int i = 0; i < kullanicilar.length; i++) {
			temp[i] = kullanicilar[i];
		}
		kullanicilar = temp;
	}

	public static Kullanici kullaniciVarMi(String username, String sifre) {

		for (Kullanici kullanici : kullanicilar) {

			if (kullanici != null) {

				if (kullanici.getUsername().equals(username) && kullanici.getSifre().equals(sifre)) {
					return kullanici;
				}
			}
		}
		return null;
	}
}