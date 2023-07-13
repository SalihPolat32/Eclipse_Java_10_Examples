package com.bilgeadam.lesson025.maraton2.kitapci;

import java.util.List;

public interface IKutuphaneIslemleri {

	boolean kiralamaYap() throws KitaplikException;
	
	Kitap kitapAra() throws KitaplikException;
	
	Musteri MusteriAra() throws KitaplikException;
	
	List<Kitap> kiralananKitapListesi() throws KitaplikException;
}