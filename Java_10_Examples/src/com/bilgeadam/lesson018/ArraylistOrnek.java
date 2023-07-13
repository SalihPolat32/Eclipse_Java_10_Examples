package com.bilgeadam.lesson018;
/*
 * Bir tane liste oluşturalım
 * 
 * Ankara - Bursa - Antalya - Artvin - Erzurum - Çanakkale - Karaman
 * 
 * an ile başlayan şehirleri silelim
 */

import java.util.ArrayList;
import java.util.List;

public class ArraylistOrnek {

	public static void main(String[] args) {

		List<String> sehirler = new ArrayList<>();

		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bursa");
		sehirler.add("Artvin");
		sehirler.add("Erzurum");
		sehirler.add("Çanakkale");
		sehirler.add("Antalya");
		sehirler.add("Ankara");
		sehirler.add("Karaman");
		sehirler.add("Ankara");
		sehirler.add("Ankara");

		System.out.println(sehirler);

		for (int i = 0; i < sehirler.size(); i++) {
			System.out.println("Liste Boyutu: " + sehirler.size());
			if (sehirler.get(i).startsWith("An")) {
				sehirler.remove(i);
				i--;
			}
		}

//		for (int i = 0; i < sehirler.size(); i++) {
//			System.out.println("Liste Boyutu: " + sehirler.size());
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.set(i, "XXX");
//			}
//		}
//		
//		for (int i = 0; i < sehirler.size(); i++) {
//			System.out.println("Liste Boyutu: " + sehirler.size());
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				sehirler.add(i, "XXX");
//			}
//		}
//		
//		for (int i = 0; i < sehirler.size(); i++) {
//			System.out.println("Liste Boyutu: " + sehirler.size());
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.set(i, sehirler.get(i).replace("An", "XXX"));
//			}
//		}
		System.out.println(sehirler.toString()); // System.out.println(sehirler);
	}
}