package com.bilgeadam.lesson018.sehir;
/*
 * Şehir sınıfında isim, plaka ve nufüs değerlerimiz olsun
 * Plaka kodu üret diye bir metot 01,02,...09,10,11,...
 * Rastgele nufüs oluştur diye bir metot yazalım
 * 
 * Uygulama sınıfında bir şehir listesi oluşturacağız
 * Bir şehirleri oluştur metodu ile string arrayden gelen verileri sehir nesnesine çevirip
 * sehirler listesine ekleyeceğiz.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Uygulama {

	ArrayList<Sehir> sehirler;

	public Uygulama() { // newleme 1. Yöntem
		this.sehirler = new ArrayList<>();
	}

	public void sehirOlustur() {
//		this.sehirler = new ArrayList<>(); // newleme 2. Yöntem
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			String isim = SehirDatabase.iller[i];
			Sehir sehir = new Sehir(isim);
			sehirler.add(sehir);
//			sehir.setNufus(sehir.rastgeleNufusUret()); // Rastgele nufüs çağırma 2. yöntem
//			sehir.rastgeleNufusUret();
			sehir.plakaKoduUret(i + 1);
		}
	}

	public static void main(String[] args) {

		Uygulama uygulama = new Uygulama();
		uygulama.sehirOlustur();
		System.out.println(uygulama.sehirler);

		System.out.println("Nüfusa Göre Sıralı");
		
		Comparator<Sehir> nufusaGore = new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				return (int) (o1.getNufus() - o2.getNufus());
			}
		};

		Collections.sort(uygulama.sehirler, nufusaGore);

		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}

		System.out.println("Karışık Liste");
		Collections.shuffle(uygulama.sehirler); // Sıralamayı Karıştırıyor
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
		
		System.out.println("İsime Göre Sıralı");

		Comparator<Sehir> ismeGore = new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				return o1.getIsim().compareTo(o2.getIsim());
			}
		};

		Collections.sort(uygulama.sehirler, ismeGore);

		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
	}
}