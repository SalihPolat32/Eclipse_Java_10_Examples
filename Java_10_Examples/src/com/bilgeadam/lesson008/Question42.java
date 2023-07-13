package com.bilgeadam.lesson008;
/*
 * Bir metot yazalım bu metotta split kullanmadan bu ifadeyi virgüllerden
 * bölüp şu çıktıyı elde edelim
 * Java
 * React
 * Spring
 * Google
 */

public class Question42 {

	public static void main(String[] args) {

		String ifade = "Java,React,Spring,Google";

		ifadeAyir(ifade);

		System.out.println("\n-----------------------------");
		ifadeayir2(ifade);

		System.out.println("-----------------------------");
		System.out.println(ifadeayir3(ifade));

		// Void metotları Print Metodu içinde kullanamayız
		// System.out.println(ifadeayir2(ifade));
	}

	public static String ifadeayir3(String ifade) {
		System.out.println("3. Metot");

		ifade = ifade.replace(",", "\n");

		return ifade;
	}

	public static void ifadeayir2(String ifade) {
		System.out.println("2. Metot");

		int index = 0;
		for (int i = 0; i < ifade.length(); i++) {

			if (ifade.charAt(i) == ',') {
				System.out.println(ifade.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(ifade.substring(index));
	}

	public static void ifadeAyir(String ifade) {
		System.out.println("1. Metot");

		for (int i = 0; i < ifade.length(); i++) {
			if (ifade.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(ifade.charAt(i));
			}
		}
	}
}