package com.bilgeadam.lesson006;
/*
 * Sayılar arrayimizde gezelim
 * ve tek sayılar toplamının çift sayılar toplamına oranını bulalım.
 */

public class Question40 {

	public static void main(String[] args) {

		String[] sayilar = { "4", "6", "5", "12", "13" };

		double toplamCift = 0, toplamTek = 0;
		double oran = 0;

		for (int i = 0; i < sayilar.length; i++) {
			
			int sayi = Integer.parseInt(sayilar[i]);

			if (sayi % 2 == 0) {
				toplamCift += sayi;
			} else {
				toplamTek += sayi;
			}
		}
		System.out.println("Çift Sayıların Toplamı: " + toplamCift);
		System.out.println("Tek Sayıların Toplamı: " + toplamTek);
		oran = (double) toplamTek / toplamCift;
		System.out.println("Tek sayıların Çift Sayılara Oranı: " + oran);
	}
}