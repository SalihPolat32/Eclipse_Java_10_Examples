package com.bilgeadam.lesson004;

import java.util.Scanner;
/*
* 
* telefon kod mail kod başlangıc değerlerini biz kendimiz atayacağız (int)
* 
* daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için kod
* alacağız
* 
* ikisi de doğru ise sisteme kayıt olunuz
* telefon doğru mail yanlış ise => e mail kodu hatalıdır
* e mail doğru telefon yanlış ise => telefon kodu hatalıdır 
* ikisi de yanlış ise => telefon ve e mail kodu hatalıdır.
* 
*/

public class Question21 {
	
public static void main(String[] args) {
		
		int telefonKodu=10, mailKodu=20;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Telefon Kodu Giriniz.");
		int yeniTelefonKodu = scanner.nextInt();
		System.out.println("Lütfen Mail Kodu Giriniz.");
		int yeniMailKodu = scanner.nextInt();
		if (telefonKodu==yeniTelefonKodu&&mailKodu==yeniMailKodu) {	
			System.out.println("Sisteme Kayıt Olunuz.");
		} else if (telefonKodu==yeniTelefonKodu&&mailKodu!=yeniMailKodu) {
			System.out.println("Mail Kodu Hatalıdır.");
		} else if (telefonKodu==yeniTelefonKodu&&mailKodu!=yeniMailKodu) {
			System.out.println("Mail Kodu Hatalıdır.");
		} else if (telefonKodu!=yeniTelefonKodu&&mailKodu==yeniMailKodu) {
			System.out.println("Telefon Kodu Hatalıdır.");
		} else { 
			System.out.println("Telefon ve Mail Kodu Hatalıdır.");
		}
    }
}
