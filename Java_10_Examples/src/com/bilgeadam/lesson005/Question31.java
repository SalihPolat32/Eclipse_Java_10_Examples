package com.bilgeadam.lesson005;

public class Question31 {

	public static void main(String[] args) {
		
		String kelime = "Javaflmfvxkfvjlkxfjvfkljvdlrjorpj";
		char [] array = {'J','a','v','a'};
		char [] array2 = kelime.toCharArray();
		
		char karakter = kelime.charAt(0); // İndex değeri her zaman 0'dan başlar.
		char karakter1 = kelime.charAt(1);
		char karakter2 = kelime.charAt(2);
		char karakter3 = kelime.charAt(3);
		int sonIndex = kelime.length() - 1;
		char sonKarakter = kelime.charAt(kelime.length()-1);
		char sonKarakter2 = kelime.charAt(sonIndex);
		System.out.println(karakter);
		System.out.println(karakter1);
		System.out.println(karakter2);
		System.out.println(karakter3);
		System.out.println(sonKarakter);
		System.out.println(sonKarakter2);
		System.out.println(kelime.length()); // Karakter sayısını söyler.
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.println(i+". indexteki Karakter: "+kelime.charAt(i));
		
		}
	}
}