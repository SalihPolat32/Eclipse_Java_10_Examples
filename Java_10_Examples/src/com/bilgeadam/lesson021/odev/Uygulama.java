package com.bilgeadam.lesson021.odev;

public class Uygulama {

	public static void main(String[] args) {
		
		DefansOyuncusu futbolcu1 = new DefansOyuncusu(85, 88, 92);
		futbolcu1.setIsim("Ali");
		futbolcu1.setFormaNumarasi(95);
		futbolcu1.setHiz(98);
		futbolcu1.setPas(86);
		futbolcu1.setTopSurme(84);
		futbolcu1.setSut(70);
		futbolcu1.setDayaniklilik(97);
		
		System.out.println(futbolcu1);
		
		futbolcu1.sutCek();
	}
	
	public void name() {
		
	}
}