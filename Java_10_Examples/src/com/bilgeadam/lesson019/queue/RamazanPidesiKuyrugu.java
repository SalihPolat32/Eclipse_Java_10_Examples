package com.bilgeadam.lesson019.queue;
/*
 * String bir kuyruk oluşturacağız
 * Bir metot ile bu kuyruğa 10 tane müşteri ekleyelim
 * 
 * Daha sonra 1 ile 12 arasında bir pide üretelim pide sayımız rastgele gelecek
 * 
 * Daha sonra oluşmuş olan kuyruğa pideleri dağıtalım
 * Pide bittiğinde pide kalmadı yazalım
 * 
 * Ve dahasonra pide almayan varsa yazdıralım
 */

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class RamazanPidesiKuyrugu {

	Queue<String> musteriler = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {

		RamazanPidesiKuyrugu ramazanPidesiKuyrugu = new RamazanPidesiKuyrugu();

		ramazanPidesiKuyrugu.musteriOlustur();
		ramazanPidesiKuyrugu.pideDagit();
		ramazanPidesiKuyrugu.geriyeKalanlar();
	}

	public void musteriOlustur() {

		for (int i = 1; i < 11; i++) {

			musteriler.offer("Müşteri " + i);
		}
	}

	public void pideDagit() {

		Random random = new Random();

		int pideSayisi = random.nextInt(1, 13);
		System.out.println("Pideler Çıkıyor!!!");
		System.out.println("Pide Sayısı: " + pideSayisi);

		for (int i = 1; i <= pideSayisi; i++) {

			if (!musteriler.isEmpty()) {
				System.out.println(musteriler.poll() + " Pidesini Aldı.");
			} else {
				System.out.println("Kalan Pide Sayısı: " + (pideSayisi - (i - 1)));
				break;
			}
		}
	}

	public void geriyeKalanlar() {

		if (musteriler.isEmpty()) {
			System.out.println("Pidesini Almayan Kalmadı.");
		} else {
			System.out.println("Pide Bitti. Pidesini Almayanlar: ");
			for (String musteri : musteriler) {
				System.out.println(musteri);
			}
		}
	}
}
