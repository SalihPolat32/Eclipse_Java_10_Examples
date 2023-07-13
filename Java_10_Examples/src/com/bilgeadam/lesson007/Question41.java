package com.bilgeadam.lesson007;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 1 metot yazalım dışarıdan bir ülke ismi alalım bu ülke ismi dizimizde geçiyor mu
 * onu kontrol edelim ve geçiyorsa console Girdiğiniz Ülke Bulundu
 * eğer yokasa Girdiğiniz Ülke Bulunamadı!!! çıktısını verelim.
 */

public class Question41 {

	public static void main(String[] args) {

		String[] dizi = { "Türkiye", "Moğolistan", "Japonya", "Fransa", "Danimarka" };

		ulkeKontrol(dizi);

		ulkeKontrol2(dizi);

	}

	public static void ulkeKontrol(String[] dizi) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Ülke Adı Giriniz: ");
		String ulkeAdi = scanner.nextLine();
		boolean kontrol = false;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals(ulkeAdi)) {
				kontrol = true;
				break;
			}
		}
		if (kontrol) {
			System.out.println(ulkeAdi + ": Ülke Bulundu");
		} else {
			System.out.println(ulkeAdi + ": Ülke Bulunamadı!!!");
		}
	}

	public static void ulkeKontrol2(String[] dizi) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Ülke Adı Giriniz: ");
		String ulkeAdi = scanner.nextLine();
		String result = ulkeAdi + "=> Ülke Bulunamadı!!!";

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals(ulkeAdi)) {
				result = ulkeAdi + "=> Ülke Bulundu";
				break;
			}
		}
		System.out.println(result);
	}
}