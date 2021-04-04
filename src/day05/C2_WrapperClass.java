package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		//  java'da 2 tür data türü vardýr
		// prmitive sadece value icerir
		// non-primitive data turleri ise deger ve methodlari iceriyordu
		
		String isim="mehmet";
		
		System.out.println(isim.toUpperCase());
		
		// Wrapper Class : Java'nýn primitive data ile turleri bazý methodlarý
		//                 kullanabilmemiz için oluþturduðu class'lardýr.

		// boolean, char, byte, short, int, long, float, double
		
		//byte sayi=10;  
		
		Byte sayi2=11;  // ismen primitive data turu ile ayni olan non-primitive datalara wrapper denir
		
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE ;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MIN_VALUE;
		System.out.println(byteMaxSayi);
				
		// variable oluþturmadan direk olarak short un en büyük ve en küçük deðerlerini yazdýrýn
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		// integer veri türünün wrapper class' ýnteger
		// integer en kucuk ve en buyuk degerleri yazdirin
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Boolean , Character (char) ,Byte , Short , Integer , Long , Float , Double
	
	
		
	}

}
