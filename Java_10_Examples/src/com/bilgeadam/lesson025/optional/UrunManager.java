package com.bilgeadam.lesson025.optional;
/*
 * urunOlustur() metodu ==> Eğer ürün ismim boş ise veya fiyatım sıfırdan küçük girilmiş ise booş bir nesne dönsün
 * bunlar doğru girilmiş ise ürün oluşturulabilir.
 */

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class UrunManager {

	Scanner scanner = new Scanner(System.in);

	public Optional<Urun> urunOlustur() {

		Urun urun = null;

		try {

			System.out.println("Ürün Adı Giriniz:");
			String ad = scanner.nextLine();
			System.out.println("Ürün Fiyatı Giriniz:");
			double fiyat = Double.parseDouble(scanner.nextLine());
			System.out.println("Ürün Son Kullanma Tarihini Giriniz:");
			LocalDate date = LocalDate.parse(scanner.nextLine());

			if (ad.isBlank() || fiyat < 0) {

				// Optional.ofNullable(null);
				return Optional.empty();
			} else {

				return Optional.of(new Urun(ad, fiyat, date));
			}

		} catch (Exception e) {

			System.out.println(e.toString());
			return Optional.empty();
		}
	}

	public static void main(String[] args) {

		UrunManager urunManager = new UrunManager();

//		Optional<Urun> urun = urunManager.urunOlustur();
//		System.out.println(urun);
//
//		Optional<Urun> urun2 = urun.filter(x -> x.getFiyat() > 50);
//		System.out.println(urun2);
//
//		urunManager.urunOlustur().ifPresent(x -> System.out.println("İsim: " + x.getIsim()));
//
//		urunManager.urunOlustur().ifPresentOrElse(x -> System.out.println("İsim: " + x.getIsim()),
//				() -> System.out.println("Ürün Yoktur."));
//		
//		Urun urun = urunManager.urunOlustur().orElse(new Urun("XXX", 1000, null));
//		System.out.println(urun);
//		
//		Urun urun = urunManager.urunOlustur().orElseThrow();
//		System.out.println(urun);
//		
//		Urun urun = urunManager.urunOlustur().orElseThrow(() -> new RuntimeException("Hata Olustu"));
//		System.out.println(urun);
//		
//		Urun urun = urunManager.urunOlustur().orElseGet(() -> new Urun("abc", 80, null));
//		System.out.println(urun);
		
		Optional<Urun> urun = urunManager.urunOlustur();
		
		if (urun.isPresent()) {
			
		} else {
			
		}
	}
}