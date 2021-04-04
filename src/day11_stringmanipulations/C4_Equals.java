package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		
		//
		
		String str= "Ali Can";
		String str2= "Ali Can";
		
		
		//str ile str2'nin esir olup plmadýgýný yazdýrýn;
		
		System.out.println(str.equals(str2));  // true
		
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");
		
		// Java'da String'ler  case sensitive'dir.(Buyuk kucuk harf duyarlidir. 
		// Bir harf bile farkli olsa Stringler esit olmaz)
		
		

		
		
		
	}

}
