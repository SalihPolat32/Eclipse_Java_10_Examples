package com.bilgeadam.lesson009.maraton1;

public class Soru4_CustomStringTR {

	public static void main(String[] args) {

		String str1 = "Maraton 1 bugün yapıldı.";

		String str2 = "  Bugün 9 Mayıs  ";

		char char1 = 'a';

		char char2 = 'b';

		uzunluk(str1);

		harfdegistirme(str1, char1, char2);

		bolme(str1);

		esitlikKontrolu(str1, str2);

		kacıncıIndex(str1, char1);

		buyutme(str1);

		kucultme(str1);

		boslukSilme(str2);

		birlestirme(str1, str2);

		ayırma(str1);

	}

	private static void ayırma(String ifade) {

		String[] dizi = ifade.split("a");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

	}

	private static void birlestirme(String ifade1, String ifade2) {

		System.out.println(ifade1.concat(ifade2));

	}

	private static void boslukSilme(String ifade) {

		System.out.println(ifade.trim());

	}

	private static void kucultme(String ifade) {

		System.out.println(ifade.toLowerCase());

	}

	private static void buyutme(String ifade) {

		System.out.println(ifade.toUpperCase());

	}

	private static void kacıncıIndex(String ifade, char char1) {

		System.out.println(ifade.indexOf(char1));

	}

	private static void esitlikKontrolu(String ifade1, String ifade2) {

		System.out.println(ifade1.equals(ifade2));

	}

	private static void bolme(String ifade) {

		System.out.println(ifade.substring(4, 12));

	}

	private static void harfdegistirme(String ifade, char eskiChar, char yeniChar) {

		System.out.println(ifade.replace(eskiChar, yeniChar));

	}

	private static void uzunluk(String ifade) {

		System.out.println(ifade.length());

	}
}