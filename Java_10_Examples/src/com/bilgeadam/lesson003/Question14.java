package com.bilgeadam.lesson003;
/*
 * 1 den başlayarak sayıları toplayalım
 * toplam 50 den büyük olana kadar program çalışşsın
 * sonunda toplamı ve kaç kere çalıştığını yazsın.
 */

public class Question14 {

	public static void main(String[] args) {
		
		// Döngünün nereden bittiğini bilmiyorsak while döngüsü daha iyi olur.
		
		int sayac=0;
		int toplam=0;
		int sayi=0;
		
		while (toplam<=50) {
			sayi++;
			toplam+=sayi;
			sayac++;
			System.out.println("Döngü Toplam: "+toplam+" Döngü Sayısı "+sayac);
			
		}
		System.out.println("Toplam: "+toplam);
		System.out.println("Sayaç: "+sayac);
		System.out.println("Sayaç: "+sayi);

	}

}
