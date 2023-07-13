package com.bilgeadam.lesson030.threadgiris;

public class Calisan extends Thread {

	String isim;

	public Calisan(String isim) {
		super();
		this.isim = isim;
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			bilgiGoster(i + 1);
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
	}
	
	public void Calis() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(isim + " ==> " + (i + 1));
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
	}
	
	public void bilgiGoster(int sayi) {
		System.out.println(isim + " Adlı Çalışan Çalışıyor ==> " + sayi);
	}
}