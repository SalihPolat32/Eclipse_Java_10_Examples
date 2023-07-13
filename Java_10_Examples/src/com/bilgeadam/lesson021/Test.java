package com.bilgeadam.lesson021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		SansliNumaralar sansliNumaralar = new SansliNumaralar();

		sansliNumaralar.mapOlustur();

		sansliNumaralar.listeOlustur();

		sansliNumaralar.sansliNumaralariBul();

//		sansliNumaralar.map.forEach((k, v) -> System.out.println(k + " = " + v));
//		
//		for (Entry<Integer, Integer> deger : sansliNumaralar.map.entrySet()) {
//			System.out.println(deger.getKey() + " = " + deger.getValue());
//		}
//		
//		Set<Integer> keySet = sansliNumaralar.map.keySet();
//		
//		int toplam = 0;
//		for (Integer key : sansliNumaralar.map.keySet()) {
//			
//			System.out.println(key + " = " + sansliNumaralar.map.get(key));
//			
//			toplam += sansliNumaralar.map.get(key);
//		}
//		
//		System.out.println("Toplam Üretilen Sayı Miktarı: " + toplam);
//		
//		System.out.println("Liste Uzunluğu: " + sansliNumaralar.list.size());
//		
//		for (Integer sayi : sansliNumaralar.list) {
//			System.out.println(sayi);
//		}

		System.out.println("Set Uzunluğu: " + sansliNumaralar.set.size());
		for (Integer sayi : sansliNumaralar.set) {
			System.out.println(sayi);
		}

		Set<Integer> numaralar = sansliNumaralar.set;

		/*
		 * Gelen her sayıyının başına ve sonuna '-' işareti koyarak bir String listede
		 * toplayalım -5-, -9-
		 */

		numaralar.forEach(System.out::println);

		List<String> list2 = new ArrayList<>();

		for (Integer integer : numaralar) {
			list2.add("-" + integer + "-");
		}

		// List<String> list = numaralar.stream().map(x -> "-" + x.toString() +
		// "-").toList();
		List<String> list = numaralar.stream().map(x -> "-" + x.toString() + "-").collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println("===== map ====="); // Değer Döner
		numaralar.stream().map(x -> "-" + x.toString() + "-").forEach(System.out::println);

		System.out.println("===== foreach ====="); // Bir Şey Dönmez
		numaralar.stream().forEach(x -> System.out.println("-" + x.toString() + "-"));

		// filter
		System.out.println("===== filter ====="); // true Ya da false Döner
		for (Integer integer : numaralar) {
			if (integer > 50) {
				System.out.println(integer);
			}
		}

		System.out.println("-----------------------");

		// Her Zaman true ya da false dönen bir koşul yazılmalı
		numaralar.stream().filter(x -> x > 80).forEach(System.out::println);

		System.out.println("-----------------------");

		// filter'da çalıştığım collections hangi türdeyse dönen değerleri o türde bir
		// yapıda toplayabilirim
		List<Integer> list3 = numaralar.stream().filter(x -> x > 80).collect(Collectors.toList());
		list3.forEach(System.out::println);

		System.out.println("-----------------------");

		numaralar.stream().filter(x -> {
			if (x % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(System.out::println);

		System.out.println("-----------------------");

		numaralar.stream().filter(x -> !(x % 2 == 0)).forEach(System.out::println);

		System.out.println("-----------------------");

		// 70'den Küçük Olanları 2 ile Çarpıp Bir Listede Toplayalım
		
		System.out.println("===== 70'den Küçük Olanlar =====");
		
		numaralar.stream().filter(x -> x < 70).forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		List<Integer> list4 = numaralar.stream().filter(x -> x < 70).map(x -> x * 2).collect(Collectors.toList());
		System.out.println(list4);
		list4.forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		numaralar.stream().filter(x -> x < 70).map(x -> x * 2).filter(x -> x > 90).forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		numaralar.stream().filter(x -> x * 2 < 70).forEach(System.out::println);
		
		int toplam1 = numaralar.stream().filter(x -> x * 2 < 70).mapToInt(x -> x).sum();
		System.out.println("Toplam 1: " + toplam1);
		
		int toplam2 = numaralar.stream().filter(x -> x * 2 < 70).mapToInt(Integer::intValue).sum();
		System.out.println("Toplam 2: " + toplam2);
		
		// 2, 5, 10, 8, 5 ==> reduce Çalışma Prensibi
		// 2 + 5 = 7
		// 7 + 10 = 17
		// 17 + 8 = 25
		// 25 + 5 = 30
		
		int toplam3 = numaralar.stream().filter(x -> x * 2 < 70).reduce((a,  b) -> a + b).get();
		System.out.println("Toplam 3: " + toplam3);
		
		int carpim = numaralar.stream().filter(x -> x * 2 < 70).reduce(20, (a,  b) -> a * b);
		System.out.println("Çarpım: " + carpim);
		
		double bolum = numaralar.stream().filter(x -> x * 2 < 70).mapToDouble(x -> x).reduce((a,  b) -> a / b).getAsDouble();
		System.out.println("Bçlüm: " + bolum);
		
		double ortalama1 = numaralar.stream().filter(x -> x * 2 < 70).mapToInt(x -> x).average().getAsDouble();
		System.out.println("Ortalama 1: " + ortalama1);
		
		double ortalama2 = numaralar.stream().filter(x -> x * 2 < 70).collect(Collectors.averagingDouble(x -> x));
		System.out.println("Ortalama 2: " + ortalama2);
		
		int min1 = numaralar.stream().mapToInt(x -> x).min().getAsInt();
		System.out.println("Minimum 1: " + min1);
		
		int min2 = numaralar.stream().min(Integer::compareTo).get();
		System.out.println("Minimum 2: " + min2);
		
		int max1 = numaralar.stream().mapToInt(x -> x).max().getAsInt();
		System.out.println("Maksimum 1: " + max1);
		
		int max2 = numaralar.stream().max(Integer::compareTo).get();
		System.out.println("Maksimum 2: " + max2);
		
		boolean kontrol1 = numaralar.stream().anyMatch(x -> (x > 5) && (x % 2 == 0)); // Herhangi Bir Değer 5'ten Büyük Çift Mi?
		System.out.println("Kontrol 1: " + kontrol1);
		
		boolean kontrol2 = numaralar.stream().allMatch(x -> x > 15); // Bütün Değerler 15'den Büyük Mü?
		System.out.println("Kontrol 2: " + kontrol2);
		
		boolean kontrol3 = numaralar.stream().allMatch(x -> x > 5);
		System.out.println("Kontrol 3: " + kontrol3);
		
		String deger = numaralar.stream().map(x -> x.toString()).collect(Collectors.joining(","));
		System.out.println("Değer: " + deger);
		
		List<String> stringList = new ArrayList<>(List.of("Ankara", "Bolu", "Van", "Muş", "İzmir", "İstanbul", "Adana", "Antalya", "Mersin", "Artvin"));
		
		stringList.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
		
		List<String> aIleBitenler = stringList.stream().filter(x -> x.endsWith("a")).collect(Collectors.toList());
		System.out.println(aIleBitenler);
		
		stringList.stream().filter(x -> x.length() < 4 ).forEach(System.out::println);
		
		// groupingBy Kullanarak map'leme Yapıyorsak value Değeri Bir Liste Olacak
		Map<Integer, List<String>> map1 = stringList.stream().collect(Collectors.groupingBy(x -> x.length()));
		System.out.println("Map 1: " + map1);
		
		Map<Integer, List<String>> map4 = stringList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Map 4: " + map4);
		
		Map<Character, List<String>> map2 = stringList.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
		System.out.println("Map 2: " + map2);
		
		Map<String, List<String>> map3 = stringList.stream().collect(Collectors.groupingBy(x -> x.substring(0, 1)));
		System.out.println("Map 3: " + map3);
		
		Map<String, Integer> map5 = stringList.stream().collect(Collectors.toMap(x -> x, y -> y.length())); // İki Tane key Değeri Olursa Hata Verir
		System.out.println("Map 5: " + map5);
		
		// Şehire Karşılık Şehirin İlk 2 Harfi Gelecek Şekilde map'leyelim
		Map<String, String> map6 = stringList.stream().collect(Collectors.toMap(x -> x, y -> y.substring(0,2)));
		System.out.println("Map 6: " + map6);
	}
}