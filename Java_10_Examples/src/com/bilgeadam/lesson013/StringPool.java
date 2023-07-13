package com.bilgeadam.lesson013;

public class StringPool {

	public static void main(String[] args) {
		
		String isim = "Mustafa"; // Stringler değiştirelemez yenisini oluşturur.
		String isim2 = "Mustafa";
		
		System.out.println(isim == isim2);
		
		String isim3 = "Mustafa Ozturk";
		String isim4 = "Mustafa Ozturk";
		
		isim4 = "Mustafa ÖZTÜRK"; // Yeni bir yeir gösterir
		isim4 = "Serkan"; // Yeni bir yeir gösterir
		
		String isim5 = "Mustafa ÖZTÜRK";
		
		isim4  = isim5;
		System.out.println(isim4 == isim5);
		
		String isim6 = new String("Hilal");
		String isim7 = new String("Hilal");
		String isim8 = new String("Hilal");
		isim6 = isim8;
		isim7 = isim8;
		isim8 = new String("XXX");
		System.out.println(isim6 == isim7);
		System.out.println(isim7);
		
		isim6 = "Hilal";
		isim7 = "Hilal";
		System.out.println(isim6 == isim7);
		
		String isim9 = "Hilal";
		String isim10 = new String("Hilal").intern(); // intern heapten stringpool a attı
		System.out.println(isim10 == isim9);
		
	}
}