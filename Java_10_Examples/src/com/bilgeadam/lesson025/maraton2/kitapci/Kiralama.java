package com.bilgeadam.lesson025.maraton2.kitapci;

public class Kiralama {

	private int id;
	
	private Kasiyer kasiyer;
	
	private Kitap kitap;
	
	private Musteri musteri;

	public Kiralama(int id, Kasiyer kasiyer, Kitap kitap, Musteri musteri) {
		super();
		this.id = id;
		this.kasiyer = kasiyer;
		this.kitap = kitap;
		this.musteri = musteri;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Kasiyer getKasiyer() {
		return kasiyer;
	}

	public void setKasiyer(Kasiyer kasiyer) {
		this.kasiyer = kasiyer;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	@Override
	public String toString() {
		return "Kiralama [id=" + id + ", kasiyer=" + kasiyer + ", kitap=" + kitap + ", musteri=" + musteri + "]";
	}
}