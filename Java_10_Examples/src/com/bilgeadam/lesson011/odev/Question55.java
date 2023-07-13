package com.bilgeadam.lesson011.odev;
/*
 * Bir dizide 13 var ise 13 ve bir sonraki eleman toplama eklenmeden toplamı bulan kod
 */

public class Question55 {

	public static void main(String[] args) {

		int[] sayilar = { 1, 13, 13, 5, 13 };

		onuc(sayilar);

	}

	public static void onuc(int dizi[]) {
		int toplam = 0;

		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		System.out.println(toplam);

		for (int i = 0; i < dizi.length - 1; i++) {
			if (dizi[i] == 13) {
				toplam -= dizi[i];
				if (dizi[i + 1] != 13) {
					toplam -= dizi[i + 1];
					if (dizi[dizi.length - 1] == 13) {
						toplam -= dizi[i];
					}
				}
			}
		}
		System.out.println(toplam);
	}
}