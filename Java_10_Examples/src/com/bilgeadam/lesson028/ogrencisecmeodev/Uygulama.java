package com.bilgeadam.lesson028.ogrencisecmeodev;

import java.io.File;

public class Uygulama {

	public static void main(String[] args) {
		
		OgrenciFileIslemler ogrenciFileIslemler = new OgrenciFileIslemler();
		
		// baslangicListesiOlusturma(ogrenciFileIslemler); // Sıfırlama Metodu
		
		ogrenciFileIslemler.veriOkuma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		
		listedenOgrenciSecme(ogrenciFileIslemler);
		
		
	}
	
	public static void baslangicListesiOlusturma(OgrenciFileIslemler ogrenciFileIslemler) {
		
        ogrenciFileIslemler.veriOkuma(FileSabitler.OGRENCI_LIST_FILE);
		
		// ogrenciFileIslemler.ogrenciList.forEach(System.out::println);
        
        ogrenciFileIslemler.veriYazdirma(FileSabitler.OGRENCI_LIST_FILE_COPY);
	}
	
	public static void listedenOgrenciSecme(OgrenciFileIslemler ogrenciFileIslemler) {
		
		if (ogrenciFileIslemler.ogrenciList.isEmpty()) {
			
			System.out.println("Seçilecek Öğrenci Kalmadı.");
			
			baslangicListesiOlusturma(ogrenciFileIslemler);
			
			File file = new File(FileSabitler.ALINAN_OGRENCI);
			
			file.delete();
			
		} else {
			
			int index = ogrenciFileIslemler.rastgeleOgrenciSecme();
			
			ogrenciFileIslemler.secilenOgrenciyiBaskaDosyayaYazdir(FileSabitler.ALINAN_OGRENCI, index);
			
			ogrenciFileIslemler.ogrenciList.remove(index);
			
			ogrenciFileIslemler.veriYazdirma(FileSabitler.OGRENCI_LIST_FILE_COPY);
			
		} 
	}
}