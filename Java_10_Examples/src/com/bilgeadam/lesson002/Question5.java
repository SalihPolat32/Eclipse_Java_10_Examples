package com.bilgeadam.lesson002;

import java.util.Scanner;

import javax.sound.sampled.Line;

/*
 * Dışarıdan veri alma ile ilgili örnekler.
 * 
 * Scanner
 * 
 */

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir isim girin.");
		String isim = input.nextLine();
		
		System.out.println("İsim = "+isim);
		// Toplu yorum satırı ctrl shift c
		int sayi1 = 10;
		System.out.println("Lütfen bir sayı giriniz.");
		int sayi2 = input.nextInt();
		System.out.println("Lütfen bir sayı daha giriniz.");
		double sayi3 = input.nextDouble(); // consoldan ondalık değerleri , lie girelim 25,4
		/*
		long sayi4 = input.nextLong();
		float sayi5 = input.nextFloat();
		*/
		
		// Dışarıdan char değeri alınamaz.
		
		System.out.println("Sonuç = "+(sayi1+sayi2+sayi3));
		// int (sayısal) değerden bir String değer almak istiyorsak mutlaka boş bir nextLine() kullanalım.
		input.nextLine();
		System.out.println("Lütfen bir isim giiriniz.");
		String isim2 = input.nextLine();
		System.out.println("isim2: "+isim2);
		
		System.out.println("Lütfen yeni bir isim giriniz.");
		isim2=input.nextLine();
		System.out.println("isim2: "+isim2);
	}

}
