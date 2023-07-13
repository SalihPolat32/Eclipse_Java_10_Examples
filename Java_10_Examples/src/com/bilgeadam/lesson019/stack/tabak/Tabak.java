package com.bilgeadam.lesson019.stack.tabak;
/*
 * Tabak sınıfımızda tabaklarımızın id'sini ve kirli olup olmadılkarını tutalım
 * 
 * Daha sonra bir manger sınıfı ouşturup
 * Bu manager sınıfında 10 tane tabak ve kirli olup olmadıkları rastgele gelsin
 * 
 * temizleri bir stackte kirlileri başka stackte tutalım
 * 
 * kullan metodu oluşturalım ==> temizler stackten bir tabak alıp kirleteceğiz
 * 
 * temizle ve kullan metodunda eğer stacklerimiz boşsa temizle metodunda kullan çalışsın
 * kullan metodunda temizle
 * 
 * Daha sonra secim yap metodu oluşturacağız dışarıdan 1 veya 2 değerini alacak
 * gelen değer 1 ise temizle 2 ise kullan çalışsın
 * 
 * Test sınıfında 50 kere çalışan bir döngü olsun her defasında random bir seçim üretip
 * seçim yap metodunu kullanacağız
 */

public class Tabak {
	
	private int id;
	private boolean temizlikDurumu;
	
	public Tabak(int id) {
		super();
		this.id = id;
	}

	public Tabak(int id, boolean temizlikDurumu) {
		super();
		this.id = id;
		this.temizlikDurumu = temizlikDurumu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isTemizlikDurumu() {
		return temizlikDurumu;
	}
	public void setTemizlikDurumu(boolean durum) {
		this.temizlikDurumu = durum;
	}

	@Override
	public String toString() {
		return "Tabak [id=" + id + ", temizlikDurumu=" + temizlikDurumu + "]";
	}
}