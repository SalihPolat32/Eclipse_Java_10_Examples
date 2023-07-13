package com.bilgeadam.lesson006;
/*
 * String değerinin karakterleri eğer rakam ise toplasın
 * rakam değil ise karaktere rakam değildir çıktısı versin ve bir string degere eklesin 
 */

public class Question36 {
	
	public static void main(String[] args) {
		
		String deger = "125ab1259xy";
		
		int toplam = 0;
		String sonDeger = "";	
		
		for (int i = 0; i < deger.length(); i++) {
			
			char a = deger.charAt(i);

			if ('0' <= a && a <= '9') { // ascii değeri yazsakta olur 48-57 (48 <= a && a <= 57)
				String karakter1 = Character.toString(a);
				int sayi = Integer.parseInt(karakter1);
				toplam += sayi;
			} else {
				String karakter2 = Character.toString(a);
				sonDeger += karakter2;
			}
		}
		System.out.println("Toplam: "+toplam);
		System.out.println("Karkterler: "+sonDeger);
		
		// 2. Çözüm Yolu
		toplam = 0;
		sonDeger = "";
		
		for (int i = 0; i < deger.length(); i++) {
			char a = deger.charAt(i);
			
			if (Character.isDigit(a)) {
				String karakter = Character.toString(a);
				int sayi = Integer.parseInt(karakter);
				toplam += sayi;
			} else {
				sonDeger += Character.toString(a);
			}
		}
		System.out.println("Toplam: "+toplam);
		System.out.println("Karkterler: "+sonDeger);
	}
}