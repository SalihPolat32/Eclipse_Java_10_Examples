package com.bilgeadam.lesson017;

public class KargoUcagi extends Ucak implements IYuk {
	
	@Override
	public void yukAl() {
		System.out.println(getClass().getSimpleName() + " Yük Alıyor.");
	}

	@Override
	public void yukBosalt() {
		System.out.println(getClass().getSimpleName() + " Yük Boşaltıyor.");
	}
}