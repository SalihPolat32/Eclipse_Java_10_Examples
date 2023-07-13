package com.bilgeadam.lesson006;
/*
 * Uzunluğu 5 olan bir int dizisi tanımlayıp
 * dışarıdan aldığımız değerleri bu diziye atayalım.
 * Ve daha sonra bu dizinin elemanlarını yazdıralım.
 */

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] myArrays = new int[5];
		
		for (int i = 0; i < myArrays.length; i++) {
			System.out.println("Lütfen "+(i+1)+". Sayıyı Giriniz.");
			myArrays[i] = scanner.nextInt();			
		}
		for (int i = 0; i < myArrays.length; i++) {
			System.out.print(myArrays[i]+" ");
		}
	}
}