package com.bilgeadam.lesson019.set;
/*
 * Bir set oluşturalım Bu sete film kategorisi ekleyeceğiz
 * Kategori ekle diye bir metot yazıp dışarıdan veri alacağız ve
 * set'e ekleyeceğiz eğer kategori daha önce eklenmişse bu kategori daha önce eklenmiştir çıktısı versin.
 * Eklenmemiş ise kategori başarı ile eklenmiştir.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetOrnek {

	Scanner scanner = new Scanner(System.in);

	static Set<String> kategoriler = new TreeSet<>();

	public static void main(String[] args) {

		SetOrnek setOrnek = new SetOrnek();

		setOrnek.kategoriEkle();
		setOrnek.kategoriEkle();
		setOrnek.kategoriEkle();
		
		setOrnek.kategoriEkle2();
		setOrnek.kategoriEkle2();
		setOrnek.kategoriEkle2();
		
		setOrnek.kategoriler.add("Drama");
		setOrnek.kategoriler.add("Anime");
		setOrnek.kategoriler.add("Komedi");
		setOrnek.kategoriler.add("Gerilim");

		for (String string : setOrnek.kategoriler) {
			System.out.println(string);
		}
	}

	public void kategoriEkle() {

		System.out.println("Lütfen Eklemek İstediğiniz Kategoriyi Yazınız:");
		String kategori = scanner.nextLine().toUpperCase();

		if (kategoriler.contains(kategori)) {
			System.out.println(kategori + " Kategori Daha Önce Eklenmiştir.");
		} else {
			kategoriler.add(kategori);
			System.out.println(kategori + " Kategorisi Başarılı Bir Şekilde Eklenmiştir.");
		}
	}

	public void kategoriEkle2() {

		System.out.println("Lütfen Eklemek İstediğiniz Kategoriyi Yazınız:");
		String kategori = scanner.nextLine().toUpperCase();

		if (kategoriler.add(kategori)) {
			System.out.println(kategori + " Kategori Daha Önce Eklenmiştir.");
		} else {
			System.out.println(kategori + " Kategorisi Başarılı Bir Şekilde Eklenmiştir.");
		}
	}
}