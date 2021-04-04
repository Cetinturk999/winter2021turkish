package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
       String isim="Ali";
	   isim.concat("can");
		System.out.println("1 : " + isim);                  // Ali
		
		System.out.println("2 : " + isim.concat("can"));    //  Alican
		System.out.println(isim);                           // Ali
		
		// String'lerde method ile yaptýgýmýz degisiklikler kalýcý olmaz
		
		// cunku Java String Class'ini immutable(degismez) yapmistir
		
		
	    List<String> isimList = new ArrayList<>();
	    System.out.println(isimList); // []
	    
		isimList.add("Ali");
		isimList.add("Can");		
		System.out.println(isimList); // [Ali, Can]		
		
		isimList.remove(1);		
		System.out.println(isimList); // [Ali]		
		
		// list'lerde method'la yaptigimiz degisiklikler kalici olarak list'e islenir.
		//		 cunku list mutable(degisir)'dir.	
	}

}
