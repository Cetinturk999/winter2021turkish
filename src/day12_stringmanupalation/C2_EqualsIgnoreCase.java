package day12_stringmanupalation;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		// equalsIgnoreCase methodu karsýlastirdiði String'lere case
		// sensitive(buyuk kucuk harf duyarlýlýgý) olmaksýzýn bakar.
		// String'ler ayni ise True , degilse False yazar
		
		String str1 = "Ali Can";
		String str2 = "ali CAN";
		String str3 = "Ali can ";
		
		System.out.println(str1.equals(str2));  // false veriri.cunku String'ler buyuk kucuk harf duyarlýdýr.
		
		System.out.println(str1.equalsIgnoreCase(str2));  // true
		
		System.out.println(str1.equals(str3)); // f
		
		System.out.println(str1.equalsIgnoreCase(str3));  // f cunku buyuk kucuk harf onemli degil bosluk var ve boslukta bir karakterdir.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
