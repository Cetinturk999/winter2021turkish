package day12_stringmanupalation;

import java.util.Scanner;

public class C4_tekrar {

	public static void main(String[] args) {
		
		 
		
		// String str= "bugun hava cok guzel";
		
		// System.out.println(str.indexOf('u', 6));  // 16 
		
		// System.out.println(str.indexOf('g', 4));  // 15
		
		
		// Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
		// olmadigini yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle yazýnýz");
	
		String str=scan.nextLine().toLowerCase();       // BUTUN KARAKTERLERÝ KUCUK ATTI
		
		System.out.println("Lutfen bir harf yazýnýz");
		
		char harf=scan.next().toLowerCase().charAt(0);  // eger toLowerCase'i yazmasaydýk buyuk harf girdigimizde kabul etmeyevcektir.
		
		
		if (str.indexOf(harf)>=0 ) {
			System.out.println("cumle aranan harfi icerir ");
		} else if(str.indexOf(harf)==-1) {
            System.out.println("cumle aranan harfi icermez");
		}
		
		
		scan.close();
		
		
	}

}
