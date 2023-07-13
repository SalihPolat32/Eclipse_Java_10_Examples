package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * 1'den girdiğimiz sayıya kadar olan çift sayıların toplamı
 * if kullanmadan
 */

public class Question11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Sayı Giriniz: ");
		int sayi = scanner.nextInt();
		int ciftToplam = 0;
				
		for (int i=2; i<=sayi; i+=2) {
			 ciftToplam+=i;			
		}		
		System.out.println("Çift Toplam: "+ciftToplam);
		
		ciftToplam=0;
		
		for (int i=1; i<=sayi; i++) {
			int a=i%2==0?i:0;
			ciftToplam+=a;
		}
		System.out.println("Çift Toplam: "+ciftToplam);
	}
}
