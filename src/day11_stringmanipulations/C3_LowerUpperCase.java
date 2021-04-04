package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		
		// str.toLowerCase() => butun verilen String'in tamamýný  " kucuk harfe "  cevirir.
		// str.toUpperCase() => verilen String'in tamamýný  " buyuk harfe "  cevirir.
		
		
		
		String str = "Techproeducation";
		
		
		// buyuk harfle yazdýrmak istersek;
		 System.out.println(str.toUpperCase());
		 
		 
		// str'ý buyuk harfe cevirmek istersek (yazdýrmak degil);
		str=str.toUpperCase();
		
		System.out.println(str);  // bu satýrdan sonra str BUYUK harflerden olusan bir String oldu
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
