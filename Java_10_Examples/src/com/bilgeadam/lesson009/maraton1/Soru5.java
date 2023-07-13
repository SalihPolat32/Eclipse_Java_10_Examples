package com.bilgeadam.lesson009.maraton1;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {

		yildiz();
		System.out.println("* Geometrik Hesaplayıcı *");
		yildiz();

		String giris = "1. Kare alan hesaplama\r\n" + "2. Kare çevre hesaplama\r\n" + "3. Dikdörtgen alan hesaplama\r\n"
				+ "4. Dikdörtgen çevre hesaplama\r\n" + "5. Daire alan hesaplama\r\n" + "6. Daire Çevre hesaplama\r\n"
				+ "7. Çıkış";

		System.out.println(giris);

		Scanner scanner = new Scanner(System.in);
		int sayi = 0;

		do {
			System.out.println("Lütfen Yapmak İstediğiniz İşlem Numarasını Giriniz:");
			sayi = scanner.nextInt();

			switch (sayi) {
			case 1:
				kareAlani();
				break;
			case 2:
				kareCevre();
				break;
			case 3:
				dikdortgenAlan();
				break;
			case 4:
				dikdorgenCevre();
				break;
			case 5:
				daireAlan();
				break;
			case 6:
				daireCevre();
				break;
			case 7:
				System.out.println("Çıkış Yapılıyor...");
				break;

			default:
				if (sayi > 7) {
					System.out.println("Lütfen Menüdeki İşlemlerden Birini Seçiniz.");
				}
				break;
			}
		} while (sayi != 7);

	}

	private static double daireCevre() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz Dairenin Yarıçapını Giriniz:");
		int sayi = scanner.nextInt();
		double pi = 3.14;
		double sonuc = 2 * pi * sayi;
		System.out.println(sonuc);
		return sonuc;

	}

	private static double daireAlan() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dairenin Yarıçapını Giriniz:");
		int sayi = scanner.nextInt();
		double pi = 3.14;
		double sonuc = pi * sayi * sayi;
		System.out.println(sonuc);
		return sonuc;

	}

	private static int dikdorgenCevre() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz Dikdörtgenin Kısa Kenarını Giriniz:");
		int sayi1 = scanner.nextInt();
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz Dikdörtgenin Uzun Kenarını Giriniz:");
		int sayi2 = scanner.nextInt();
		int sonuc = (sayi1 + sayi2) * 2;
		System.out.println(sonuc);
		return sonuc;

	}

	private static int dikdortgenAlan() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dikdörtgenin Kısa Kenarını Giriniz:");
		int sayi1 = scanner.nextInt();
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dikdörtgenin Uzun Kenarını Giriniz:");
		int sayi2 = scanner.nextInt();
		int sonuc = sayi1 * sayi2;
		System.out.println(sonuc);
		return sonuc;

	}

	private static int kareCevre() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz Karenin Bir Kenarını Giriniz:");
		int sayi = scanner.nextInt();
		int sonuc = (sayi + sayi) * 2;
		System.out.println(sonuc);
		return sonuc;
	}

	private static int kareAlani() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Karenin Bir Kenarını Giriniz:");
		int sayi = scanner.nextInt();
		int sonuc = sayi * sayi;
		System.out.println(sonuc);
		return sonuc;

	}

	public static void yildiz() {

		System.out.println("******************************");

	}
}