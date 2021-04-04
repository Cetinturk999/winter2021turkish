package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		

		// verilen 2 sayiyi toplayan ve
		// sonucu yazd�ran bir mrthod yaz�n�z
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		toplama(sayi1,sayi2);
		
		// verilen 3 sayiyi tolayan ve
		// sonucu yazd�ran bir method yaz�n�z
		
		toplama(sayi1,sayi2,sayi3);
		
		
		// �yle bir method yazalim ki,
		// kac sayi yazarsak yazal�m toplasin
		

		toplama(2,3);       //  iki sayinin toplam� methodu
		toplama(2,5,8);     //  uc sayinin toplam� methodu
		
		// istedigimiz kadar sayiyi yazabilecegimiz methodu olusturabilmemiz icin
        // Java varargs olusturmus		
		
		
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin toplami : " + (sayi1+sayi2+sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("�ki sayinin toplami : " + (sayi1+sayi2));
		
	}

	

		
		
	}


