package com.bilgeadam.lesson027;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek3 {

	public static void main(String[] args) {
		
		String path = "C:\\Users/pc/Desktop/Java10- WorkSpace/Dosya/Deneme3.txt";
		File file = new File(path);
		
		BufferedReader bufferedReader;
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter;
		
		try {
			
			// ================ Yazma İşlemi ================
			
			// fileWriter = new FileWriter(path);
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			// bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write("Deneme1");
			bufferedWriter.write("Deneme2");
			bufferedWriter.write("Deneme3");
			bufferedWriter.newLine();
			bufferedWriter.write("Deneme4\n");
			bufferedWriter.write("Deneme5");
			// bufferedWriter.append("xyz", 1, 2); // substring gibi indexler üzerinden çalışır son index'i almaz
			bufferedWriter.write("xyz", 1, 2); // ilk indexten itibaren kaç değer yazdıracağımızı söylüyoruz
			bufferedWriter.flush();
			bufferedWriter.write("Deneme6");
			
			// ================ Okuma İşlemi ================
			
			bufferedReader = new BufferedReader(new FileReader(file));
			
//			System.out.println((char) bufferedReader.read());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
			
			// 1. Yöntem
//			for (int i = 0; i < file.length(); i++) {
//				System.out.println((char) bufferedReader.read());
//			}
			
			String deger = null;
			
			while ((deger = bufferedReader.readLine()) != null) {
				System.out.println(deger);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
//			try {
//				
//				bufferedWriter.close();
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
		}
	}
}