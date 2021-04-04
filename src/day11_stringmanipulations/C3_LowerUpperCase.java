package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		
		// str.toLowerCase() => butun verilen String'in tamam�n�  " kucuk harfe "  cevirir.
		// str.toUpperCase() => verilen String'in tamam�n�  " buyuk harfe "  cevirir.
		
		
		
		String str = "Techproeducation";
		
		
		// buyuk harfle yazd�rmak istersek;
		 System.out.println(str.toUpperCase());
		 
		 
		// str'� buyuk harfe cevirmek istersek (yazd�rmak degil);
		str=str.toUpperCase();
		
		System.out.println(str);  // bu sat�rdan sonra str BUYUK harflerden olusan bir String oldu
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
