package com.bilgeadam.lesson027;
/*
 * Okuma metodu yazalım dönen değerleri yazdıralım
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOrnek2 {
	
	List<Integer> icerik = new ArrayList<>();
	
	public static void main(String[] args) {
		
		FileOrnek2 fileOrnek2 = new FileOrnek2();
		
		fileOrnek2.dosyadanVeriOkuma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/2.png");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya.txt");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya1.jpg");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya2.jpg");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya3.png");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya4.png");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya5.png");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya6.png");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya7.png");
		fileOrnek2.dosyayaVeriYazdirma("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Kopya8.png");
	}

	public void dosyadanVeriOkuma(String dosyaYolu) {

		try {

			FileInputStream fis = new FileInputStream(dosyaYolu);

			int deger;

			while ((deger = fis.read()) != -1) {

				System.out.print(deger + "-");
				icerik.add(deger);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
	
	public void dosyayaVeriYazdirma(String dosyaYolu) {

		try {

			FileOutputStream fos = new FileOutputStream(dosyaYolu);
			
//			icerik.forEach(x -> {
//				
//				try {
//					
//					fos.write(x);
//					
//				} catch (IOException e) {
//					
//					e.printStackTrace();
//					
//				}
//			});
			
			for (Integer integer : icerik) {
				
				fos.write(integer);
				
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}