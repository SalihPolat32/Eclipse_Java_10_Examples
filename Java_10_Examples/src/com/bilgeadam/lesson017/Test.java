package com.bilgeadam.lesson017;
/*
 * Bir Araç Sınıfımız Olsun
 * 
 * Daha sonra uçak otomobil kamyon gemi gibi sınıflarımızı oluşturalım
 * Gerekirse bu sınıflara alt sınıf oluşturabiliriz
 * Hızlanma yavaşlama gibi metotlarımız olsun
 * kalkışYap() inisYap() yelkenAc() limanYanas() sur()(Kara taşıtları İçin Düşünelim) gibi metotlarımız olsun
 * Bazı araçlar yük taşıyabilsinler bunun için yukAl() ve yukBosalt() metotlarımız olsun
 * Bu uygulamayı oluştururken özellikle interfacelerden yararlanalım.
 * 
 * kalkisaIzinVer() metodu yazalım.
 * 
 * Bir yuVerme() metodu yazalım dışarıdan aldığımız nesne bu metot içinde yukAl metodunu çalıştırsın
 */

public class Test {

	public static void main(String[] args) {
		
		// Arac arac = new Arac();
		Otomobil otomobil = new Otomobil();
		// Ucak ucak = new Ucak();
		
		// arac.hizlanma();
		otomobil.hizlanma();
		// ucak.hizlanma();
		
		Arac arac1 = new Kamyon();
		Arac arac2 = new YukGemisi();
		Arac arac3 = new YolcuGemisi();
		Arac arac4 = new KargoUcagi();
		Arac arac5 = new YolcuUcagi();
		Arac arac6 = new Otomobil();
		
		arac1.hizlanma();
		arac2.hizlanma();
		arac3.hizlanma();
		arac4.hizlanma();
		arac5.hizlanma();
		arac6.hizlanma();
		arac6.hizlanma();
		arac6.yavaslama();
		
		Ucak ucak1 = new YolcuUcagi();
		
		kalkisaIzinVer((Ucak) arac4);
		kalkisaIzinVer((Ucak) arac5);
		// kalkisaIzinVer((Ucak) arac6);
		kalkisaIzinVer(ucak1);
		
		yukVerme((Kamyon) arac1);
		
		IYuk arac7 = new YukGemisi();
		IYuk arac8 = new KargoUcagi();
		IYuk arac9 = new Kamyon();
		// IYuk arac10 = new YolcuUcagi();
		((Gemi) arac7).hizlanma();
		yukVerme(arac9);
		yukVerme(arac8);
		yukVerme(arac7);
		
		Helikopter helikopter = new Helikopter();
		kalkisaIzinVer(helikopter);
		
	}
	
	public static void kalkisaIzinVer(IHavaTasiti havaTasiti) {
		System.out.println("Kalkışa İzin Verildi.");
		
		havaTasiti.kalkisYap();
	}
	
	public static void yukVerme(IYuk arac) {
		
		System.out.println("Yük Verildi.");
		arac.yukAl();
		
	}
}