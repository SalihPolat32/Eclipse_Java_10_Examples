package com.bilgeadam.lesson026;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

/*
 * 1 - Bir limanımız olacak bu limanda yük yük yerleştirilecek alanlar olacak limandaki yük releştirilecek alan sayısı
 * liman oluşturulurken belirlenebilir veya her liman için 10 adet yük yeri olabilir.
 * Her yükün bir ağırlık ve bir kabul tarihi olsun
 * 
 * 2 - Kendi exception sınıfımızı yaratalım ve uygulamamızda bir yük yeri seç metodu yapalım
 * -- eğer seçtiğimiz yer dolu ise dolu yer seçimi diye bir hata fırlatsın
 * -- bir limandaki yeri default olarak dolduralım
 * -- daha sonra yük yeri seç metodunu dolduralım
 * 
 * 3 - yukyerisec2 --> eğer seçtiğimiz yer sınırlar dışında ise sınırlar dışında hatası fırlatsın
 * eğer seçtiğimiz yer dolu ise yer seçimi hatası fırlatsın
 * 
 * ------------- Ödev -------------------
 * 
 * 4 - tarihBelirle metodu yazalım --> utilitydeki tarihi değer alma kullanılabilinir
 * -- a) eğer geçmiş tarih girilmişse Geçersiz kabul tarihi hatası fırlatsın
 * -- b) girdiğimiz gün cumartesi veya pazar ise mesai günleri dışı hatası versin
 * 
 * 5 - yukOlustur metodu yazalım --> dışarıdan bir isim agırlık alacağız ve tarih alacağız
 * -- agırlık ve tarihi yazdığımız metotlar üzerinden alacağız
 * -- eğer hata yoksa bize bir tane yük dönsün
 * -- eğer hata var ise bize boş bir optional dönsün
 * 
 * 6 - Bu metotlarıda bir yük kabulü metotlarında toplayıp bütün kontrollerimden geçmiş ise
 * -- başta aldığım index değerine yükü setleyelim
 * -- yukYeriSec2, yukOlustur bu iki metodu başarılı çalışmışsa yük oluşturdan dönen yükü limandaki yükler arayına index değeri ile setleyeceğiz
 */

public class Uygulama {

	Liman liman = new Liman();

	public Uygulama() {
		this.liman = new Liman();
	}

	public static void main(String[] args) {

		Yuk yuk = new Yuk("Yuk1", 1000, LocalDate.now());

		Uygulama uygulama = new Uygulama();

		uygulama.liman.getYukler()[3] = new Yuk("Yuk3", 100, LocalDate.now().minusDays(5));
		uygulama.liman.getYukler()[5] = new Yuk("Yuk5", 100, LocalDate.now().minusWeeks(2));

//		uygulama.yukYeriSec(yuk);
//
//		try {
//			
//			int index = uygulama.yukYeriSec2();
//			uygulama.liman.getYukler()[index] = yuk;
//
//		} catch (LimanException e) {
//
//			e.printStackTrace();
//
//		}
//		
//		try {
//			
//			uygulama.agirlikBelirle();
//			
//		} catch (LimanException e) {
//			
//			e.printStackTrace();
//			
//		}
//		
//		try {
//
//			uygulama.tarihBelirle();
//
//		} catch (LimanException e) {
//
//			e.printStackTrace();
//
//		}
//		
//		try {
//			
//			System.out.println(uygulama.yukOlustur());
//			
//		} catch (LimanException e) {
//
//			e.printStackTrace();
//			
//		}
		
		uygulama.yukKabul();

//		System.out.println(Arrays.toString(uygulama.liman.getYukler()));
		System.out.println("Program Devam Ediyor...");

	}

	public void yukYeriSec(Yuk yuk) {

		int index = Utility.intDegerAlma("Lütfen Bir Yük Yeri Seçiniz:");

		try {

			if (liman.getYukler()[index] != null) {

				throw new LimanException(ErrorType.DOLU_YERSECIMI);

			} else {

				liman.getYukler()[index] = yuk;
				System.out.println("İşlem Başarılı.");

			}

		} catch (Exception e) {

			System.out.println(e.toString());
			System.out.println("Yük Yeri Seçimi Başarısız.");

		}
	}

	public int yukYeriSec2() throws LimanException {

		int index = Utility.intDegerAlma("Lütfen Bir Yük Yeri Seçiniz:");

		if (index >= liman.getYukler().length || index < 0) {

			throw new LimanException(ErrorType.SINIRLAR_DISINDA);

		} else if (liman.getYukler()[index] != null) {

			throw new LimanException(ErrorType.DOLU_YERSECIMI);

		}

		return index;
	}

	public double agirlikBelirle() throws LimanException {

		double agirlik = Utility.doubleDegerAlma("Lütfen Bir Ağırlık Değeri Belirleyiniz:");

		if (agirlik < 100) {

			throw new LimanException(ErrorType.YETERSİZ_AGIRLIK);

		}
		return agirlik;
	}

	public LocalDate tarihBelirle() throws LimanException {

		LocalDate tarih = Utility.stringTarihDegeriAlma("Lütfen Tarihi yyyy-MM-dd Giriniz:");

		if (LocalDate.now().isAfter(tarih)) {

			throw new LimanException(ErrorType.GECMIS_TARIH);
		}

		if (tarih.getDayOfWeek().equals(DayOfWeek.SATURDAY) || tarih.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {

			throw new LimanException(ErrorType.MESAI_DISI);

		}
		return tarih;
	}

	public Optional<Yuk> yukOlustur() throws LimanException {

		Yuk yuk = null;
		
		try {

			String isim = Utility.stringdDegerAlma("Lütfen Yük İsmini Giriniz:");
			
			double agirlik = agirlikBelirle();
			
			LocalDate tarih = tarihBelirle();
			
			yuk = new Yuk(isim, agirlik, tarih);

		} catch (LimanException e) {

			e.printStackTrace();
			
		} catch (Exception e) {

			System.out.println("Beklenmedik Bir Hata Oluştu: " + e.toString());
		}
		return Optional.ofNullable(yuk);
	}
	
	public void yukKabul() {
		
		int index = -1;
		

		Optional<Yuk> yuk = Optional.empty();
		
		try {
			
			index = yukYeriSec2();
			yuk = yukOlustur();
			
		} catch (LimanException e) {

			e.printStackTrace();
			
		} finally {
			
			if (yuk.isEmpty()) {
				
				System.out.println("Yükünüz Kabul Olmamıştır.");
				
			} else {
				
				System.out.println("Yükünüz Kabul Olmuştur. " + index + " Nolu Yere Yerleşmiştir.");
				liman.getYukler()[index] = yuk.get();

			}
		}
	}
}