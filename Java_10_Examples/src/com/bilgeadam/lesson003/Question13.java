package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Dışarıdan girilen bir sayının faktöriyelini hesaplayalım.
 */

public class Question13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayı Giriniz: ");
		int faktoriyel = 1;
		int sayi = scanner.nextInt();
		int i=1;
		
	    while (sayi>=i) {
	    	faktoriyel*=sayi;
	    	sayi--;	
		}
			
		System.out.println("Faktöriyel Değeri: "+faktoriyel);
		
		System.out.println("Lütfen Bir Sayı Giriniz: ");
		int sayi1 = scanner.nextInt();
		faktoriyel=1;
		for (int j=1; j<=sayi1 ; j++) { // Birer birer arttırma
			faktoriyel*=j;
				
		}
		System.out.println("Faktöriyel Değeri: "+faktoriyel);
		
		System.out.println("Lütfen Bir Sayı Giriniz: ");
		int sayi2 = scanner.nextInt();
		faktoriyel=1;
		for (int k=sayi2; k>=1 ; k--) { // Birer birer azaltma
			faktoriyel*=k;
				
		}
		System.out.println("Faktöriyel Değeri: "+faktoriyel);
	}
}
