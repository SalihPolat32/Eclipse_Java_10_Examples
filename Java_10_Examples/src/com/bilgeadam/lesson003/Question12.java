package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Kullanıcıdan alınan bir sayının çarpım taplosunu yazdıralım.
 * 
 * 10'a kadar
 * 1x1=1
 * 1x2=2
 * 1x3=3
 * 
 */

public class Question12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz: ");
		
		int sayi=scanner.nextInt();
		System.out.println("Çarpım Tablosu: ");
				for (int i=1; i<=10; i++) {
					int carpim=i*sayi;
				System.out.println(sayi+"x"+i+"= "+carpim);
		}			
	}
}
