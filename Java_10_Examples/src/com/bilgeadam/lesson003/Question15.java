package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Girilen sayının toplamını ekrana yazdıralım
 * ve kaç basamaklı olduğunu yazdıralım
 */
// Önce işi yapıyor sonra kontrol ediyor.
// While olan yerde do while kullanılabilir
public class Question15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz: ");

        int basamakDegeri;
		int sayi = scanner.nextInt();
		int sayac=0;
		int toplam=0;
		
		do {
			basamakDegeri=sayi%10;
			toplam += basamakDegeri;
			sayi=sayi/10;  //sayi/=10;
			sayac++;
		} while (sayi!=0); //(sayi>0)-(sayı>=1) hepsi şart olabilir
		System.out.println("Toplam: "+toplam);
		System.out.println("Basamak Sayısı: "+sayac);
		
		System.out.println("-----While ile Çözüm-----");
		
		while (sayi!=0) {
			basamakDegeri=sayi%10;
			toplam += basamakDegeri;
			sayi=sayi/10;  //sayi/=10;
			sayac++;
		}
		System.out.println("Toplam: "+toplam);
		System.out.println("Basamak Sayısı: "+sayac);
		
		System.out.println("-----For ile Çözüm-----");
		
		sayac=0;
		toplam=0;
		System.out.println("Bir Sayı Giriniz: ");
		for (int sayi2=scanner.nextInt() ; sayi2>0; sayi2/=10) {
			basamakDegeri = sayi2%10;
			toplam+=basamakDegeri;
			sayac++;
		}
		
       /*
        for (int sayi2=scanner.nextInt() ; sayi2>0) {
			basamakDegeri = sayi2&10;
			toplam+=basamakDegeri;
			sayi2/=10
			sayac++;
        */
		System.out.println("Toplam: "+toplam);
		System.out.println("Basamak Sayısı: "+sayac);
	}
}
