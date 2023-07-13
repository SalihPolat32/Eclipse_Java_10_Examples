package com.bilgeadam.lesson002;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/*
 * Dışarıdan 2 tane sayı alıp toplayalım.
 * Ve bu sayı çift ise ekrana true değilse false yazsın.
 */

public class Question7 {

	public static void main(String[] args) {
		
		int sayi1, sayi2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayı1 giriniz.");
		
		sayi1 = input.nextInt();
				
		System.out.println("Sayı2 giriniz.");
		
		sayi2 = input.nextInt();
		
		boolean sonuc = (sayi1+sayi2) % 2 == 0;
		
		System.out.println(sonuc);
		
		System.out.println((sayi1+sayi2)%2==0?"Çift":"Tek");
		
	}

}
