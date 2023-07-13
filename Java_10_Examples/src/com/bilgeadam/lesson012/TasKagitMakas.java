package com.bilgeadam.lesson012;
/*
 * Seçeneklerimiz enum olsun
 * daha sonra bu seçenekleri kullanıcıya sunup, bir tanesini seçmesini isteyelim
 * pc seçimi ise random şekilde bu 3 seçenekten biri olsun
 * daha sonra pc ile kullanıcının seçtiğini kıyaslayıp kazananı belirleyelim. 
 */

import java.util.Random;

import java.util.Scanner;

public class TasKagitMakas {

	static ESecenek[] secenekler = ESecenek.values();

	public static ESecenek secimYap() {

		for (ESecenek secenek : secenekler) {
			System.out.println(secenek.ordinal() + 1 + ") " + secenek);
		}

		/*
		 * 1) TAS 2) KAGIT 3) MAKAS
		 */

		int secim = secimKontrol();

		return secenekler[secim - 1];
	}

	public static int secimKontrol() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen TAS/KAGIT/MAKAS Verilerinden Birini Seçiniz");
		int secim = -1;

		while ((secim = scanner.nextInt()) < 1 || secim > 3) {
			System.out.println("Yanlış bir seçim yapılmıştır. Yeniden Deneyiniz.");
		}

//		do {
//			System.out.println("Lütfen 1 ile 3 Arasında Bir Sayı Giriniz.");
//			secim = scanner.nextInt();
//		} while (secim < 1 || secim > 3);
		return secim;
	}

	public static ESecenek pcSecimiYap() {

		Random random = new Random();
		int index = random.nextInt(secenekler.length); // 3 ==> 0,1,2
		return secenekler[index];
	}

	public static void oyun() {

		ESecenek secimim = secimYap();
		ESecenek pcSecim = pcSecimiYap();

		if (pcSecim == secimim) {
			System.out.println("Berabere");
		} else {
			switch (secimim) {
			case TAS:
				if (pcSecim == ESecenek.KAGIT) {
					System.out.println("Kaybettiniz.");
				} else {
					System.out.println("Kazandınız.");
				}
				break;
			case KAGIT:
				if (pcSecim == ESecenek.MAKAS) {
					System.out.println("Kaybettiniz.");
				} else {
					System.out.println("Kazandınız.");
				}
				break;
			case MAKAS:
				if (pcSecim == ESecenek.TAS) {
					System.out.println("Kaybettiniz.");
				} else {
					System.out.println("Kazandınız.");
				}
				break;

			default:
				break;
			}

		}
		System.out.println("PC Seçimi: " + pcSecim);

	}
}