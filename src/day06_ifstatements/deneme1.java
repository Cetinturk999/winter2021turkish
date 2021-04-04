package day06_ifstatements;

public class deneme1 {

	public static void main(String[] args) {
		
		int a=10;
	    int b=8;
	    
	    if (a>b) {
	    	System.out.println("ilk sayi buyuk");
	    }
	    
        if (a*b<0) {
        	System.out.println("sayilarin carpimi negatif");
        }
        
        if (a<b || b>0) {
        	System.out.println("or'lu cumle calisir"); // f || t ==> t
        }
        
        if (a-b>0 && a*b>0) {
        	System.out.println("and cumlesi calisir");  // t && t ==> t
        }
        
        
        
	}

}
