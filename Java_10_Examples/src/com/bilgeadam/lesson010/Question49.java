package com.bilgeadam.lesson010;

import java.util.Scanner;

/*
 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı
 * ise bilge 5'in ise adam hem3 ve hem 5 in katı ise bilgeadam yazdıralım int start=2; int
 * end=22; çıktı [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge,22]
 */
public class Question49 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Dizinin Başlangıç Değerini Giriniz:");
		int baslangic = scanner.nextInt();
		System.out.println("Lütfen Dizinin Bitiş Değerini Giriniz:");
		int bitis = scanner.nextInt();

		arrayOlustur(baslangic, bitis);
		
		arrayYazdir(arrayOlustur(baslangic, bitis));

	}

	public static String[] arrayOlustur(int baslangic, int bitis) {

		String array[] = new String[bitis - baslangic + 1];

		for (int i = 0; i < array.length; i++) {
			
			int eleman = baslangic + i;
			
			if (eleman % 15 == 0) {
				array[i] = "BilgeAdam";
			} else if (eleman % 5 == 0) {
				array[i] = "Adam";
			} else if (eleman % 3 == 0) {
				array[i] = "Bilge";
		    } else {
		    	array[i] = Integer.toString(eleman);
		    	// array[i] = eleman + "";
		    	// array[i] = String.valueOf(eleman);
		    }
		}
		return array;
	}
	
	public static void arrayYazdir(String[] dizi) {
		
		System.out.print("[");
		for (String deger : dizi) {
			System.out.print(deger + ", ");
		}
		System.out.print("]");
	}
}