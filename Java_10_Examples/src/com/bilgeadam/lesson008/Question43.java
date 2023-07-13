package com.bilgeadam.lesson008;
/*
 * Bir metot yazalım menu diye
 * String işlemleri
 * 
 * 1) Harf Saydırma --> Dışarıdan Strimg bir ifade ve hangi harfi saydıracağımız sonunda bize kaç kere geçtiğini dönsün
 * eğer o harf ifade içinde yoksa aradığınız harf bulunamadı diye çıktı versin
 * 
 * 2) Harf Değiştirme
 * 
 * 3) Palindrom
 * 
 * 4) Çıkış
 */

import java.awt.Menu;
import java.util.Scanner;

import javax.tools.ForwardingJavaFileManager;

public class Question43 {

	public static void main(String[] args) {

		islem();

	}

	public static void menu() {

		System.out.println("=====STRİNG İŞLEMLERİ=====");

		System.out.println("1) Harf Saydırma");
		System.out.println("2) Harf Değiştirme");
		System.out.println("3) Palindrom");
		System.out.println("4) Çıkış");

		System.out.println("Lütfen Yapacağınız İşlemi Seçiniz.");

	}

	public static void islem() {

		Scanner scanner = new Scanner(System.in);
		int islem = 4;
		do {
			menu();
			islem = scanner.nextInt();

			switch (islem) {
			case 1:
				System.out.println("1. İşlem");
				harfSaydirma();
				break;
			case 2:
				System.out.println("2. İşlem");
				harfDegistirme();
				break;
			case 3:
				System.out.println("3. İşlem");
				palindrom();
				break;
			case 4:
				System.out.println("Çıkış Yapılıyor...");
				break;

			default:
				break;
			}
		} while (islem != 4);
	}

	private static void palindrom() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Kontrol Etmek İstediğiniz Kelimeyi Giriniz:");
		String kelime = scanner.nextLine();
		String yeniKelime = "";
		
		for(int i = (kelime.length()-1); i >= 0; i--)
        {
            yeniKelime += kelime.charAt(i);
        }
        if(yeniKelime.equals(kelime)) {
            System.out.println("Girilen kelime Palindrom bir kelimedir.");
        }
        else {
            System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
        }
		
	}

	public static String stringDegerAl(String sorgu) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(sorgu);
		String kelime = scanner.nextLine();
		return kelime;
	}

	public static void harfDegistirme() {

		String kelime = stringDegerAl("Lütfen Bir Kelime Giriniz.");

		String harf = stringDegerAl("Lütfen Değiştirmek İstediğiniz Harfi Giriniz.");

		String yeniHarf = stringDegerAl("Lütfen Yeni Harfi Giriniz.");

		kelime = kelime.replace(harf, yeniHarf);
		System.out.println(kelime);

	}

	public static void harfSaydirma() {

		String kelime = stringDegerAl("Lütfen Bir Kelime Giriniz.");
		String harf = stringDegerAl("Lütfen Sayılması İstediğiniz Harfi Giriniz.");

		char karakter = harf.charAt(0);

		int sayac = 0;
		if (!kelime.contains(harf.substring(0, 1))) {
			System.out.println("Kelime Girdiğiniz Harfi İçermiyor.");
			return;
		}
		for (int i = 0; i < kelime.length(); i++) {
			System.out.println("For Dögüsü Kontrol");
			if (kelime.charAt(i) == karakter) {
				sayac++;
			}
		}
		System.out.println(kelime + " de " + sayac + " kadar " + harf.substring(0, 1) + " içeriyor.");
	}
}