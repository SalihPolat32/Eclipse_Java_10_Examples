package com.bilgeadam.lesson025.maraton2.kitapci;

public class Kasiyer extends Kisi {

	private double maas;
	
	private boolean ozelSigorta;

	public Kasiyer(int id, String ad, String soyad, double maas, boolean ozelSigorta) {
		super(id, ad, soyad);
		this.maas = maas;
		this.ozelSigorta = ozelSigorta;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public boolean isOzelSigorta() {
		return ozelSigorta;
	}

	public void setOzelSigorta(boolean ozelSigorta) {
		this.ozelSigorta = ozelSigorta;
	}

	@Override
	public String toString() {
		return "Kasiyer [maas=" + maas + ", ozelSigorta=" + ozelSigorta + ", getId()=" + getId() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + "]";
	}
}