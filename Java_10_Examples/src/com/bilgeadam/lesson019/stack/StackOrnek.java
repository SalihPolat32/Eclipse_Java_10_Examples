package com.bilgeadam.lesson019.stack;

import java.util.Stack;

/*
 * Lifo --> Son Giren İlk Çıkar (KUTU)
 * 
 * Integer bir stack oluşturup içine 6 7  tane değer ekleyelim
 * 100'den küçük olan değerlerin toplamını bulalım
 * 
 * 100'den büyük olanları başka stcak yapısına aktaralım
 * 
 * Daha sonra yeni stack'imizi yazdıralım
 */

public class StackOrnek {

	public static void main(String[] args) {

		Stack<Integer> firstStack = new Stack<>();
		Stack<Integer> lastStack = new Stack<>();

		int sayi = firstStack.push(320);
		System.out.println("Sayi: " + sayi);
		
		firstStack.push(120);
		firstStack.push(320);
		firstStack.push(20);
		firstStack.push(50);
		firstStack.push(350);
		firstStack.push(5);
		firstStack.push(45);
		firstStack.push(450);
		firstStack.add(190);
		
		int toplam = 0;
		
//		while (!firstStack.isEmpty()) {
//			int deger = firstStack.peek(); // Üsteki veriyi gösterir. Son gireni
////			int deger = firstStack.pop(); // Üsteki veriyi çıkartır. Son gireni
//			if (deger < 100) {
//				toplam += firstStack.pop();
//			} else {
//				lastStack.push(firstStack.pop());
//			}
//		}
		
		while (!firstStack.isEmpty()) {
			int deger = firstStack.pop();
			if (deger < 100) {
				toplam += deger;
			} else {
				lastStack.push(firstStack.pop());
			}
		}
		
		System.out.println("Toplam: " + toplam);
		
		System.out.println("======= For Each Döngüsü =======");
		System.out.println("İlk Giren İlk Çıktı - İndex Sırasına Göre");
		
		for (Integer integer : lastStack) { // İlk Giren İlk Çıktı
			System.out.println(integer);
		}
		
		System.out.println("======= While Döngüsü =======");
		System.out.println("pop İle En Üsteki çıkıyor");
		
		while (!lastStack.isEmpty()) {
			System.out.println(lastStack.pop());
		}
		System.out.println(lastStack.size());
	}
}