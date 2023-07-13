package com.bilgeadam.lesson024;

import java.util.Scanner;

/*
 * 1) Bir metot yazacağız dışarıdan bir index alacak sonra o indexdeki değeri yazdıracağız
 * hata varsada hatayı yakalayıp hata mesajını yazdıralım
 * 
 * 2) Array üzerinde gezelim gezerken toplayabildiğimiz değerleri topla değişkenine ekleyerek toplam sonucunu bulalım
 * ve toplam sonucu bulalım ve bir sayaç ile de hata sayısını tutalım döngü sonunda topamı ve hata sayısını yazdıralım
 */

public class TryCatchOrnek2 {

	public static void main(String[] args) {

		String[] array = { null, "30", "a", "20", "ab", null, "50" };

		indexdekiYazdir(array);

		System.out.println("Program Devam Ediyor.");

		toplamDegeriniVeHataSayisiniBul(array);

		System.out.println("Program Devam Ediyor.");

		toplamDegeriniVeHataSayisiniBul2(array);
	}

	public static void indexdekiYazdir(String[] array) {

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Lütfen index değerini giriniz:");
			int index = scanner.nextInt();
			System.out.println(array[index]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e.toString() + " Arrayin Boyutu: " + array.length + " Lütfen 0 ile " + array.length
					+ " Arasında Bir Değer Giriniz.");
			e.printStackTrace();
		}
	}

	public static void toplamDegeriniVeHataSayisiniBul(String[] array) {

		int toplam = 0;
		int sayac = 0;

		for (String string : array) {

			try {

				string.charAt(0);
				toplam += Integer.parseInt(string);

			} catch (NumberFormatException e) {

				System.out.println(e.toString());
				sayac++;

			} catch (Exception e) {

				System.out.println("Başka Bir Hata: " + e.toString());
				sayac++;
			}
		}
		System.out.println("Rakamlar Toplamı: " + toplam);
		System.out.println("Hata Sayısı: " + sayac);
	}

	public static void toplamDegeriniVeHataSayisiniBul2(String[] array) {

		int toplam = 0;
		int sayac = 0;

		for (String string : array) {

			try {

				nullKontrolu(string);
				toplam += Integer.parseInt(string);

			} catch (NumberFormatException e) {

				System.out.println(e.toString());
				sayac++;

			} catch (Exception e) {
				
				System.out.println(e.toString());
				sayac++;
			}
		}
		System.out.println("Rakamlar Toplamı: " + toplam);
		System.out.println("Hata Sayısı: " + sayac);
	}

	public static String nullKontrolu(String string) { // unchecked exception

		if (string == null) {
			
			throw new NullPointerException("Null Hatası"); 
		}
		
		return string;
	}
	
	public static String nullKontrolu2(String string) throws Exception { // checked exception

		if (string == null) {
			
			throw new NullPointerException("Null Hatası");
		}
		
		return string;
	}
}