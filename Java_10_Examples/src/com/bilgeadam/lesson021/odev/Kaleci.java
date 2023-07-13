package com.bilgeadam.lesson021.odev;

public class Kaleci extends Futbolcu {

	private int kurtaris;
	
	private int gorusAlani;

	public Kaleci() {
		super();
	}

	public Kaleci(int kurtaris, int gorusAlani) {
		super(getIsim(), gorusAlani, gorusAlani, gorusAlani, gorusAlani, kurtaris, gorusAlani);
		this.kurtaris = kurtaris;
		this.gorusAlani = gorusAlani;
		setMevki("Kaleci");
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	public int getGorusAlani() {
		return gorusAlani;
	}

	public void setGorusAlani(int gorusAlani) {
		this.gorusAlani = gorusAlani;
	}

	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", gorusAlani=" + gorusAlani + ", getIsim()=" + getIsim()
				+ ", getFormaNumarasi()=" + getFormaNumarasi() + ", getMevki()=" + getMevki() + ", getHiz()=" + getHiz()
				+ ", getPas()=" + getPas() + ", getTopSurme()=" + getTopSurme() + ", getSut()=" + getSut()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getTakimAdi()=" + getTakimAdi() + ", getSehir()="
				+ getSehir() + "]";
	}
	
	public void kurtarisYap() {
		System.out.println("Kaleci Kurtarış Yaptı.");
	}
	
	public void degajYap() {
		System.out.println("Kaleci Degaj Yaptı.");
	}
}