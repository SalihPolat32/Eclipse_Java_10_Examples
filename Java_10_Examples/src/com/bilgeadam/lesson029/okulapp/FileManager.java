package com.bilgeadam.lesson029.okulapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {

	static String file = "C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya";
	static String path = file + "ogrenciler.txt";

	public static List<Ogrenci> dosyadanVeriOku(String ogretmenIsmı, BufferedReader bufferedReader) {

		List<Ogrenci> list = new ArrayList<>();

		String veri = "";
		try {

			while ((veri = bufferedReader.readLine()) != null) {
				String[] array = veri.split(",");
				String isim = array[0];

				List<String> notList = Arrays.asList(array).subList(1, 4);
				double ort = ortHesapla(notList);
				LocalDate date = Utility.formatliLocalDateCevirme(array[4], "dd/MM/yyy");
				Ogrenci ogrenci = new Ogrenci(isim, ort, date);

				list.add(ogrenci);
				System.out.println(
						ogretmenIsmı + " Adlı Öğretmen ==>" + ogrenci.getIsim() + " Adlı Öğrencinin Notlarını Okudu.");

//				try {
//
//					Thread.sleep(100);
//
//				} catch (InterruptedException e) {
//
//					e.printStackTrace();
//					
//				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e1) {

			e1.printStackTrace();

		}

		return list;
	}

	private static double ortHesapla(List<String> notList) {
		return notList.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

	public static void ogretmenDosyasıOlustur(List<Ogrenci> ogrenciListesi, String isim) {

//		try {
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file + isim + ".txt"));
//
//			for (Ogrenci ogrenci : ogrenciListesi) {
//				bufferedWriter.write(ogrenci.getIsim() + ",");
//				bufferedWriter.write(ogrenci.getDogumTarihi().toString() + ",");
//				bufferedWriter.write(ogrenci.getDurum().toString() + ",");
//				bufferedWriter.write(String.valueOf(ogrenci.getOrt()));
//				bufferedWriter.newLine();
//			}
//
//		} catch (FileNotFoundException e) {
//		
//			e.printStackTrace();
//		
//		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file + isim + ".txt"))) {

			oos.writeObject(ogrenciListesi);
			System.out.println("Ögrenciler Başarı İle Kayıt Edildi.");

		} catch (Exception e) {

			System.out.println(e.toString() + ": Öğrencileri kaydetme İşlemi Başarısız Oldu.");

		}
	}

	public static List<Ogrenci> ogrencileriGetir(String isim) {

		List<Ogrenci> list = new ArrayList<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file + isim + ".txt"))) {

			list = (List<Ogrenci>) ois.readObject();

		} catch (Exception e) {

			System.out.println("Bir Hata Oluştu: " + e.toString());
		}
		return list;
	}
}