package day09_ternary;

import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
		
		// Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		// girilen degerlere gore 	dikdorgenin kare olup olmadigini yazdirin.

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kontrol icin dikd�rtgenin kenar uzunluklar�n� giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		// kenar1==kenar2 ? "kare" : "kare degil"
		
		//System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
		// makul degerler girerse sorun yok.0 yada eksi degerler girilmemesi laz�m
		
		//kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz kenar uzunl�gu";
				
		System.out.println(kenar1>0 && kenar2>0 ? 
				           kenar1==kenar2 ? "kare" : "kare degil" :
				           "gecersiz kenar uzunl�gu");
		
	   // String sonuc = kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz kenar uzunl�gu")
	   //System.out.println(sonuc); ==> boylede olur
		
		scan.close();
		
	}

}
