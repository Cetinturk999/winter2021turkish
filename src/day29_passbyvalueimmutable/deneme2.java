package day29_passbyvalueimmutable;

public class deneme2 {

	public static void main(String[] args) {
		
		 /* Soru2 : Verilen bir fiyat icin %20 , %30, %50 indirim yapan uc method olusturun.
	       - Method’da indirim uygulayip fiyati main method’da yazdirin
	       - Method’lari arka arkaya cagirip dogru calistiklarini
	         kontrol edin
		 */	
		
		
		double fiyat=100;
		
		System.out.println("Method sonrasý %20 indirimli fiyat : " + indirim20(fiyat));
		System.out.println("Method sonrasý %30 indirimli fiyat : " + indirim30(fiyat));
		System.out.println("Method sonrasý %50 indirimli fiyat : " + indirim50(fiyat));
		
		System.out.println("Method call sonrasý fiyat : " + fiyat);
	}

	public static double indirim50(double fiyat) {
		fiyat=fiyat*0.50;
		System.out.println("%50 indirimli fiyatý : " + fiyat);
		return fiyat;
	}

	public static double indirim30(double fiyat) {
		fiyat=fiyat*0.70;
		System.out.println("%30 indirimli fiyat : " + fiyat);
		return fiyat;
		
	}

	public static double indirim20(double fiyat) {
		fiyat=fiyat*0.80;
		System.out.println("%20 indirimli fiyat : " + fiyat);
		return fiyat;
	}

	
	

}
