package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		
		// kullan�c�dan bir String girmesini isteyin
		// girilen String'in son harfini buyuk harf olarak yazd�r�n
		
		
		
	 	Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String str=scan.nextLine().toUpperCase();
		
	    System.out.println("girdiginiz cumlenin son harfi : " +str.charAt(str.length()-1));  // -2 deseydik sondan 2. harfi verecekti
		
		// lenght() method'u girilen String'in uzunlugunu verir.
		// -1 : 10 harfliyse son index 9
		
		//System.out.println(str);  // kullan�c� ne girdi  buyuk harfle  onu yazd�r�r.
		
		
		String str2="";                      //    "Ali " --> 4  
		System.out.println(str2.length());   // 0
		
		
		String str3="null";  // "null"  hi� demek,reserve diye gecer.
		                   // null uzunl�gunu bulamay�z
		                   // normalde String'ler "" i�ine yaz�l�r ama null i�in gerek yok
		                   // null case sensitive'dir.dolayisiyla NULL veya null yaz�lmaz
		                   // null;bir deger degildir.sadece hi�li�i g�steren bir pointer'dir.
		                   // i�aretleyicidir.str3'�n i�inde hi�birsey yok demektir.
		
		 System.out.println(str3.length());  // RTE verir
		
		// null deger atanan String ile String manipulation method'lari kullan�lamaz.
		
		// System.out.println(str3.equals(str2));  // f 
		
		System.out.println(str.charAt(6));  // indexi 1 olan(bastan 2. harfi) verir.
		
		// System.out.println(str3.charAt(1)); // RTE

		
		
		scan.close();
		
		
		
	}

}
