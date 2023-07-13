package com.bilgeadam.lesson014;
/*
 * 1 - Kullanıcı sınıfı olacak
 * - kullanıcılar username, ID ve şifre ile uygulamaya giriş yapsın -
 * - daha sonra sepetlerine ürün eklesinler
 * 2 - kullanıcılarımızı databasede tutalım
 * - databasede başlangıçta 3 default kullanıcı olsun
 * - uygulama içinde kayıt ol seçeneği ile buradaki databasemize kullanıcı ekleyelim
 * 3 - sepet ==> sepetimizde eklediğimiz ürünleri tutan bir yapı olsun
 * - her kullanıcı kendi sepetine ürün ekleyebilecek
 * 4 - urunlerimizi enum yapalım
 *  CIPS, KOLA, SEKER, YAG, UN, EKMEK, ÇAY, YUMURTA, YOGURT, SUT
 */

import java.util.Scanner;

public class Uygulama {

	Scanner scanner = new Scanner(System.in);
	
//	public Uygulama() {
//		DataBase.baslangicVerisiEkle();
//	}

	public void menu() {

		System.out.println("1 - Kayıt Ol");
		System.out.println("2 - Giriş Yap");
		System.out.println("3 - Kullanıcıları Göster");
		System.out.println("4 - Çıkış Yap");
	}

	public int secimYap() {

		System.out.println("Lütfen Bir İşlem Seçimi Yapınız:");
		String secim = scanner.next();
		return Integer.parseInt(secim);
	}

	public void uygulamayiBaslat() {
		
		DataBase.baslangicVerisiEkle();

		int kontrol = 4;

		do {
			menu();
			kontrol = secimYap();

			switch (kontrol) {
			case 1:
				kayitOl();
				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanicileriGoster();
				break;
			case 4:
				break;

			default:
				break;
			}

		} while (kontrol != 4);
	}
	
	private void girisYap() {
		
		System.out.println("Giriş Yapmak İçin Lütfen Kullanıcı Adınızı Giriniz:");
		String username = scanner.next();
		System.out.println("Lütfen Şifrenizi Giriniz:");
		String sifre = scanner.next();
		
		Kullanici kullanici = DataBase.kullaniciVarMi(username, sifre);		
		
		if (kullanici != null) {
			System.out.println("Giriş Başarılı");
			kullaniciMenusu(kullanici);
		} else {
			System.out.println("Kullanıcı Adı veya Şifre Hatalı!!!");
		}
	}
	
	private void kullaniciMenusu(Kullanici kullanici) {
		
		String kontrol = "3";
		
		do {
			System.out.println("===---" + kullanici.getUsername() + " Hoşgeldiniz---===");
			System.out.println("1 - Sepeti Göster");
			System.out.println("2 - Ürün Ekle");
			System.out.println("3 - Çıkış");
			System.out.println("Lütfen Seçim Yapınız:");
			kontrol = scanner.nextLine();
			
			switch (kontrol) {
			case "1":
				sepetiGoster(kullanici);
				break;
			case "2":
				urunEkle(kullanici);
				break;
			case "3":
				break;

			default:
				break;
			}
		} while (!kontrol.equals("3"));
	}

	private void urunEkle(Kullanici kullanici) {
		
		for (EUrun urun : EUrun.values()) {
			System.out.println((urun.ordinal() + 1) + "-" + urun.toString());
		}
		System.out.println("Lütfen Bir Ürün Seçiniz:"); // 1 ---> 0. index
		int index = scanner.nextInt() - 1;
		scanner.nextLine();
		kullanici.getSepet().getUrunler()[Sepet.index] = EUrun.values()[index];
		Sepet.index++;
		System.out.println(EUrun.values()[index] + " Adlı Ürün Sepete Eklendi.");
	}

	private void sepetiGoster(Kullanici kullanici) {
		System.out.println(kullanici.getSepet());
	}

	private void kullanicileriGoster() {
		
		System.out.println("===---Kullanıcılar---===");
		
		for (Kullanici kullanici : DataBase.kullanicilar) {
			if (kullanici != null) {
				System.out.println(kullanici);
			}
		}
	}

	public void kayitOl() {

			System.out.println("Lütfen İsim Giriniz: ");
			String isim = scanner.next();
			System.out.println("Lütfen Kullanıcı Adınızı Giriniz: ");
			String username = scanner.next();
			System.out.println("Lütfen Şifre Belirleyiniz: ");
			String sifre = scanner.next();
			
			Kullanici kullanici = new Kullanici(DataBase.index + 1, username, sifre, isim);
			
			DataBase.kullaniciEkle(kullanici);
			
			System.out.println("Kullanıcı Kayıt Edildi.");
	}
}
