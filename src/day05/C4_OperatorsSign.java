package day05;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		
		//    = Atama (assignment) isareti
     
		int sayi1=5;
		int sayi2=4;
		
		boolean isGreat= sayi1>sayi2;  // true/false
		System.out.println(isGreat);   // true
		
		boolean isSmall=sayi1<=sayi2; 
		System.out.println(isSmall);   // false
		
		boolean isEqual= sayi1==sayi2; // == esit mi anlamýna gelir? ve  Comparison(karsýlastýrma) operator denir
		System.out.println(isEqual);   // false
		
		System.out.println(sayi1==5);  // true
		
		System.out.println(sayi1*sayi2==20);  // false
		
		System.out.println(sayi1+sayi2 !=9);  // false    sayilarin + 9 degil
		
		System.out.println(sayi1-sayi2 !=0);   // true    (5-4) sifira esit degildir
		
		// tum mantýksal ifadelerde ! kullanýldýgýnda olumsuzluk anlamý katar
		
		
		
		
		
		
		
		
		
	}

}
