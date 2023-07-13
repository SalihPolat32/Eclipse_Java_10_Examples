package com.bilgeadam.lesson016.polimorfizm;

public class Test {

	public static void main(String[] args) {

//		POKEMON POKEMON1 = NEW POKEMON();
//		POKEMON1.SETAD("CHARİZARD");
//		POKEMON1.SETGUC(5000);
//		POKEMON1.SETCAN(350);
//		POKEMON1.SETSEVİYE(3);
//		POKEMON1.SETTUR("ATEŞ");
//		
//		POKEMON1.SALDİR();
//		POKEMON1.KACİNMA();
//		POKEMON1.POKEDEX();
//		
//		POKEMON POKEMON2 = NEW POKEMON();
//		POKEMON2.SETAD("PİKACHU");
//		POKEMON2.SETGUC(1000);
//		POKEMON2.SETCAN(250);
//		POKEMON2.SETSEVİYE(1);
//		POKEMON2.SETTUR("ELEKTRİK");
//		
//		POKEMON2.SALDİR();
//		POKEMON2.KACİNMA();
//		POKEMON2.POKEDEX();
//		
//		ELEKTRİKPOKEMONU POKEMON3 = NEW ELEKTRİKPOKEMONU();
//		POKEMON3.SETAD("RİKACHU");
//		POKEMON3.SETGUC(2000);
//		POKEMON3.SETCAN(250);
//		POKEMON3.SETSEVİYE(2);
//		POKEMON3.SETTUR("ELEKTRİK");

		AtesPokemonu pokemon4 = new AtesPokemonu(0, "charizard", 1500, 300, 3, 5630);

		pokemon4.saldir();
		pokemon4.pokedex();

		SuPokemonu suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, 250, 368);
		suPokemonu.saldir();
		suPokemonu.pokedex();
	}
}