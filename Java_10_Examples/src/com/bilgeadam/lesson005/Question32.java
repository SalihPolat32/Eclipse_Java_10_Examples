package com.bilgeadam.lesson005;
/*
 * Dışarıdan bir kelime girelim
 * Bu kelime içerisinde küçük a kaç defa geçiyor bize söylesin 
 */

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Kelime Giriniz");
		String kelime = scanner.nextLine();
		int sayac = 0;
		
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'a') {
				sayac++;
			}
		}
		System.out.println(sayac+" tane a harfi vardır.");
	}
}