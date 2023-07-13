package com.bilgeadam.lesson016.polimorfizm;

import java.util.Arrays;
import java.util.Random;

/*
 * 1) Abstract kalıtım yoluyla(extends) aktarılan bir sınıf ve java tek bir sınıftan kalıtıma izin veriyor.
 * 
 * 1) iterface implements edilerek metotları alt sınıflara aktarılması birden fazla interface implemente edilebilir.
 * (Kalıtım yoluyla oluşturamadığımız ortak davranışları abstract yerine interfaceler üzreinden implemente ederiz)
 * 
 * 2) Abstract sınıflar içerisinde gövdeli ve gövdesiz metotlar ve özellikler tutulabilir.
 * 
 * 2) İnterface içerisinde genelde gövdesiz metotlar tutar.
 */

public class Runner {

	public static void main(String[] args) {

		Kullanici kullanici = new Kullanici("Mustafa");
		Pokemon atesPokemonu = new AtesPokemonu(1, "charizard", 2000, 300, 3, 1500);
		Pokemon suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, 250, 368);
		ElektrikPokemonu elektrikPokemonu = new ElektrikPokemonu(3, "pikhachu", 180, 200, 2, 1280);

		// System.out.println(((AtesPokemonu)atesPokemonu).getYakicilikGucu());

		Pokemon[] pokemonlar = { atesPokemonu, suPokemonu, elektrikPokemonu };

		kullanici.setPokemonlar(pokemonlar);

		System.out.println(Arrays.toString(kullanici.getPokemonlar()));
		System.out.println(kullanici);

		Pokemon pokemon = pokemonSec(pokemonlar);

		saldir(pokemon);
		saldir2(pokemon);
		
		Pokemon pokemon2 = new AtesPokemonu(4, "x", 0, 0, 0, 0);
		
	}

	public static void saldir(Pokemon pokemon) {
		pokemon.saldir();
	}

	public static void saldir2(Pokemon pokemon) {
		if (pokemon instanceof ElektrikPokemonu) {
			System.out.println(pokemon.getAd() + " Ateş Saldırısı Yapıyor.");
		} else if (pokemon instanceof SuPokemonu) {
			System.out.println(pokemon.getAd() + " Su Saldırısı Yapıyor.");
	    } else {
		System.out.println(pokemon.getAd() + " Elektrik Saldırısı Yapıyor.");
	    }
	}

	public static Pokemon pokemonSec(Pokemon[] pokemonlar) {
		Random random = new Random();
		int index = random.nextInt(pokemonlar.length);
		return pokemonlar[index];
	}
}