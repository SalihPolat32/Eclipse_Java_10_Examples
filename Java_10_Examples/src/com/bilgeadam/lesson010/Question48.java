package com.bilgeadam.lesson010;

public class Question48 {
	
	/*
	 * 1 Metot yazacağız bu metot bize bu array de 1 ve 4 un kaç kere geçtiğini söyleyecek
	 * ayrıca 1 sayısının adeti 4 ten büyük ise true değil ise false yazacak.
	 */

	public static void main(String[] args) {
		
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		
		Question48 obj = new Question48();
		obj.kontrol(sayilar);
		System.out.println("--------------------------");
		System.out.println(obj.kontrol(sayilar));
	}

	public boolean kontrol(int[] dizi) {
		
		int sayac1 = 0, sayac4 = 0;
		boolean kontrol = true;
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == 1) {
				sayac1++;
			} else if (dizi[i] == 4) {
				sayac4++;
			}
		}
		System.out.println("1 Sayı Adedi: " + sayac1);
		System.out.println("4 Sayı Adedi: " + sayac4);
//		if (sayac1 > sayac4) {
//			System.out.println(kontrol);
//		} else {
//			kontrol = false;
//			System.out.println(kontrol);
//		}
		kontrol = sayac1 > sayac4;
		return kontrol;
	}
}