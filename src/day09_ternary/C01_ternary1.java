package day09_ternary;

public class C01_ternary1 {

	public static void main(String[] args) {
		
    // ternary islemi bir sonuc d�ndurdugunden bir sonuc olu�turup ona assign etmeliyiz
		
	int sayi=101;
	
	String sonuc = sayi%2==0 ? "cift sayi" : "tek sayi" ;
	
	System.out.println(sonuc);	
		
		
	// ben bir variable'a assign istemezsem;
    // o zama syso icine yazabiliriz
	
	System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
	
	// basina aciklama yazmak istersem
	// ternary operatorunu parantez i�ine almal�y�m
	
	System.out.println("islem sonucu: " + (sayi%2==0 ? "cift sayi" : "tek sayi") );
		
		
		
		
		
		

	}

}
