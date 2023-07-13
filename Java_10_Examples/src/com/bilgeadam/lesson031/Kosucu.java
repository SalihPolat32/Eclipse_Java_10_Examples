package com.bilgeadam.lesson031;

public class Kosucu implements Runnable {

	private String isim;
	
	private int mesafe;
	
	private long sure;
	
	private long baslangicZamani;
	
	private int adımMesafesi;

	public Kosucu(String isim, long baslangicZamani, int adımMesafesi) {
		super();
		this.isim = isim;
		this.baslangicZamani = baslangicZamani;
		this.adımMesafesi = adımMesafesi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}

	public long getSure() {
		return sure;
	}

	public void setSure(long sure) {
		this.sure = sure;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

	public int getAdımMesafesi() {
		return adımMesafesi;
	}

	public void setAdımMesafesi(int adımMesafesi) {
		this.adımMesafesi = adımMesafesi;
	}
	
	@Override
	public String toString() {
		return "Kosucu [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + ", baslangicZamani=" + baslangicZamani
				+ ", adımMesafesi=" + adımMesafesi + "]";
	}

	@Override
	public void run() {
		
		System.out.println(isim + " Başlangıç Zamanı: " + baslangicZamani);
		
		while (this.mesafe <= 100) {
			
			this.mesafe += adımMesafesi;
			
			if (this.mesafe % 10 == 0) {
				System.out.println(isim + " ==> " + mesafe + ". Metrede");
			}
			
//			try {
//				
//				Thread.sleep(100);
//				
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//
//			}
		}
		
		this.sure = System.nanoTime() - baslangicZamani;
		
        System.out.println(isim + " adlı koşucu 100 metreyi " + sure + " ms koştu.");
	}
}