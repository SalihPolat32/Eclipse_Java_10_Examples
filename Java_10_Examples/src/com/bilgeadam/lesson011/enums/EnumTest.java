package com.bilgeadam.lesson011.enums;

public class EnumTest {

	public static void main(String[] args) {
		
		EAylar haziran = EAylar.HAZIRAN;
		
		// Stringe Çevirme Metotları
		String haziranString = EAylar.HAZIRAN.toString();
		String haziranString2 = EAylar.HAZIRAN.name();
		
		System.out.println(haziran);
		System.out.println(haziranString);
		System.out.println(haziranString2);
		
		// Enum Sırasını Bir int Değer Olarak Alma Yani indexini Alma
		System.out.println(EAylar.HAZIRAN.ordinal());
		System.out.println(EAylar.TEMMUZ.ordinal());
		System.out.println(EAylar.AGUSTOS.ordinal());
		
		//Bir Stringi enuma Çevirme
		String ay = "temmuz";
		
		EAylar enumAylar = EAylar.valueOf(ay.toUpperCase());
		System.out.println(enumAylar);
		
		//Bir enum Yapısını Arraya Çevirme
		EAylar[] diziAylars = EAylar.values();
		System.out.println("--------------------");
		
		for (EAylar ay1 : diziAylars) {
			if (ay1.gun == 30 && ay1.mevsim.equalsIgnoreCase("yaz")) {			
			System.out.println(ay1.ordinal() + 1 + " " + ay1.toString());
			System.out.println(ay1.mevsimGetir());
			}
		}
		
		System.out.println(EAylar.HAZIRAN.gun);
	}
}