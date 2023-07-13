package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArraylistVsLinkedList {

	public static void main(String[] args) {

//		System.out.println(System.currentTimeMillis());
//		System.out.println(System.nanoTime());
		
		// Başa sona veri ekleme ve getirme işleminde arraylist avantajlı
		// Veriyi ekleme silme linkedlist avantajlı

		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		long baslangic = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}
		long bitis = System.nanoTime();
		long arraylistSuresi = bitis - baslangic;

		baslangic = System.nanoTime();

		for (int i = 0; i < 10000000; i++) {
			linkedList.add(i);
		}
		bitis = System.nanoTime();
		long linkedlistSuresi = bitis - baslangic;

		System.out.println("Arraylist: " + arraylistSuresi);
		System.out.println("Linkedlist: " + linkedlistSuresi);

		// Rastgele Erişim

		Random random = new Random();
		long index = random.nextInt(10000000);

		// Arraylist
		baslangic = System.nanoTime();
		arrayList.get((int) index);
		bitis = System.nanoTime();
		arraylistSuresi = bitis - baslangic;

		// linkedlist
		baslangic = System.nanoTime();
		linkedList.get((int) index);
		bitis = System.nanoTime();
		linkedlistSuresi = bitis - baslangic;

		System.out.println("------------------------------------");
		System.out.println("Arraylist: " + arraylistSuresi);
		System.out.println("Linkedlist: " + linkedlistSuresi);

		// Araya Veri Ekleme Süresi

		long index2 = random.nextInt(10000000);

		// Arraylist
		baslangic = System.nanoTime();
		arrayList.set((int) index2, 52562);
		bitis = System.nanoTime();
		arraylistSuresi = bitis - baslangic;

		// linkedlist
		baslangic = System.nanoTime();
		linkedList.set((int) index2, 25698);
		bitis = System.nanoTime();
		linkedlistSuresi = bitis - baslangic;

		System.out.println("------------------------------------");
		System.out.println("Arraylist Ekleme: " + arraylistSuresi);
		System.out.println("Linkedlist Ekleme: " + linkedlistSuresi);

		// Araya Veri Silme Süresi

		long index3 = random.nextInt(10000000);

		// Arraylist
		baslangic = System.nanoTime();
		arrayList.remove((int) index3);
		bitis = System.nanoTime();
		arraylistSuresi = bitis - baslangic;

		// linkedlist
		baslangic = System.nanoTime();
		linkedList.remove((int) index3);
		bitis = System.nanoTime();
		linkedlistSuresi = bitis - baslangic;

		System.out.println("------------------------------------");
		System.out.println("Arraylist Silme: " + arraylistSuresi);
		System.out.println("Linkedlist Silme: " + linkedlistSuresi);
	}
}