package com.bilgeadam.lesson016.polimorfizm;

public abstract class Pokemon {

	private int id;
	private String ad;
	private int guc;
	private int can;
	private int seviye;
	private String tur;

	public Pokemon(int id, String ad, int guc, int can, int seviye) {
		super();
		this.id = id;
		this.ad = ad;
		this.guc = guc;
		this.can = can;
		this.seviye = seviye;
	}

	public abstract void saldir();

	public void kacinma() {

		System.out.println(ad + " adlı pokemon saldırıdan kaçındı.");
	}

	public void pokedex() {

		System.out.println("POKEDEX");
		System.out.println("===============");
		System.out.println("id: " + id);
		System.out.println("Ad: " + ad);
		System.out.println("Güç: " + guc);
		System.out.println("Can: " + can);
		System.out.println("Seviye: " + seviye);
		System.out.println("Tür: " + tur);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getGuc() {
		return guc;
	}

	public void setGuc(int guc) {
		this.guc = guc;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getSeviye() {
		return seviye;
	}

	public void setSeviye(int seviye) {
		this.seviye = seviye;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

}