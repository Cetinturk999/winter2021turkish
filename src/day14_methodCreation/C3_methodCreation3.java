package day14_methodCreation;

public class C3_methodCreation3 {

	public static void main(String[] args) {

		// verilen 3 double sayinin ortalamasini yazdiran alan bir method yazin.
		// main method içinden cagýrarak methodu calýstýrýn

		ortalama(80, 60, 54);

	} // main method sonu

	
	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println("girdiginiz uc sayinin ortalamasi : " + (sayi1 + sayi2 + sayi3) / 3);

	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1 + sayi2) / 2);

	}

} // clas sonu
