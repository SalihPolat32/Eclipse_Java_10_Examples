package com.bilgeadam.lesson002;
/*
 * Dışarıdan vize ve final bilgisi girilsin.
 * Öğrenci ismi girilsin
 * çıktı olarak ortalama 60'ınüzerinde ise öğrenci geçti,
 * altında ise öğrenc, kaldı çıtısı versi.
 * 
 * ort= vizenin  %40 finalin %60 alınır.
 */

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		int vizeNotu, finalNotu;
		double ortalama;
		String ogrenciAdı;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vize notunu giriniz.");
		vizeNotu = input.nextInt();
				
		System.out.println("Final notunu giriniz.");
		finalNotu = input.nextInt();
		
		input.nextLine();
		System.out.println("Öğrenci adı giriniz.");
		ogrenciAdı = input.nextLine();
		
		ortalama = (vizeNotu*0.4) + (finalNotu*0.6);
		System.out.println(ortalama);
		/*
		String durum = (ortalama>60)?"Geçti":"Kaldı";
			
		System.out.println(ogrenciAdı+durum);
		*/
		System.out.println((ortalama>60)?"Geçti":"Kaldı");
		
	}

}
