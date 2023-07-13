package com.bilgeadam.lesson016.polimorfizm;

public interface IUcabilir {

	void havalan();
	
	void inisYap();
	
	default void deneme() { // private ve default metotlar yazılabiliyor ama genellikle gövdesiz metotlar kullanılır.
		int sayi = 5;
		System.out.println(sayi + "deneme");
	}
}