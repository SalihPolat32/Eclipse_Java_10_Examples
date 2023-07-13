package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Soru 1) Dışarıdan taban değeri birde üs değeri alacağız
 * (2 üzeri 5 gibi) bu işlemin sonucu bulan algoritma (döngü kullanarak)
 * 
 * Soru 2) a dan z ye kadar alfabeyi yazdıralım (döngü kullanarak)
 * 
 * Soru 3) Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz
 * 0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.
 * 
 * Soru 4) 1'den 100'e kadar olan çift sayıların toplamının
 * tek sayıların toplamına oranı
 * 
 * Wrapper class nedir
 * heap bellek stack bellek arasındaki fark
 * referans tür nedir.
 */

public class Odev1 {

	public static void main(String[] args) {
		
		// 1. Soru
		System.out.println("-----------1. Soru------------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Sayı giriniz: ");
		int sayiAlt = scanner.nextInt();
		System.out.print("Lütfen Üstsel İfadeyi Giriniz: ");
		int sayiUst = scanner.nextInt();
		int sonuc = 1;
		 
        for (;sayiUst != 0; sayiUst--) {
            sonuc = sonuc*sayiAlt;
        }
		System.out.println("Sonuç: "+sonuc);	
		
		// 2. Soru
	    System.out.println("-----------2. Soru------------");
	    char alfabe;
	    
        for(alfabe= 'A'; alfabe <= 'Z'; alfabe++) {
            System.out.println(alfabe + " ");
        }
        
        // 3. Soru
	    System.out.println("-----------3. Soru------------");
	    int toplam = 0, sayiAdedi = 1;
	    double ortalama = 0;
	    while (true) {
	    System.out.println("Lütfen Sayı Giriniz: ");
	    int sayi = scanner.nextInt();
	    if (sayi != 0) {
	    	System.out.println("Lütfen Yeni Bir Sayı Giriniz");
			toplam += sayi;
			sayiAdedi++;
			ortalama = (double) toplam/(sayiAdedi-1);
		} else {
			System.out.println("Sıfır girdiniz.");
			System.out.println("Girilen Sayıların Toplam: "+toplam);
			System.out.println("Girilen Sayıların Adedi: "+sayiAdedi);
			System.out.println("Girilen Sayıların Ortalaması: "+ortalama);
			break;
		}
	    } 
	    // 4. Soru
	    System.out.println("-----------4. Soru------------");
	    int toplamCift = 0, toplamTek = 0;
		for (int i = 0; i <= 100; i+=2) {
    		toplamCift += i;
        }
	    System.out.println("Çift Sayıların Toplamı: "+toplamCift);
	    for (int j = 1 ; j < 100; j+=2) {
	    		toplamTek += j;
	    }
	    System.out.println("Tek Sayıların Oranı: "+toplamTek);
	    
	    double oran = (double) toplamCift/toplamTek;
    	System.out.println("Sayıların Oranı: "+oran);
    	
    	/*
    	4. Soru Alternatif Çözüm
	    int toplamCift = 0, toplamTek = 0;
	    double oran = 0;
	    for (int i = 1; i <= 100; i++) {
	    	if (i%2 == 0) {
	    		toplamCift += i;
			} else {
				toplamTek = toplamTek+i;
			}	
		}
		System.out.println("Çift Sayıların Oranı: "+toplamCift);
	    System.out.println("Tek Sayıların Oranı: "+toplamTek);
		oran = (double) toplamCift/toplamTek;
	    System.out.println("Sayıların Oranı: "+oran);
		*/
	}
}
