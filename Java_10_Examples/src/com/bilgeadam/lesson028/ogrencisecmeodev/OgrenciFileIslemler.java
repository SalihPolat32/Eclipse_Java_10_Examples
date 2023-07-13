package com.bilgeadam.lesson028.ogrencisecmeodev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OgrenciFileIslemler {

	List<String> ogrenciList;

	File file;

	BufferedReader bufferedReader;

	BufferedWriter bufferedWriter;

	public OgrenciFileIslemler() {

		this.ogrenciList = new ArrayList<>();
	}

	public void veriOkuma(String dosyaYolu) {

		file = new File(FileSabitler.OGRENCI_LIST_FILE);

		try {

			bufferedReader = new BufferedReader(new FileReader(file));

			String ogrenci;

			while ((ogrenci = bufferedReader.readLine()) != null) {
				ogrenciList.add(ogrenci);
			}

			bufferedReader.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				bufferedReader.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}

	public void veriYazdirma(String dosyaYolu) {

		try {

			bufferedWriter = new BufferedWriter(new FileWriter(dosyaYolu));

			for (int i = 0; i < ogrenciList.size(); i++) {

				if (i != ogrenciList.size() - 1) {

					bufferedWriter.write(ogrenciList.get(i));
					bufferedWriter.newLine();

				} else {

					bufferedWriter.write(ogrenciList.get(i));

				}
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				bufferedWriter.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}

	public int rastgeleOgrenciSecme() {
		
		Random random = new Random();

		return random.nextInt(ogrenciList.size());
	}

	public void secilenOgrenciyiBaskaDosyayaYazdir(String dosyaYolu, int index) {

		OgrenciFileIslemler ogrenci = new OgrenciFileIslemler();

		try {

			bufferedWriter = new BufferedWriter(new FileWriter(dosyaYolu, true));

			bufferedWriter.write(ogrenciList.get(index));
			
			bufferedWriter.newLine();
			
			System.out.println("Seçilen Öğrenci: " + ogrenciList.get(index)); 

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			
			try {
				
				bufferedWriter.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		}
	}
}