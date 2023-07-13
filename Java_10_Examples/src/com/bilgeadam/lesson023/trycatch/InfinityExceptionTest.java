package com.bilgeadam.lesson023.trycatch;
/*
 * checked exception ==> Kontrol edilmesi zorunlu istisnalar exception sınıfından extends alırlar
 * bir metot içinde checked exception fırlatıyor isek metotta fırlattığımız excepiton türünü declare etmek zorundayız
 * ve metodu kullandığımız yerde bu metodu try catch içine almak zorundayız
 * 
 * unchecked excektion ==> kontrol edilmesi zorunlu olmayan istisnalar run time exception sınıfından extends alırlar
 * kontrol etmek zorunlu değildir fakat hatalı bir değer girersek istisna fırlatacaktır.
 */

public class InfinityExceptionTest {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(bolme(20, 8));
			
		} catch (InfinityException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program Çalışmaya Devam Ediyor.");
		
		try {
			
			pozitifDegerlerToplami(5, -5);
			
		} catch (Exception e) {

			System.out.println("Hata Oluştu: " + e.toString());
		}
		
		System.out.println("2. Kez Program Çalışmaya Devam Ediyor.");
	}
	
	public static double bolme(double sayi1, double sayi2) throws InfinityException {
		
		if (sayi2 == 0) {
			
			throw new InfinityException("Sonsuzluk Hatasi");
			// throw new ArithmeticException();
		}
		
		return sayi1 / sayi2;
	}
	
	public static double pozitifDegerlerToplami(int sayi1, int sayi2) {
		
		if (sayi1 < 0 || sayi2 < 0) {
			
			throw new EksiDegerException("Girdiğiniz Sayılar Pozitif Olmak Zorundadir.");
			
			// throw new ClassNotFoundException();
		}
		
		return sayi1 + sayi2;
	}
}