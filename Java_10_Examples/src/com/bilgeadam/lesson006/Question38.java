package com.bilgeadam.lesson006;
/*
 * Dİzideki en büyük ve en küçük elemanı bulan algoritmayı yazınız.
 */

public class Question38 {

	public static void main(String[] args) {
		
		int[] sayilar = {259, 12, 5, 85, -89, 1258, 87, 14};
		
		int enBuyukSayi = sayilar[0]; // Integer.MIN_VALUE;
		int enKucukSayi = sayilar[0]; // Integer.MAX_VALUE;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i] > enBuyukSayi){
                enBuyukSayi = sayilar[i];
			} else if (sayilar[i] < enKucukSayi) {
				enKucukSayi = sayilar[i];
			}
		}
		System.out.println("Girilen En Büyük Sayı: "+enBuyukSayi);
		System.out.println("Girilen En Küçük Sayı: "+enKucukSayi);
	}
}