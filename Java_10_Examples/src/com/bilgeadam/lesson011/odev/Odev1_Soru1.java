package com.bilgeadam.lesson011.odev;

public class Odev1_Soru1 {

	public static void main(String[] args) {
		
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		
		sehirPlaka(sehirler);
		
	}

	public static void sehirPlaka(String sehirler) {
		
		String[] sehir = sehirler.split(";");
		
		for (int i = 0; i < sehir.length; i++) {
			int j = sehir[i].indexOf("-");
			System.out.println(sehir[i].substring(j+1) + "'nın Plaka Kodu: " + sehir[i].substring(0, j));
		}
	}
}