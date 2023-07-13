package com.bilgeadam.lesson009.maraton1;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Cümlenizi Giriniz:");
		String cumle = scanner.nextLine();
		System.out.println("Lütfen Cümle içinde Sayılacak Karekteri Giriniz:");
		char karakter = scanner.next().charAt(0);

		karakterSayici(cumle, karakter);

	}

	private static void karakterSayici(String cümle, char harf) {

		if (cümle.contains(String.valueOf(harf))) {

			char[] array = cümle.toCharArray();
			int sayac = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == harf) {
					sayac++;
				}
			}
			System.out.println(cümle + " cümlesi " + sayac + " kadar " + harf + " içeriyor.");

		} else {
			System.out.println(cümle + " cümlesi 0 kadar " + harf + " içeriyor.");
		}
	}
}