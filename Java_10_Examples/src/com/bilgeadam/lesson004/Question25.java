package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Hangi Boy Pizza İstediğinizi Giriniz.");
		String boyut2 = scanner.nextLine();
		String boyut = "XLL"; // S-M-LXL Pizza Boyutlarımız
		
		switch (boyut2) {
		case "S":
			System.out.println("Küçük Boy Pizza Seçtiniz.");
			break;
		case "M":
			System.out.println("Orta Boy Pizza Seçtiniz.");
			break;
		case "L":
			System.out.println("Büyük Boy Pizza Seçtiniz.");
			break;
		case "XL":
			System.out.println("En Büyük Boy Pizza Seçtiniz.");
			break;
		default:
			System.out.println("Yanlış Bir Seçim Yaptınız. Lütfen S/M/L/XL Değerlerinden Birini Seçiniz.");
			break;
		}
	}

}
