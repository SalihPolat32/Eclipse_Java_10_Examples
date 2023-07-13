package com.bilgeadam.lesson021.odev;

public class OrtaSahaOyuncusu extends Futbolcu implements ITaktik {

	private int ozelYetenek;
	
	private int uzunTop;
	
	private int uretkenlik;

	public OrtaSahaOyuncusu() {
		super();
	}

	public OrtaSahaOyuncusu(int ozelYetenek, int uzunTop, int uretkenlik) {
		super(getIsim(), uretkenlik, uretkenlik, uretkenlik, ozelYetenek, uzunTop, uretkenlik);
		this.ozelYetenek = ozelYetenek;
		this.uzunTop = uzunTop;
		this.uretkenlik = uretkenlik;
		setMevki("Orta Saha Oyuncusu");
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	@Override
	public String toString() {
		return "OrtaSahaOyuncusu [ozelYetenek=" + ozelYetenek + ", uzunTop=" + uzunTop + ", uretkenlik=" + uretkenlik
				+ ", getIsim()=" + getIsim() + ", getFormaNumarasi()=" + getFormaNumarasi() + ", getMevki()="
				+ getMevki() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getTopSurme()=" + getTopSurme()
				+ ", getSut()=" + getSut() + ", getDayaniklilik()=" + getDayaniklilik() + ", getTakimAdi()=" + getTakimAdi()
				+ ", getSehir()=" + getSehir() + "]";
	}
	
	public void araPasiVer() {
		System.out.println("Kaleci Kurtarış Yaptı.");
	}

	@Override
	public void pasVer() {
		System.out.println("Kaleci Pas Verdi.");
	}

	@Override
	public void sutCek() {
		System.out.println("Kaleci Şut Çekti.");
	}
}