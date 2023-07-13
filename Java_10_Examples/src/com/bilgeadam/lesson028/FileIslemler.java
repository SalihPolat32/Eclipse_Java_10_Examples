package com.bilgeadam.lesson028;
/*
 * Sabitlerimizi tuttuğumuz bir sınıfımız olsun
 * Menude her bir işlem için bir metot yazalım.
 * System.out.println("1 - Dosya Yarat");
 * System.out.println("2 - Dosya Sil");
 * System.out.println("3 - Dosyaya Veri Ekle");
 * System.out.println("4 - Dosyadan Veri Oku");
 * System.out.println("5 - Dosyadaki Bir Harfi Değiştir");
 * 
 * 1 - Eğer dosya daha önce yaratılmamışsa dosya ismi ile beraber başarılı bir şekilde oluşturuldu çıktısını verelim
 * Eğer daha önce oluşturulmuşsa bu dosya daha önce oluşturulmuştur çıktısı verelim.
 * 
 * 2 - Dosya sil metodu daha önce bu dosya varsa silecek ve dosya başarı ile silinmiştir diyecek
 * eğer dosya yoksa böyle bir dosya bulunamadı diye bir çıktı verecek
 * 
 * 3 - Scanner ile alınan veriyi dosyaya yazdıralım
 * 
 * 4 - Dosyadan okuduğumuz veriyi bir stringe ekleyelim ve stringte tutalım ve bu stringi geri dönelim
 * 
 * 5 - Bir harf belirleyelim bu harf dosyamızda varsa ikinci belirlediğimiz harf ile değiştireceğiz
 * dosyada verinin değişmesini sağlayacağız
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIslemler {

	File file = new File(FileSabitler2.PATH);

	public void menu() {

		System.out.println("===== Dosya İşlemleri =====");
		System.out.println("1 - Dosya Oluştur");
		System.out.println("2 - Dosya Sil");
		System.out.println("3 - Dosyaya Veri Ekle");
		System.out.println("4 - Dosyadan Veri Oku");
		System.out.println("5 - Dosyadaki Bir Harfi Değiştir");
		System.out.println("0 - Çıkış");
	}

	public void uygulama() {

		int secim = 0;

		do {

			menu();
			secim = Utility.intDegerAlma("Lütfen Bir İşlem Seçiniz:");

			switch (secim) {
			case 1:
				dosyaOlustur();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				dosyayaVeriEkle();
				break;
			case 4:
				dosyadanVeriOku();
				break;
			case 5:
				dosyadakiBirHarfiDegistir();
				break;
			case 0:
				System.out.println("Çıkış Yapılıyor...");
				break;

			default:
				break;
			}

		} while (secim != 0);
	}
	
	public void dosyadakiBirHarfiDegistir() {

		String eskiHarf = Utility.stringdDegerAlma("Lütfen Eski Harfi Giriniz:");
		String yeniHarf = Utility.stringdDegerAlma("Lütfen Yeni Harfi Giriniz:");
		String metin = dosyadanVeriOku();
		
		metin = metin.replace(eskiHarf, yeniHarf);

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
			
			bufferedWriter.write(metin);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}

	public String dosyadanVeriOku() {

		String metin = "";
		String satir = "";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

			while ((satir = bufferedReader.readLine()) != null) {

				if (metin.equals("")) {
					metin += satir; 
				}
				metin += "\n" + satir;
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		System.out.println(metin);
		return metin;
	}

	public void dosyayaVeriEkle() {

		String veri = Utility.stringdDegerAlma("Lütfen Dosyaya Girmek İstediğiniz Veriyi Yazınız:");

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {

			if (file.length() != 0) {
				// bufferedWriter.newLine();
				veri = "\n" + veri;
			}

			bufferedWriter.write(veri);

			System.out.println(file.length());

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	public void dosyaSil() {

		try {

			if (file.delete()) {
				System.out.println(file.getName() + " Başarı İle Silindi.");
			} else {
				System.out.println(file.getName() + " Dosya Bulunamadığı İçin Silinmedi.");
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void dosyaOlustur() {

		try {

			if (file.createNewFile()) {
				System.out.println(file.getName() + " Başarıyla Oluşturuldu.");
			} else {
				System.out.println(file.getName() + " Daha Önceden Oluşturulmuştur.");
			}

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}