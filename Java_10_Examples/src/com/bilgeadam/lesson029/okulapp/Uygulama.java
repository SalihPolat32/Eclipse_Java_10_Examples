package com.bilgeadam.lesson029.okulapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Öğrenci sınıfımızda
 * isim notort durumu ==> (geçti veya kaldı), dogumtarihi 
 * öğretmen sınımıfımız olsun ==> bir ismi olsun bir de notlarını okuduğu öğrencileri tutsun 
 * 
 * Fİle manager
 * 1 - dosyadan verileri okuyalım  ve bize bir öğrenci listesi dönsün 
 * ---> gelen her değerden bir öğrenci yaratıp listeye ekleyeceğiz 
 * ---> en sonunda da listeyi geri dönceğiz 
 * 
 * 2 - Öğretmen dosyası oluştur ==> öğretmen ismi ile bir dosya olusturup gelen 
 * listeyi bu dosyaya yazdıralım
 * 
 * 3 - Öğrencileri Getir diye bir metot yazalım dosyadan öğrencileri okuyup liste dönsün 
 * (Hangi dosyadan okuyuacagını belirtmemeiz lazım)
 */
public class Uygulama {

	public static void main(String[] args) {

		BufferedReader bufferedReader = null;

		try {

			bufferedReader = new BufferedReader(new FileReader(FileManager.path));

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		Ogretmen ogretmen1 = new Ogretmen("Berkin", bufferedReader);
		Ogretmen ogretmen2 = new Ogretmen("Mustafa", bufferedReader);
		Ogretmen ogretmen3 = new Ogretmen("Barış", bufferedReader);
		
		ogretmen1.start();
//		try {
//
//			Thread.sleep(500);
//
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//
//		}
		ogretmen2.start();
		ogretmen3.start();

		try {

			ogretmen1.join();
			// ogretmen2.join();
			// ogretmen3.join();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

//		for (int i = 0; i < 15; i++) {
//			System.out.println(System.nanoTime());
//			System.out.println(i);
//		}

		System.out.println(ogretmen1.getIsim() + " = " + ogretmen1.getOgrenciler().size());
		System.out.println(ogretmen2.getIsim() + " = " + ogretmen2.getOgrenciler().size());
		System.out.println(ogretmen3.getIsim() + " = " + ogretmen3.getOgrenciler().size());

		System.out.println(ogretmen1.getIsim() + " ==> " + ogretmen1.getOgrenciler());
		System.out.println(ogretmen2.getIsim() + " ==> " + ogretmen2.getOgrenciler());
		System.out.println(ogretmen3.getIsim() + " ==> " + ogretmen3.getOgrenciler());

		ogretmen1.dosyaOlustur();
		ogretmen2.dosyaOlustur();
		ogretmen3.dosyaOlustur();

		// ogretmen.notlariOku();
		// ogretmen.getOgrenciler().forEach(System.out::println);
		// ogretmen.dosyaOlustur();
		// dosyadanVeriOku("Mustafa").forEach(System.out::println);
		
/*		
		 ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
		  
		 List<Ogrenci> list = ogretmen.getOgrenciler().stream().map(x -> {
		 x.setOrt(x.getOrt() + 5); x.durumBelirle(x.getOrt()); 
		 return x;
		 }).collect(Collectors.toList());
		  
		 ogretmen.setOgrenciler(list);
		 ogretmen.getOgrenciler().forEach(System.out::println);
		 ogretmen.dosyaOlustur();
		 
		  ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
		  // dosyadanVeriOku("Mustafa").forEach(System.out::println)
*/
	}
}