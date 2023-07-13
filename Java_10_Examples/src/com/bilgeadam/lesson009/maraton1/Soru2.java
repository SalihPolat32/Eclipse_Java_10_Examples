package com.bilgeadam.lesson009.maraton1;

import java.util.Iterator;

public class Soru2 {

	public static void main(String[] args) {

		int sayiDizisi1[] = { 9, 7, 5, 3, 7, 7, 3, 18, 7, 2, 0, 7 };

		int sayiDizisi2[] = { 0, 1, 5, 3 };

		diziKontrol(sayiDizisi1);

		diziKontrol(sayiDizisi2);

	}

	public static boolean diziKontrol(int[] dizi) {

		int sayac = 0;
		int tekrarSayisi = 0;
		for (int i = 1; i < dizi.length; i++) {

			if (dizi[i] == dizi[i - 1]) {
				System.out.println(dizi[i] + " Sayısı İlk Tekrar Eden Sayıdır.");
				tekrarSayisi = dizi[i];

				for (int j = 0; j < dizi.length; j++) {
					if (dizi[j] == tekrarSayisi) {
						sayac++;
					}
				}
				System.out.println("Dizide " + dizi[i] + " Sayısı " + sayac + " Tane Mevcuttur.");
				return true;
			}
		}

		System.out.println("Tekrar eden sayı bulunamamıştır.");

		return false;
	}
}
