package com.bilgeadam.lesson022.movieapp;

public class Cast {

	private String isim;
	
	private String soyisim;
	
	private long id;
	
	public Cast(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cast [isim=" + isim + ", soyisim=" + soyisim + ", id=" + id + "]";
	}
}