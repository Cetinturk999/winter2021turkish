package day13_stringmanipulations;

public class C6_SubString {

	public static void main(String[] args) {
		
		
		String str="Her ders Java gibi olsa";
		
		System.out.println(str.substring(10));  // 10. cu index dahil(inclusive) sonuna kadar tum string
		
		System.out.println(str.substring(str.length()-10)); // son 10 harfi yazdirin
		
		// ilk 10 karakteri alma;
		
		System.out.println(str.substring(0, 10));  // substring(0, 10) yazildigind
		                                           // 0 ÝNCLUSÝVE (dahil), 10 exclusive
	     
		// 11.'ci karakterden sonuna kadar olan String'i yazdýrýn;
		
		System.out.println(str.substring(10));
		
		
		
		// str'in ilk 10 harfini * ile gizleyin,
		// geriye kalanlar normal yazýlsýn
		
		System.out.println("**********" + str.substring(10));  // cumlede sayi olmadýgýný bildiðimiz icin boyle yaptýk
		                                                       // kullanýcýdan isteseydik bu yönt yapamazdýk
		
		System.out.println(str.substring(0, 0).replaceAll("\\D", "*")+
				               str.substring(10));                                    // sayi oladýgý için yapabiliriz
		
		

		System.out.println(str.substring(10, 10));  // 10. cu indekstekini al ,10. cu indekstekini alma ==> almaz
		                                            // Java guncel olaný aldýgý icin en sonu yapar
		
		//  System.out.println(str.substring(8, 7));    // exception hata verir ==> 8. ci indeksten sonra 7. ci indeksi veremem
		                                                // Java soldan saga gider geriye gitmez
		
		System.out.println(str.substring(22));   // 22 desek; a    length()-1 -> son karakter
		                                         
		System.out.println(str.substring(23));   // length() -> boþ
		
		// System.out.println(str.substring(24));   // length()'den buyuk sayi yazarsak RTE
		
		
		
		
		// str'in ilk 10 harfini * ile gizleyin,
		// geriye kalanlar normal yazýlsýn
		
		String str3=str.substring(0, 10);   // str'nin ilk 10 harfini aldýk
		
		str3=str.replaceAll("\\W", "a");
				
		System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));		
		
		
	
				
	}

}
