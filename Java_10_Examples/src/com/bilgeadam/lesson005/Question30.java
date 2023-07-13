package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * Klavyeden 0 ile 100 arası 100 de dahil
 * 5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazdıralım 
 */

public class Question30 {

	public static void main(String[] args) {
		
		int sayac = 0, enBüyükSayi = -1, enKüçükSayi = 101;
		Scanner scanner = new Scanner(System.in);

		for (int sayiAdedi = 0; sayiAdedi < 5; sayiAdedi++) {
			System.out.println("Lütfen 0 ve 101 Arası Bir Sayı Giriniz:");
			int sayi = scanner.nextInt();
			if (sayi > 100 || sayi < 0) {
				System.out.println("Lütfen 101'den Küçük Pozitif Tam Sayı Giriniz.");
				continue;
			} else if (sayi > enBüyükSayi){
                enBüyükSayi = sayi;
			} else if (sayi < enKüçükSayi) {
				enKüçükSayi = sayi;
			}
		}
		System.out.println("Girilen En Büyük Sayı: "+enBüyükSayi);
		System.out.println("Girilen En Küçük Sayı: "+enKüçükSayi);
	}
}