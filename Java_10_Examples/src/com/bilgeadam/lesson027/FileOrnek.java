package com.bilgeadam.lesson027;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * output --> Yazma İşlemi
 * input --> Okuma İşlemi
 */

public class FileOrnek {

	public static void main(String[] args) {

		File file = new File("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Deneme2.txt");

//		try {
//
//			file.createNewFile();
//			System.out.println(file.getName() + " Oluşturuldu.");
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//
//		}

		FileOutputStream fos = null;
		FileInputStream fis = null;

		try {

//			FileWriter fileWriter = new FileWriter("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Deneme.txt");
//			FileReader fileReader = new FileReader("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Deneme.txt");

			// ================ Yazma İşlemi ================
			
			fos = new FileOutputStream("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Deneme.txt", true); // true değeri
																											// her
																											// çalıştığında
																											// dosyayı
																											// sıfırlamaz
																											// var olan
																											// veriyi
																											// korur ve
																											// devamında
																											// yazma
																											// işlemi
																											// devam
																											// eder

//			FileOutputStream fos2 = new FileOutputStream(file);
//
//			fos.write(66); // Karakter Olarak Yazdırır
//			fos.write(69);
//			byte[] array = { 101, 80, 85, 66 };
//			fos.write(array);
//			String kelime = "java";
//			fos.write(kelime.getBytes());
//
//			fos.write(50);
//
			// ================ Okuma İşlemi ================
			
			fis = new FileInputStream("C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Deneme.txt");
			// Uzun Yöntem
//			int deger = fis.read();
//			System.out.println((char) deger);
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println(fis.read());

			int deger;

			while ((deger = fis.read()) != -1) {
				System.out.print((char) deger);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				fos.close();
				fis.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}
	}
}