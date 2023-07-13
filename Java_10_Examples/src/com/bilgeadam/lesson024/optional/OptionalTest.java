package com.bilgeadam.lesson024.optional;

import java.time.LocalDate;
import java.util.Optional;

import com.bilgeadam.lesson024.Utility;

public class OptionalTest {

	public static void main(String[] args) {
		
		Integer sayi = 5;
		
		Optional<Integer> sayi2 = Optional.of(10); // -> null Değerler Alamaz
		
		String deger = null;
		
		Optional<String> deger2 = Optional.ofNullable(deger); // -> null Değerler Alabilir
		
		System.out.println(sayi);
		System.out.println(sayi2);
		System.out.println(deger2);
		
		// Optional<String> deger3 = Optional.ofNullable(null);
		
		System.out.println(deger2.isEmpty());
		System.out.println(deger2.isPresent());
		
		if (deger2.isEmpty()) {
			// System.out.println(deger2.get()); // --> Boş Bir Optional Değeri ile Çağıramayız Hata Fırlatır
			System.out.println(deger2);
		}
		
		deger2 = Optional.of("5");
		
		if (deger2.isPresent()) {
			String deger3 = deger2.get();
			Integer sayi3 = sayi2.get();
			System.out.println(deger3 + sayi3);
		}
		
		Optional<LocalDate> date =  Utility.stringTarihDegeriniTarihDegerineCevirme("Lütfen Bir Tarih Değeri Giriniz:", "2022-05-20");
		
		System.out.println(date.isEmpty());
		
		if (date.isEmpty()) {
			System.out.println(date);
			System.out.println("Tarih Değeri Oluşturulamamıştır.");
		} else {
			System.out.println(date.get());
		}
	}
}