package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		
		
		// charAt(index) 
		// scan.next().charAt(0)  next , ilk kelimeyi alýr.  0. index'teki karakteri verir
		
		
		String str = "Java cok guzel" ;
		
		System.out.println(str.charAt(0));    // J
		
		System.out.println(str.charAt(5));    //  c cunku; index 0'dan baslar
		
		System.out.println(str.charAt(13));   //  l
		
		// kelimenin uzunlugu son index +1 'dir.
		// son index kelimenin uzunlugu -1 'dir
		
		// kullanýcý 10 harfli bir kelime girerse bana son harfi verecek kodu yazýnýz;
		// abcd efghi
		// str.charAt(9) ==> neden 9; 10 harfli ve index 0'dan baslar. 9. i harfi
		// eger index olarak String'in uzunlugu veya daha buyuk bir sayý girilirse; hata(exception) verir
		// yani kelime uzunlugu 14 son index 13 ve 14 dersek hata verir.
		
		
		
	//System.out.println(str.charAt(14));  // exception verir
		// hata verdi ama uyarmadý nedeni; mantýksal bir hata yok
		// java kodu calýþtýrýncaya kadar karakter sayýsýný bilemez.
		// calýstýrýnca 31. satýrda hatayý anlar.
		
		//System.out.println(str.charAt(14));  // exception verir
		// bazý hatalar  syntax'dan anlasýlmaz
		// ancak kod calýstýrýldýktan sonra Java islemi yaparken anlasýlýr.
		// Kod Run edildiginde ortaya cýktýgý ýcýn bu tur hatalara
		// Run Time Error verir.
		
		
		// String str3 =5 ;  // Compile Error CTE
		                     //  Kod calismadan Java'nýn farkýna varýp altýný kýrmýzý cizdiði hatalardýr
		                     //  derleme zaman hatasý
	 	                     //  bu tur hatalar duzeltilmeden Java kodu calýstirmaz
		
	
		
		
		

	}

}
