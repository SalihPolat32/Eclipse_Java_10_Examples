package com.bilgeadam.lesson013;

public class StaticOrnek {
	
	int number1; // Nesne Değişkeni - Nesne Özelliği
	static int number2; // Sınıf Değişkeni - Sınıf Özelliğidir package 
	                          // com.bilgeadam.lesson013.StaticOrnek.number2
	public void numaraVer() {
		
		System.out.println("NumaraVer metodu.");
		number1 += 1;
		number2 += 1;
		System.out.println("number 1 = " + number1);
		System.out.println("number 2 = " + number2);
	}
	
	public static void numaraVer2() {
		System.out.println("NumaraVer2 Metodu.");
		number2++;
		System.out.println(number2);
		// System.out.println(number1); // static bir metot içinde static olmayan bir özelliği direkt kullanamayız
		// Kullanmak için nesne oluşturmamız gerekmektedir.
	}
	public static void main(String[] args) {
		
		number2 = 5;
		StaticOrnek.number2 = 10; // Sınıf Üzerinden Ulaştık
		
		StaticOrnek staticOrnek = new StaticOrnek(); // Nesne Üzerinden Ulaştık
		staticOrnek.number1 = 10;
		
		System.out.println(number2);
		System.out.println(staticOrnek.number1);
		
		staticOrnek.numaraVer();
		
		staticOrnek = new StaticOrnek();
		
		staticOrnek.numaraVer();
		staticOrnek.numaraVer();
		
		StaticOrnek staticOrnek2 = new StaticOrnek();
		System.out.println(staticOrnek2.number1); // 0
		System.out.println(staticOrnek.number1); // 0
		System.out.println(staticOrnek2.number2); // 13
		System.out.println(staticOrnek.number2); // 13
		
	}
}