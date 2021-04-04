package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		
		// IndexOf() methodu bize istedigimiz karakter(lerin) indexini döndurur
		
		
		String str= "Java ögren, is sahibi ol";
		
		System.out.println(str.charAt(6));  // g
		
		System.out.println("char arama " + str.indexOf('g'));  // 6   *sadece bir harf arayabilirim
		
		System.out.println("String arama " + str.indexOf("g")); // 6   *
		
		System.out.println("String kelime arama " + str.indexOf("is"));  // i->12 s->13  // 12
		
		System.out.println("birden fazla varsa " + str.indexOf('i'));  //  ilk buldugunun index'ini 12
		
	
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4)); // 4. karakterden (dahil) sonra ki a nerede
		
		
		System.out.println("olmayan harf " + str.indexOf("dert"));  //
		
		
		
		
		// kullanicidan bir cumle isteyin
		// case sensitive olmadan Java kelimesi icerip icermedigini yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle = scan.nextLine().toLowerCase();
		
		 //int sonuc = cumle.indexOf("java");   // java varsa ilk java kelimesinin index'ini dondurur.
		                                     // java yoksa -1 dondurur.
		
		
		
		
		//  ternary ile cözomu;
		
		//	System.out.println(sonuc==-1 ? "java icermiyor" : "Java iceriyor");
			
		
		// if else ile cozumu;
			
			if (cumle.indexOf("java")>=0) {   // java kelimesinin index'inin 0 veya daha buyuk oldugunu kontrol ediyor
				System.out.println("cumle java iceriyor");
			} else {
                System.out.println("cumle java icermiyor");
			}
		
		
		
		
		scan.close();
		
		
		
	
	}

}
