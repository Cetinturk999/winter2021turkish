package day06_ifstatements;

public class C1_IfStatement1 {

	public static void main(String[] args) {
		// 
		
		
	    int a=10;
	    int b=8;
	
		if (a>b) {  // T ve kod calisti.
			System.out.println("ilk sayi buyuk");
				
		}
		
		if (a*b<0) {    // F ise kodu hiç yazýlmamýþ sayar calismaz
			System.out.println("sayilarin carpimi negatif");
		}
		
		if (a<b || b>0) {      // F || T ==> T
			System.out.println("or'lu cumle calisir");  // if'te T varsa if devreye girer çalýþýr
		}
		
		if (a-b>0 && a*b>0) {  // T && T ==> T oldugu icin body devreye girer kod calisir.
			System.out.println("and cumlesi calisir");
		}
		
		
		
		
		
		
	}

}
