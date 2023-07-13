package com.bilgeadam.lesson004;

import java.util.Scanner;
/*
* 
* telefon kod mail kod başlangıc değerlerini biz kendimiz atayacağız (int)
* 
* daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için kod
* alacağız
* 
* eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
* 
* eğer mail kodu hatalı ise mail kodu hatalı çıktısını verelim
* 
*/

public class Question20 {

	public static void main(String[] args) {
		
		int telefonKodu=90, mailKodu=55;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Telefon Kodu Giriniz.");
		int yeniTelefonKodu = scanner.nextInt();
		System.out.println("Lütfen Mail Kodu Giriniz.");
		int yeniMailKodu = scanner.nextInt();
		if (telefonKodu==yeniTelefonKodu) {
			System.out.println("Telefon Kodu Doğru.");
		} else {
			System.out.println("Telefon Kodu Yanlış.");
		}
		if (mailKodu==yeniMailKodu) {
			System.out.println("Mail Kodu Doğru.");
		} else {
			System.out.println("Mail Kodu Yanlış.");
		}
	}
}
