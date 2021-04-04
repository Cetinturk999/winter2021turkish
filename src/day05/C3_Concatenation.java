package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation (Birlestirme) : java da birden fazla String'i + isareti ile 
		// toplarsanýz, Java Stringleri yanyana yazar
		
		
		String str1="Java";
		String str2="Guzeldir";
		String bosluk=" ";
		
		System.out.println(str1+str2);     // Java Guzeldir
		// eger arada bosluk býrakmak ýstersek
		System.out.println(str1+ " "+str2);   // Java Guzeldir
		
        System.out.println(str1+' '+str2);
		
        // GuzeldirJava yazdýrýn
        
        System.out.println(str2+str1); // str1 ve str2 string'dir ve islem + olsada java concatenation yapar
        
        int sayi1= 5;
        int sayi2= 4;
        
        // verilen degiskenleri kullanarak consolda 9 yazdýrýn
        
        System.out.println(sayi1+sayi2); // sayi1 ve sayi2 matematiksel iþlemdir ve java toplar .
        
        
        System.out.println(sayi1 + sayi2 + str1 +str2);   // 9JavaGuzeldir
        
		System.out.println(str1+str2+sayi1+sayi2);  // JavaGuzeldir54
                                                    // JavaGuzeldir string ve 54 Ýnteger'dýr.
        // verilen deðiskenlerle JavaGuzeldir1 yazdýrýn
		
		System.out.println(str1 + str2 + (sayi1 - sayi2)); // JavaGuzeldir1
         
		//verilen degiskenlerle "9 JavaGuzeldir" yazdirin
		
		System.out.println(sayi1+sayi2 +" " +str1+str2);  // 9 JavaGuzeldir
		
		System.out.println(sayi1+sayi2+' '+str1+str2); // 41JavaGuzeldir
		
		// Java matematiksel bir islem yaparken char data turunden bir degerle
		// karsilasirsa o char'in ascii degerini alir
		
		System.out.println(sayi1+sayi2+str1+' '+str2); // 9Java Guzeldir
		
		// String'den sonra ' ' olursa bosluk býrakýr
		// matematiksel bir iþlemde ' ' olursa  char'ýn asci degerini alýr
		
		System.out.println(str1+str2+sayi1*sayi2);  // JavaGuzeldir20
		
		
        // *************
		
		// kural 1 : eger toplanan degerlerden bir tanesi bile String ise Java 
		//           toplama degil concanetion(birlestirme)yapar.
		
		// kural 2 : Eger toplanan degerlerin ikiside matematiksel islemse Java toplar
     
		// kural 3 : Eger sayi ve String degiskenler birlikte kullanilacaksa oncelikler
		//			  belirlenip o islemler icin parantez kullanilabilir
		
		// kural 4 : Matematiksel bir islemde char degisken kullanilirsa, Java char'in ascii degerini
		//			 isleme alir
		// kural 5 : char bir degisken ile String bir degisken toplanirsa concatenation olur
		 
		
	
		
		
		
	}

}
