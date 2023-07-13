package com.bilgeadam.lesson021.odev;

public class ForvetOyuncusu extends Futbolcu implements ITaktik {

	private int bitiricilik;
	
	private int kafaVurusu;
	
	private int ilkDokunus;

	public ForvetOyuncusu() {
		super();
	}

	public ForvetOyuncusu(int bitiricilik, int kafaVurusu, int ilkDokunus) {
		super(getIsim(), ilkDokunus, ilkDokunus, ilkDokunus, bitiricilik, kafaVurusu, ilkDokunus);
		this.bitiricilik = bitiricilik;
		this.kafaVurusu = kafaVurusu;
		this.ilkDokunus = ilkDokunus;
		setMevki("Forvet Oyuncusu");
	}

	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public int getKafaVurusu() {
		return kafaVurusu;
	}

	public void setKafaVurusu(int kafaVurusu) {
		this.kafaVurusu = kafaVurusu;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	@Override
	public String toString() {
		return "ForvetOyuncusu [bitiricilik=" + bitiricilik + ", kafaVurusu=" + kafaVurusu + ", ilkDokunus="
				+ ilkDokunus + ", getIsim()=" + getIsim() + ", getFormaNumarasi()=" + getFormaNumarasi()
				+ ", getMevki()=" + getMevki() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getTopSurme()=" + getTopSurme() + ", getSut()=" + getSut() + ", getDayaniklilik()="
				+ getDayaniklilik() + ", getTakimAdi()=" + getTakimAdi() + ", getSehir()=" + getSehir() + "]";
	}
	
	public void markajdanKacma() {
		System.out.println("Forvet Oyuncusu Markajdan Kaçtı.");
	}
	
	@Override
	public void pasVer() {
		System.out.println("Forvet Oyuncusu Pas Verdi.");
	}

	@Override
	public void sutCek() {
		System.out.println("Forvet Oyuncusu Şut Çekti.");
	}
}