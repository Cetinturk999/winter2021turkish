package day09_ternary;

public class deneme1 {

	public static void main(String[] args) {
		
		
	
	    int sayi=103;
	
	    String sonuc = (sayi%2==0) ? "Cift sayi" : "Tek sayi" ;
	
        System.out.println(sonuc);
	    
	    // bir variable 'a assign etmek istemezsem;
        // syso icine yazabilirim
	    
	    System.out.println((sayi%2==0) ? "Cift sayi" : "Tek sayi");
        
	    // acýklama yazmak istersem ternary operatorunu parantez icine almalýyým
        
	    System.out.println("islem sonucu : " + (sayi%2==0 ? "Cift sayi" : "Tek sayi"));
        
	}

}
