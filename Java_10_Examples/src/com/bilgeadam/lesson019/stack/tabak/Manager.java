package com.bilgeadam.lesson019.stack.tabak;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Manager {

	Stack<Tabak> temizler;
	Stack<Tabak> kirliler;

	public Manager() {
		super();
		this.kirliler = new Stack<>();
		this.temizler = new Stack<>();
	}

	public void tabakOlustur() {

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			Tabak tabak = new Tabak(i + 1, random.nextBoolean());
			if (tabak.isTemizlikDurumu()) {
				kirliler.push(tabak);
			} else {
				temizler.push(tabak);
			}
		}
	}

	public void temizle() {

		if (kirliler.isEmpty()) {

			System.out.println("Kirli Tabak Kalmamıştır.");

			kullan();

		} else {

			Tabak tabak = kirliler.pop();

			tabak.setTemizlikDurumu(false);

			temizler.push(tabak);

			System.out.println(tabak.getId() + " id'li Tabak Temizlenmiştir.");
		}
	}

	public void kullan() {

		if (temizler.isEmpty()) {

			System.out.println("Temiz Tabak Kalmamıştır.");

			temizle();

		} else {

			Tabak tabak = temizler.pop();

			tabak.setTemizlikDurumu(true);

			kirliler.push(tabak);

			System.out.println(tabak.getId() + " id'li Tabak Kullanılmıştır.");
		}
	}

	public void secimYap(int secim) {

		System.out.println("1 - Tabakları Temizle");
		System.out.println("2 - Tabakları Kullan");
		System.out.println("Lütfen Yapacağınız İşlemin Numarasını Seçiniz:");
		
		switch (secim) {
		case 1:
			temizle();
			break;
		case 2:
			kullan();
			break;

		default:
			System.out.println("Lütfen Geçerli Bir İşlem Giriniz.");
			break;
		}
	}
}