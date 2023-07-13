package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayı Giriniz.");
		int sayi = scanner.nextInt();
		boolean asalMi = true;
		
		if (sayi < 2) {
			asalMi = false;			
		} else {
			for (int i = 2; i < sayi/2; i++) {
				if (sayi % i == 0) {
					asalMi =false;
					break;
				}
			}
		}
		if (asalMi) {
			System.out.println(sayi+" Asal Sayıdır.");			
		} else {
			System.out.println(sayi+" Asal Sayı Değildir.");
		}
	}
}
