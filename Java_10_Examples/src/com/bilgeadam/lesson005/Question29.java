package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * Mükemmel Sayı
 * 
 * Dışarıdan Girilen Bir Sayının Mükemmel Sayı Olup Olmadığını Bulup
 * Sonucunu Yazdırsın
 * 
 * 6=1+2+3 Kendisi Hariç Tam Bölenlerinin Toplamı Kendisine Eşit Olan
 */

public class Question29 {

	public static void main(String[] args) {

		int toplam = 0, sayac = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayı Giriniz:");
		int sayi = scanner.nextInt();

		while (sayac <= sayi/2) {
			if (sayi % sayac == 0) {
				toplam += sayac;
				sayac++;
			} else {
				sayac++;
			}
		}
		if (toplam == sayi) {
			System.out.println("Girdiğiniz Sayı Mükemmel Sayıdır.");
		} else {
			System.out.println("Girdiğiniz Sayı Mükemmel Sayı Değildir.");
		}
	}
}