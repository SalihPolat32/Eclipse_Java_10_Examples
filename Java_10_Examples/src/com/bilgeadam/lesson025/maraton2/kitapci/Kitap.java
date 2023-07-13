package com.bilgeadam.lesson025.maraton2.kitapci;

public class Kitap {

	private int id;
	
	private String isim;
	
	private EDurum durum;

	public Kitap(int id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
		this.durum = EDurum.KITAPLIKTA;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public EDurum getDurum() {
		return durum;
	}

	public void setDurum(EDurum durum) {
		this.durum = durum;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", isim=" + isim + ", durum=" + durum + "]";
	}
}