package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		

		// verilen 2 sayiyi toplayan ve
		// sonucu yazdýran bir mrthod yazýnýz
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		toplama(sayi1,sayi2);
		
		// verilen 3 sayiyi tolayan ve
		// sonucu yazdýran bir method yazýnýz
		
		toplama(sayi1,sayi2,sayi3);
		
		
		// öyle bir method yazalim ki,
		// kac sayi yazarsak yazalým toplasin
		

		toplama(2,3);       //  iki sayinin toplamý methodu
		toplama(2,5,8);     //  uc sayinin toplamý methodu
		
		// istedigimiz kadar sayiyi yazabilecegimiz methodu olusturabilmemiz icin
        // Java varargs olusturmus		
		
		
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin toplami : " + (sayi1+sayi2+sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("Ýki sayinin toplami : " + (sayi1+sayi2));
		
	}

	

		
		
	}


