package day13_stringmanipulations;

import java.util.Scanner;

public class deneme9 {

	public static void main(String[] args) {
		
		// Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
	    // kart no : **** **** **** 1234

		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lutfen kart numaran˝z˝ giriniz");
		String kartno=scan.next();
		
		char isim›lkHarf =isim.toUpperCase().charAt(0);
		
		String isimGeriKalan = isim.substring(1).replaceAll("\\w", "*");
		String soy›sim›lkHarf = soyisim.toUpperCase().substring(0, 1);   // charAt ile de alabilirdik
		String soy›simGeriyeKalan =soyisim.substring(1).replaceAll("\\w", "*");
		  
		String kartNoBasi = "**** **** **** ";
		String kartNoSonu = kartno.substring(kartno.length() -4);
		
		System.out.println("isminiz ve soyisminiz :" + isim›lkHarf + isimGeriKalan + " " +
		                    soy›sim›lkHarf + soy›simGeriyeKalan);
		
		System.out.println("Kart No : "+ kartNoBasi + kartNoSonu);
		
		
		scan.close();
		
		
		
		
		
	}

}
