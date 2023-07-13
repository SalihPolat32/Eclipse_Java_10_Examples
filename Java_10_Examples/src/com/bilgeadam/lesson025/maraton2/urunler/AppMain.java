package com.bilgeadam.lesson025.maraton2.urunler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppMain {

	public static void main(String[] args) {

		List<Urun> urunSepeti = new ArrayList<>();

		Urun urun1 = new Urun("Elma", 42);
		Urun urun2 = new Urun("Armut", 35);
		Urun urun3 = new Urun("Muz", 38);
		Urun urun4 = new Urun("Çilek", 40);
		Urun urun5 = new Urun("Erik", 32);
		Urun urun6 = new Urun("Şeftali", 50);

		urunSepeti.add(urun1);
		urunSepeti.add(urun2);
		urunSepeti.add(urun3);
		urunSepeti.add(urun4);
		urunSepeti.add(urun5);
		urunSepeti.add(urun6);

		Map<String, Double> urunMap = new HashMap<>();
		
		urunMap = urunSepeti.stream().filter(x -> x.getFiyat() >= 35 && x.getFiyat() <= 40)
				.collect(Collectors.toMap(x -> x.getIsim(), x -> x.getFiyat()));
		
		System.out.println("35 TL ve 40 TL Fiyat Aralığındaki Ürünler:");
		urunMap.forEach((k, v) -> System.out.println(k + "'in fiyatı " + v));
	}
}