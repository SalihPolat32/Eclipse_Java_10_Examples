package com.bilgeadam.lesson004;
/*
 * İki tane sayı değişkenimiz olsun
 * 
 * dışarıdan bir işlem seçeceğiz (toplama,çıkarma,çarpma,bölme) (+,-,*,/)
 * 
 * dışarıdan seçtiğimşz işleme göre bize o işlemin sonucunu bulsun,
 * ve sonucu yazdırsın.
 */

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		
		int sayi1 = 58, sayi2 = 94;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Yapılacak İşlemi Giriniz. (+,-,*,/)");
		String islem = scanner.next();
		
		switch (islem) {
		case "+":
			int sonuc1 = sayi1 + sayi2;
			System.out.println("Toplama İşleminin Sonucu: "+sonuc1);
			break;
		case "-":
			int sonuc2 = sayi1 - sayi2;
			System.out.println("Çıkarma İşleminin Sonucu: "+sonuc2);
			break;
		case "*":
			int sonuc3 = sayi1 * sayi2;
			System.out.println("Çarpma İşleminin Sonucu: "+sonuc3);
			break;
		case "/":
			double sonuc4 = (double) sayi1 /+ sayi2;
			System.out.println("Bölme İşleminin Sonucu: "+sonuc4);
			break;
		default:
			System.out.println("Yanlış Bir Seçim Yaptınız. Lütfen (+),(-),(*),(/) Değerlerinden Birini Seçiniz.");
			break;
		}
			
		

	}

}
