package com.bilgeadam.lesson010;
/*
 * Bir metot yazalım bu  metot çift boyutlu dizimizdeki tek sayıları
 * başka bir tek boyutlu diziye atsın daha sonra bu diziyi yazdıralım 
 */

public class Question51 {

	public static void main(String[] args) {
		
		int[][] matris = {{  56,  23, 678, 231, 5 }, 
		                  { 234,  21,  78,  26, 6 }, 
		                  { 654,  33,  32,  67, 2 }, 
		                  { 189,  35,  56,  89, 8 }};
		
		System.out.println(tekSayilariBul(matris));
		
		arrayYazdir(tekSayilarAta(matris));
		
//		for each ile iki boyutlu array yazdırma
//		for (int[] array : matris) {
//			for (int[] sayi : array) {
//				System.out.println(sayi);
//			}
//		}

	}
	
	public static int tekSayilariBul (int[][] matris) {
		
		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					sayac++;
				}
			}
		}
		return sayac;
	}
	
	public static int[] tekSayilarAta (int[][] matris) {
		
		int boyut = tekSayilariBul(matris);
		int[] tekSayilar = new int[boyut];
		int sayac = 0;
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					tekSayilar[sayac] = matris[i][j];
					sayac++;
				}
			}
		}
		return tekSayilar;
	}
	
	public static void arrayYazdir(int[] dizi) {
		
		for (int sayi : dizi) {
			System.out.println(sayi);
		}
	}
}