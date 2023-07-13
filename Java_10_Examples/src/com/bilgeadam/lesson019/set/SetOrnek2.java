package com.bilgeadam.lesson019.set;
/*
 * Dışarıdan bir kelime girelim her harfini bir sete atmak istiyoruz
 * tekrar edenleri bir sete tekrar etmeyenleri başka bir sete atalım
 * sonra tekrar eden ve etmeyen setleri yazdıralım
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen Bir Kelime Giriniz: ");
		String kelime = scanner.nextLine();

		Set<Character> tekrarEden = new HashSet<>();
		Set<Character> tekrarEtmeyen = new HashSet<>();

		for (int i = 0; i < kelime.length(); i++) {

			if (!tekrarEden.contains(kelime.charAt(i)) && !tekrarEtmeyen.add(kelime.charAt(i))) {
				tekrarEden.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
			}
		}
		System.out.println("Tekrar Edenler: " + tekrarEden);
		System.out.println("Tekrar Etmeyenler: " + tekrarEtmeyen);
	}
}