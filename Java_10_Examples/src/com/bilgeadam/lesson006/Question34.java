package com.bilgeadam.lesson006;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/*
 * deger string karakterleri toplamı kaçtır.
 */
public class Question34 {

	public static void main(String[] args) {

		String deger = "1243";
		int toplam = 0;
		int toplam2 = 0;
		int toplam3 = 0;

		for (int i = 0; i < deger.length(); i++) {
			char a = deger.charAt(i);
			// ascii tablosunda karşılık gelen int değer örnek 1 in karşılığı 49'dur
			toplam3 += a;

			// char dan Stringe çevirme
			String karakter = String.valueOf(a);
			String karakter2 = Character.toString(a); // İkisi de olur.

			// String ten int e çevirme işlemi
			int sayi = Integer.parseInt(karakter);

			// Karakterden direkt int e çevirme (Bire bir int karşılığı)
			int sayi2 = Character.getNumericValue(a);

			toplam = toplam + sayi;
			toplam2 += sayi2;
		}
		System.out.println("Karakter Değerleri Toplamı: " + toplam);
		System.out.println(toplam2);
		System.out.println(toplam3);
	}
}