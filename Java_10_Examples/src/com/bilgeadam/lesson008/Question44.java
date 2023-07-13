package com.bilgeadam.lesson008;
/*
 * Bir dizide ard arda gelen 2 indexdeki degerde 2 rakamı ise bize true
 * dönen bir metot yazınız.
 */

public class Question44 {

	public static void main(String[] args) {

		int[] sayilar = { 2, 2, 4, 5, 8, 3, 2, 15 };

		boolean kontrol = false;
		System.out.println(ikiKontrolu(sayilar));
		System.out.println(ikiKontrolu(sayilar, kontrol));
		
		String deger = "Merhaba";
		
		deger.substring(0);

	}

	public static boolean ikiKontrolu(int[] dizi) {

		for (int i = 1; i < dizi.length; i++) {

			if (dizi[i] == 2 && dizi[i - 1] == 2) {
				return true;
			}
		}
		return false;
	}

	// Method Overloading Aşırı Yükleme
	public static boolean ikiKontrolu(int[] dizi, boolean kontrol) {

		for (int i = 1; i < dizi.length; i++) {

			if (dizi[i] == 2 && dizi[i - 1] == 2) {
				kontrol = true;
				break;
			} else {
				kontrol = false;
			}
		}
		return kontrol;
	}
}