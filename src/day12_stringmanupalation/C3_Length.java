package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		
		// kullanýcýdan bir String girmesini isteyin
		// girilen String'in son harfini buyuk harf olarak yazdýrýn
		
		
		
	 	Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String str=scan.nextLine().toUpperCase();
		
	    System.out.println("girdiginiz cumlenin son harfi : " +str.charAt(str.length()-1));  // -2 deseydik sondan 2. harfi verecekti
		
		// lenght() method'u girilen String'in uzunlugunu verir.
		// -1 : 10 harfliyse son index 9
		
		//System.out.println(str);  // kullanýcý ne girdi  buyuk harfle  onu yazdýrýr.
		
		
		String str2="";                      //    "Ali " --> 4  
		System.out.println(str2.length());   // 0
		
		
		String str3="null";  // "null"  hiç demek,reserve diye gecer.
		                   // null uzunlýgunu bulamayýz
		                   // normalde String'ler "" içine yazýlýr ama null için gerek yok
		                   // null case sensitive'dir.dolayisiyla NULL veya null yazýlmaz
		                   // null;bir deger degildir.sadece hiçliði gösteren bir pointer'dir.
		                   // iþaretleyicidir.str3'ün içinde hiçbirsey yok demektir.
		
		 System.out.println(str3.length());  // RTE verir
		
		// null deger atanan String ile String manipulation method'lari kullanýlamaz.
		
		// System.out.println(str3.equals(str2));  // f 
		
		System.out.println(str.charAt(6));  // indexi 1 olan(bastan 2. harfi) verir.
		
		// System.out.println(str3.charAt(1)); // RTE

		
		
		scan.close();
		
		
		
	}

}
