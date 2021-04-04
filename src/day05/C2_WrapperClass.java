package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		//  java'da 2 t�r data t�r� vard�r
		// prmitive sadece value icerir
		// non-primitive data turleri ise deger ve methodlari iceriyordu
		
		String isim="mehmet";
		
		System.out.println(isim.toUpperCase());
		
		// Wrapper Class : Java'n�n primitive data ile turleri baz� methodlar�
		//                 kullanabilmemiz i�in olu�turdu�u class'lard�r.

		// boolean, char, byte, short, int, long, float, double
		
		//byte sayi=10;  
		
		Byte sayi2=11;  // ismen primitive data turu ile ayni olan non-primitive datalara wrapper denir
		
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE ;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MIN_VALUE;
		System.out.println(byteMaxSayi);
				
		// variable olu�turmadan direk olarak short un en b�y�k ve en k���k de�erlerini yazd�r�n
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		// integer veri t�r�n�n wrapper class' �nteger
		// integer en kucuk ve en buyuk degerleri yazdirin
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Boolean , Character (char) ,Byte , Short , Integer , Long , Float , Double
	
	
		
	}

}
