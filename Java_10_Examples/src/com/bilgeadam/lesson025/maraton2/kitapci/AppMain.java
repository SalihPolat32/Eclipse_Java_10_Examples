package com.bilgeadam.lesson025.maraton2.kitapci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppMain implements IKutuphaneIslemleri {

	static Scanner scanner = new Scanner(System.in);

	private final static List<Kitap> kitaplar = new ArrayList<>();
	private final static List<Musteri> musteriler = new ArrayList<>();
	private final static List<Kasiyer> kasiyerler = new ArrayList<>();
	private final static List<Kiralama> kiralamalar = new ArrayList<>();

	public static void main(String[] args) {

		// System.out.println("================================");
		kitapEkle();
		// System.out.println("================================");
		musteriEkle();
		// System.out.println("================================");
		kasiyerEkle();
		// System.out.println("================================");
		kiralamaEkle();
		System.out.println("================================");
		
		AppMain appMain = new AppMain();
		
		try {
			
			appMain.kiralamaYap();
			System.out.println("================================");
			appMain.kitapAra();
			System.out.println("================================");
			appMain.MusteriAra();
			System.out.println("================================");
			System.out.println(appMain.kiralananKitapListesi());
			System.out.println("================================");
			
		} catch (KitaplikException e) {
			
			System.out.println(e.getMesaj());
			e.printStackTrace();
		}
		
		System.out.println("===--- Kitap id ile Kitabı Kiralayan Müşterileri Bulma ---===");
		kitapIdsiIleKiralayanlarıBulma(2);
		System.out.println("================================");
		System.out.println("===--- Kitap Adı ile Kitabı Kiralayan Müşterileri Bulma ---===");
		kitapAdiIleKiralayanlariBulma("Simyacı");
		System.out.println("================================");
		System.out.println("===--- Ado 'Ahm' ile Başlayan Müşteriler ---===");
		ahmIleBaslayanMusteriler();
		System.out.println("================================");
		System.out.println("===--- Müşteri id Kiralanan Kitapları Bulma ---===");
		musteriIdyeGoreKiralananKitaplar(1);
		System.out.println("================================");

	}

	private static void musteriIdyeGoreKiralananKitaplar(int musteriId) {
		
		List<Kitap> musteriyeKitaplar = kiralamalar.stream().filter(x -> x.getMusteri().getId() == musteriId).map(y -> y.getKitap()).toList();
		
		musteriyeKitaplar.stream().forEach(x -> System.out.println(x.getIsim()));
	}

	private static void ahmIleBaslayanMusteriler() {
		
		List<Musteri> musteriAdlari = musteriler.stream().filter(x -> x.getAd().startsWith("Ahm")).toList();
		
		musteriAdlari.stream().forEach(x -> System.out.println(x.getAd()));
	}

	public static void kitapAdiIleKiralayanlariBulma(String kitapAdi) {
		
		List<Musteri> kiralamaYapanMüsteriler = kiralamalar.stream().filter(x -> x.getKitap().getIsim().equalsIgnoreCase(kitapAdi))
				.map(x -> x.getMusteri()).toList();
		
		kiralamaYapanMüsteriler.stream().forEach(x -> System.out.println(x.getAd()));
	}

	public static void  kitapIdsiIleKiralayanlarıBulma(int kitapID) {

		List<Kiralama> kiradakiKitaplarKitaplar = kiralamalar.stream().filter(x -> x.getKitap().getId() == kitapID).collect(Collectors.toList());
		
		if (kiradakiKitaplarKitaplar == null) {
			System.out.println("Kitap Kiralanmamıştır.");
		}
		
		kiradakiKitaplarKitaplar.stream().forEach(x -> System.out.println(x.getMusteri().getAd()));
	}

	public static void kitapEkle() {

		Kitap kitap1 = new Kitap(1, "ÇalıKuşu");
		Kitap kitap2 = new Kitap(2, "Denemeler");
		Kitap kitap3 = new Kitap(3, "İnce Memed");
		Kitap kitap4 = new Kitap(4, "Suç ve Ceza");
		Kitap kitap5 = new Kitap(5, "Harry Potter");
		Kitap kitap6 = new Kitap(6, "Yabancı");
		Kitap kitap7 = new Kitap(7, "Savaş ve Barış");
		Kitap kitap8 = new Kitap(8, "Simyacı");
		Kitap kitap9 = new Kitap(9, "Cesur Yeni Dünya");
		Kitap kitap10 = new Kitap(10, "Dijital Kale");
		Kitap kitap11 = new Kitap(11, "Ateşten Gömlek");
		Kitap kitap12 = new Kitap(12, "Momo");
		Kitap kitap13 = new Kitap(13, "1984");
		Kitap kitap14 = new Kitap(14, "Ermiş");

		listeyeEkle(kitaplar, kitap1);
		listeyeEkle(kitaplar, kitap2);
		listeyeEkle(kitaplar, kitap3);
		listeyeEkle(kitaplar, kitap4);
		listeyeEkle(kitaplar, kitap5);
		listeyeEkle(kitaplar, kitap6);
		listeyeEkle(kitaplar, kitap7);
		listeyeEkle(kitaplar, kitap8);
		listeyeEkle(kitaplar, kitap9);
		listeyeEkle(kitaplar, kitap10);
		listeyeEkle(kitaplar, kitap11);
		listeyeEkle(kitaplar, kitap12);
		listeyeEkle(kitaplar, kitap13);
		listeyeEkle(kitaplar, kitap14);
	}

	public static void musteriEkle() {

		Musteri musteri1 = new Musteri(1, "Salih Polat", "DÖNMEZ", "05356545345", "Ankara", kitaplar);
		Musteri musteri2 = new Musteri(2, "Ali", "GÜNEŞ", "05347559487", "İstanbul", kitaplar);
		Musteri musteri3 = new Musteri(3, "Burak", "DELİCE", "05462718778", "Kırşehir", kitaplar);
		Musteri musteri4 = new Musteri(4, "Ahmet", "AKKOYUN", "05347884958", "Antalya", kitaplar);
		Musteri musteri5 = new Musteri(5, "Aminenur", "GÖYNÜK", "05487994872", "Ankara", kitaplar);
		Musteri musteri6 = new Musteri(6, "Engin", "ERTİKMEN", "05347884958", "İstanbul", kitaplar);

		listeyeEkle(musteriler, musteri1);
		listeyeEkle(musteriler, musteri2);
		listeyeEkle(musteriler, musteri3);
		listeyeEkle(musteriler, musteri4);
		listeyeEkle(musteriler, musteri5);
		listeyeEkle(musteriler, musteri6);
	}

	public static void kasiyerEkle() {

		Kasiyer kasiyer1 = new Kasiyer(1, "Orhun", "BAYINDIR", 20000.0, true);
		Kasiyer kasiyer2 = new Kasiyer(2, "Aysu", "ÇAĞIŞLAR", 15000.0, false);
		Kasiyer kasiyer3 = new Kasiyer(3, "Gizem", "KUŞCUOĞLU", 25000.0, true);

		listeyeEkle(kasiyerler, kasiyer1);
		listeyeEkle(kasiyerler, kasiyer2);
		listeyeEkle(kasiyerler, kasiyer3);
	}

	public static void kiralamaEkle() {

		Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(0), kitaplar.get(0), musteriler.get(1));
		Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(0), kitaplar.get(2), musteriler.get(1));
		Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(0), kitaplar.get(8), musteriler.get(1));
		Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(1), kitaplar.get(7), musteriler.get(2));
		Kiralama kiralama5 = new Kiralama(5, kasiyerler.get(1), kitaplar.get(12), musteriler.get(2));
		Kiralama kiralama6 = new Kiralama(6, kasiyerler.get(1), kitaplar.get(11), musteriler.get(3));
		Kiralama kiralama7 = new Kiralama(7, kasiyerler.get(2), kitaplar.get(9), musteriler.get(4));
		Kiralama kiralama8 = new Kiralama(8, kasiyerler.get(2), kitaplar.get(5), musteriler.get(4));
		Kiralama kiralama9 = new Kiralama(9, kasiyerler.get(2), kitaplar.get(10), musteriler.get(4));
		Kiralama kiralama10 = new Kiralama(9, kasiyerler.get(0), kitaplar.get(1), musteriler.get(0));
		Kiralama kiralama11 = new Kiralama(9, kasiyerler.get(1), kitaplar.get(3), musteriler.get(5));
		Kiralama kiralama12 = new Kiralama(9, kasiyerler.get(2), kitaplar.get(4), musteriler.get(5));

		listeyeEkle(kiralamalar, kiralama1);
		listeyeEkle(kiralamalar, kiralama2);
		listeyeEkle(kiralamalar, kiralama3);
		listeyeEkle(kiralamalar, kiralama4);
		listeyeEkle(kiralamalar, kiralama5);
		listeyeEkle(kiralamalar, kiralama6);
		listeyeEkle(kiralamalar, kiralama7);
		listeyeEkle(kiralamalar, kiralama8);
		listeyeEkle(kiralamalar, kiralama9);
		listeyeEkle(kiralamalar, kiralama10);
		listeyeEkle(kiralamalar, kiralama11);
		listeyeEkle(kiralamalar, kiralama12);
	}

	public static <T> void listeyeEkle(List<T> list, T object) {
		list.add(object);
	}

	@Override
	public boolean kiralamaYap() throws KitaplikException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kasiyer id'yi Giriniz:");
		int kasiyerId = scanner.nextInt();
		Kasiyer kasiyer = kasiyerler.get(kasiyerId - 1);

		System.out.println("Müşteri id'yi giriniz:");
		int musteriId = scanner.nextInt();
		Musteri musteri = musteriler.get(musteriId - 1);

		System.out.println("Kütüphanedeki Kitaplar:");
		kitaplar.stream().filter(k -> k.getDurum().equals(EDurum.KITAPLIKTA))
				.forEach(x -> System.out.println(x.getId() + "-" + x.getIsim()));

		System.out.println("Kitap Seçiniz:");
		int kitapId = scanner.nextInt();
		Kitap kitap = kitaplar.get(kitapId - 1);

		if (kitap.getDurum().equals(EDurum.KIRADA)) {
			throw new KitaplikException("Bu Kitap zaten Kirada  kiralama işlemi başarısız");
		} else {
			Kiralama kiralama = new Kiralama(kiralamalar.size() + 1, kasiyer, kitap, musteri);
			kiralamalar.add(kiralama);
			return true;
		}
	}

	@Override
	public Kitap kitapAra() throws KitaplikException {

		System.out.println("Kitap İsmi Giriniz:");
		String isim = scanner.nextLine();

		List<Kitap> aranaKitap = kitaplar.stream().filter(x -> x.getIsim().toUpperCase().equals(isim.toUpperCase()))
				.toList();

		if (aranaKitap.isEmpty()) {
			throw new KitaplikException("Aranan Kitap Mevcut Değil!!!");
		}

		return aranaKitap.get(0);
	}

	@Override
	public Musteri MusteriAra() throws KitaplikException {

		System.out.println("Müşteri Adını Giriniz:");
		String isim = scanner.nextLine();

		List<Musteri> aranaMusteri = musteriler.stream().filter(x -> x.getAd().toUpperCase().equals(isim.toUpperCase()))
				.toList();

		if (aranaMusteri.isEmpty()) {
			throw new KitaplikException("Aranan Müşteri Mevcut Değil!!!");
		}

		return aranaMusteri.get(0);
	}

	@Override
	public List<Kitap> kiralananKitapListesi() throws KitaplikException {

		List<Kitap> kiralananKitaplar = kitaplar.stream().filter(x -> x.getDurum().equals(EDurum.KIRADA)).toList();

		if (kiralananKitaplar.isEmpty()) {
			throw new KitaplikException("Tum Kitaplar Kitapliktadır.");
		}

		return kiralananKitaplar;
	}
}