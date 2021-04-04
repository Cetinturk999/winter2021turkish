package day29_passbyvalueimmutable;

public class deneme1 {

	public static void main(String[] args) {
		
		
		/*Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
        - Method’da indirim uygulanan fiyati yazdirin
        - Method Call sonrasi original fiyati yazdirin ve
          method’da yapilan degisikligin  orginal degeri
          degistirip degistirmedigini kontrol edin.
		*/

		double fiyat=1000;
		
		indirimli(fiyat);
		System.out.println(fiyat); // 1000.0
			
	}

	public static void indirimli(double fiyat) {
		
		 fiyat= fiyat*0.90;
		 System.out.println(fiyat);   // 900.0
	}

}
