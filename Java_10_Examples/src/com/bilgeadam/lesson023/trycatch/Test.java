package com.bilgeadam.lesson023.trycatch;

import java.util.Scanner;

/*
 * Bölme işlemi için metot yazalım
 * 
 * 1. ve 2. sayıları dışarıdan alalım
 * 
 * bölme işlemi sonucunu bulmaya çalışalım eğer hata varsa 2. sayıy tekrar alalım
 */
public class Test {

	public static void main(String[] args) {

//		int sayi1 = 10;
//		int sayi2 = 20;
//		Integer sayi3 = null;
//		int sonuc = 0;
//		
//		try {
//			
//			sonuc = sayi2 / sayi1;
//			System.out.println("Başarıllı Kod");
//			
//			sonuc = sayi2 / sayi3;
//			System.out.println("Başarıllı Kod");
//			
//		} catch (ArithmeticException e) {
//			
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println("Hata Yakalandı Bir Sayı 0'a Bölünemez");
//			
//		} catch (NullPointerException e) {
//			
//			System.out.println("Null Exception");
//			e.printStackTrace();
//			
//		} catch (Exception e) {
//			
//			System.out.println("Başka Bir Hata İçin");
//			e.printStackTrace();
//			
//		}
//		
//		System.out.println("Sonuc: " + sonuc);

		System.out.println("Sonuç: " + bolme());
	}

	public static double bolme() {
		
		Scanner scanner = new Scanner(System.in);
		
		double sonuc = 0;
		boolean kontrol = false;
		
		do {
			try {
				
				System.out.println("Bölme İşlemi için Lütfen 1. Sayıyı Giriniz:");
				int sayi1 = scanner.nextInt();
				System.out.println("Lütfen 2. Sayıyı Giriniz:");
				int sayi2 = scanner.nextInt();
				
				sonuc = sayi1 / sayi2;
				kontrol = false;
				// break; yazılabilir
				
			} catch (Exception e) {
				
				System.out.println("Hata Oluştu: " + e.toString());
				kontrol = true;
				
			}

		} while (kontrol);

		return sonuc;
	}
}