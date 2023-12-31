package com.bilgeadam.lesson022.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOrnek {

	public static void main(String[] args) {
		
		/*
		 * foreach, map, mapToInt, sum
		 * reduce, filter
		 */
		
		Stream<Integer> stream = Stream.of(22, 10, 8);
		
		// stream.forEach(eleman -> System.out.println(eleman + 10));
		
		List<Integer> list = new ArrayList<>(List.of(22, 10, 8, 9, 7));
		
		list.stream().forEach(x -> {
			if (x % 2 == 0) {
				System.out.println(x + 10);
			} else {
				System.out.println(x);
			}
		});
		
		System.out.println("===================================");
		
		list.stream().forEach(s -> System.out.println(s));
		
		System.out.println("===================================");
		
		list.stream().forEach(System.out::println);
		
		int toplam = list.stream().mapToInt(Integer::intValue).sum();
		
		int toplam3 = list.stream().mapToInt(x -> Integer.valueOf(x)).sum();
		int toplam6 = list.stream().mapToInt(x -> x.intValue()).sum();
		
		double toplam2 = list.stream().mapToDouble(Integer::doubleValue).sum();
		
		double toplam4 = list.stream().mapToDouble(x -> Double.valueOf(x)).sum();
		double toplam5 = list.stream().mapToDouble(x -> x.doubleValue()).sum();
		
		System.out.println(toplam);
		System.out.println(toplam2);
		System.out.println(toplam3);
		System.out.println(toplam4);
		System.out.println(toplam5);
		System.out.println(toplam6);
		
		List<String> list2 = new ArrayList<>(List.of("1", "20", "10", "5"));
		
		int toplam7 = list2.stream().mapToInt(ifade -> Integer.parseInt(ifade)).sum();
		System.out.println(toplam7);
		
		List<String> list3 = new ArrayList<>(List.of("java", "react", "html", "css"));
		
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		map.put(1, 10);
//		map.put(2, 20);
//		map.put(3, 30);
//		map.put(4, 40);
//		map.put(5, 50);
//		map.put(6, 60);
//		
//		map.entrySet().forEach(System.out::println);
		
		// foreach stream Yapısını Sonlandırır
		System.out.println("-----------------------");
		list3.stream().forEach(x -> System.out.println(x.toUpperCase()));
		System.out.println("-----------------------");
		// map foreach'ten farklı olarak return degeri bekler
		list3.stream().map(x -> x.toUpperCase()).forEach(y -> System.out.println(y));
		System.out.println("-----------------------");
		list3.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("-----------------------");
		
		List<Integer> list4 = new ArrayList<>(List.of(22, 10, 8, 9, 7)); 
		// Her Gelen Değeri String'e Çevirip Yazdıralım		
		list4.stream().map(x -> "-" + x.toString() + "-").forEach(x -> System.out.println(x));
		// list4.stream().map(Integer::toUnsignedString).forEach(System.out::println);
		list4.forEach(x -> System.out.println("-" + x.toString() + "-"));
		
		System.out.println("Sıralı Liste:");
		list4.stream().sorted().forEach(System.out::println);
		System.out.println("-----------------------");
		list4.stream().sorted((x, y) -> x - y).forEach(System.out::println);
		
		System.out.println("Tersten Sıralı Liste:");
		list4.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//				
//			}
//		};
//		
//		Comparator<Integer> comparator2 = (o1, o2) -> {
//			return o1 - o2;
//		};
		
		System.out.println("-----------------------");
		
		// map Metodu
		List<String> list5 = new ArrayList<>(List.of("1", "20", "10", "5", "20"));
		
		List<Integer> list6 = list5.stream().map(x -> (Integer.parseInt(x)) * 5).collect(Collectors.toList());
		
		list6.forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		Set<Integer> set1 = list5.stream().map(x -> (Integer.parseInt(x)) * 5).collect(Collectors.toSet());
		
		set1.forEach(System.out::println);
	}
}