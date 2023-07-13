package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * Dışarıdan girilen bir sayının asal olup olmadığını bulalım
 * 
 * asal ise asaldır
 * değil ise asal değildir çıktısı yazsın
 */

public class Question23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Sayı Giriniz");
		int sayi = scanner.nextInt();
		int i;
		for (i = 2; i <= sayi/2; i++) { 
	       if(sayi % i == 0) {
	           break;
	         } 
		}
		if (i > sayi/2) {
			System.out.println(sayi+" Sayısı Asaldır.");
		}
		else {
			System.out.println(sayi+" Sayısı Asal Değildir.");
		}
	}
}
