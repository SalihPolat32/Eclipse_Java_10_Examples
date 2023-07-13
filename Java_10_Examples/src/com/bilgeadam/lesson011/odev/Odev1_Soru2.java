package com.bilgeadam.lesson011.odev;

import java.util.Scanner;

public class Odev1_Soru2 {

	public static void main(String[] args) {
		
		karakterCevirme();
		
	}

	public static String karakterCevirme() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Kelime Giriniz:");
		String kelime = scanner.nextLine();
		
		char[] turkce = new char[] { 'İ', 'ı','ü', 'Ü', 'ç', 'Ç','Ğ', 'ğ','Ş', 'ş','ö','Ö'};
		char[] ingilizce = new char[] { 'I', 'i', 'u','U','c','C','G','g','S', 's','o','O'};
		
		for (int i = 0; i < turkce.length; i++) {
			
			kelime = kelime.replace(turkce[i], ingilizce[i]);
		}
		
		System.out.println(kelime);
		
		return kelime;
	}
}