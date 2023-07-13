package com.bilgeadam.lesson003;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/*
 * 1'den girdiğimiz sayıya kadar olan sayıların
 * toplamını ekrana yazdır.
 */

public class Question10 {

	public static void main(String[] args) {
		
		System.out.println("-------For İle------");
		
		int sayi;
		int toplam = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayı Giriniz: ");
	    sayi = scanner.nextInt();
	    
		
		 for (int i=1; i<=sayi; i++) {
			 toplam += i;			
		}
		 System.out.println("Toplam: "+toplam);
		 
		 System.out.println("-------While İle------");
		 
		 int sayi2;
		 int toplam2 = 0;
		 Scanner scanner2 = new Scanner(System.in);
		 System.out.println("Lütfen İkinci Sayıyı Giriniz: ");
		 sayi2 = scanner2.nextInt();
		    
		 int j=1;
		 while (j<=sayi2) {	
			toplam2 += j;	
			j++;
			} 			
			 System.out.println("Toplam: "+toplam2);
	}
}
