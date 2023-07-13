package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dairenin alanını ve çevresini alan program yazacağız.
 * 
 * dışarıdan yarıçap bilgisi alınacak.
 * 
 * cevre = 2*pi*r;
 * alan = pi*(r*r);
 * 
 */

public class Question6 {

	public static void main(String[] args) {
		
		int r;
		double pi=3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dairenin yarıçap bilgisini giriniz:");
		r = input.nextInt();
		
		double cevre = 2*pi*r;
		double alan = pi*(r*r);
		System.out.println("Dairenin çevresi: "+cevre);
		System.out.println("Dairenin alanı: "+alan);
		
		// / yazdırabilmek için iki kere yazmak lazım "" içine

	}

}
