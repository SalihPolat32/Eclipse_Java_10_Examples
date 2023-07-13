package com.bilgeadam.lesson020;
/*
* bu iki arraydan bir map olusturalım
* ve map uzerinde çalışalım
* dışarıdan girilen kelimen turkce karakteri varsa ingilizce karaktere cevireceğiz
*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class KarakterDegistirme2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Kelime Giriniz:");
		String kelime = scanner.nextLine();

		char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };

		char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };

		Map<Character, Character> map = new TreeMap<>();

		for (int i = 0; i < kelime.length(); i++) {
			
			map.put(turkishWords[i], englishWords[i]);
		}

		char[] kelimeDizi = kelime.toCharArray();
		
		for (int i = 0; i < kelimeDizi.length; i++) {
			
			if (map.containsKey(kelimeDizi[i])) {
				kelimeDizi[i] = map.get(kelimeDizi[i]);
			}
		}

		String yeniKelime = String.valueOf(kelimeDizi);
		System.out.println("Orijinal kelime: " + kelime);
		System.out.println("Çevrilmiş kelime: " + yeniKelime);
	}
}