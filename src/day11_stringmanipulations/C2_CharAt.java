package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		
		
		// charAt(index) 
		// scan.next().charAt(0)  next , ilk kelimeyi al�r.  0. index'teki karakteri verir
		
		
		String str = "Java cok guzel" ;
		
		System.out.println(str.charAt(0));    // J
		
		System.out.println(str.charAt(5));    //  c cunku; index 0'dan baslar
		
		System.out.println(str.charAt(13));   //  l
		
		// kelimenin uzunlugu son index +1 'dir.
		// son index kelimenin uzunlugu -1 'dir
		
		// kullan�c� 10 harfli bir kelime girerse bana son harfi verecek kodu yaz�n�z;
		// abcd efghi
		// str.charAt(9) ==> neden 9; 10 harfli ve index 0'dan baslar. 9. i harfi
		// eger index olarak String'in uzunlugu veya daha buyuk bir say� girilirse; hata(exception) verir
		// yani kelime uzunlugu 14 son index 13 ve 14 dersek hata verir.
		
		
		
	//System.out.println(str.charAt(14));  // exception verir
		// hata verdi ama uyarmad� nedeni; mant�ksal bir hata yok
		// java kodu cal��t�r�ncaya kadar karakter say�s�n� bilemez.
		// cal�st�r�nca 31. sat�rda hatay� anlar.
		
		//System.out.println(str.charAt(14));  // exception verir
		// baz� hatalar  syntax'dan anlas�lmaz
		// ancak kod cal�st�r�ld�ktan sonra Java islemi yaparken anlas�l�r.
		// Kod Run edildiginde ortaya c�kt�g� �c�n bu tur hatalara
		// Run Time Error verir.
		
		
		// String str3 =5 ;  // Compile Error CTE
		                     //  Kod calismadan Java'n�n fark�na var�p alt�n� k�rm�z� cizdi�i hatalard�r
		                     //  derleme zaman hatas�
	 	                     //  bu tur hatalar duzeltilmeden Java kodu cal�stirmaz
		
	
		
		
		

	}

}
