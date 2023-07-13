package com.bilgeadam.lesson009.maraton1;

public class Soru1 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			System.out.println("* * * * * * *");
		}

		for (int i = 6; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}