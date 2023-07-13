package com.bilgeadam.lesson014.kalıtım;

public class SuPokemonu extends Pokemon {

	private int yuzmeHizi;
	private int suBasincGucu;

	public SuPokemonu(int id, String ad, int guc, int can, int seviye, int yuzmeHizi, int suBasincGucu) {

		super(id, ad, guc, can, seviye);
		this.yuzmeHizi = yuzmeHizi;
		this.suBasincGucu = suBasincGucu;
		setTur("Su");
	}

	public int getYuzmeHizi() {
		return yuzmeHizi;
	}

	public void setYuzmeHizi(int yuzmeHizi) {
		this.yuzmeHizi = yuzmeHizi;
	}

	public int getSuBasincGucu() {
		return suBasincGucu;
	}

	public void setSuBasincGucu(int suBasincGucu) {
		this.suBasincGucu = suBasincGucu;
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " adlı pokemon su saldırısı yapıyor.");
	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("Yüzme Hızı: " + yuzmeHizi);
		System.out.println("Su Basınç Gücü: " + suBasincGucu);
	}
}