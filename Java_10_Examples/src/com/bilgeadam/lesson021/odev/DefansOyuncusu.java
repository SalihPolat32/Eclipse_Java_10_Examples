package com.bilgeadam.lesson021.odev;

public class DefansOyuncusu extends Futbolcu implements ITaktik {

	private int topCalma;
	
	private int markaj;
	
	private int ziplama;

	public DefansOyuncusu() {
		super();
	}

	public DefansOyuncusu(int topCalma, int markaj, int ziplama) {
		super(getIsim(), ziplama, ziplama, ziplama, topCalma, markaj, ziplama);
		this.topCalma = topCalma;
		this.markaj = markaj;
		this.ziplama = ziplama;
		setMevki("Defans Oyuncusu");
	}

	public int getTopCalma() {
		return topCalma;
	}

	public void setTopCalma(int topCalma) {
		this.topCalma = topCalma;
	}

	public int getMarkaj() {
		return markaj;
	}

	public void setMarkaj(int markaj) {
		this.markaj = markaj;
	}

	public int getZiplama() {
		return ziplama;
	}

	public void setZiplama(int ziplama) {
		this.ziplama = ziplama;
	}

	@Override
	public String toString() {
		return "DefansOyuncusu [topCalma=" + topCalma + ", markaj=" + markaj + ", ziplama=" + ziplama + ", getIsim()="
				+ getIsim() + ", getFormaNumarasi()=" + getFormaNumarasi() + ", getMevki()=" + getMevki()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getTopSurme()=" + getTopSurme()
				+ ", getSut()=" + getSut() + ", getDayaniklilik()=" + getDayaniklilik() + ", getTakimAdi()="
				+ getTakimAdi() + ", getSehir()=" + getSehir() + "]";
	}
	
	public void markajYap() {
		System.out.println("Defans Oyuncusu Markaj Yaptı.");
	}
	
	public void topaMudahale() {
		System.out.println("Defans Oyuncusu Topa Müdehale Etti.");
	}

	@Override
	public void pasVer() {
		System.out.println("Defans Oyuncusu Pas Verdi.");
	}

	@Override
	public void sutCek() {
		System.out.println("Defans Oyuncusu Şut Çekti.");	
	}
}