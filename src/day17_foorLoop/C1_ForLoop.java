package day17_foorLoop;

import java.util.Scanner;

public class C1_ForLoop {

	private static String Stringsayi2;

	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin	
		 	
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("Lutfen Rakamlar tplamýný bulmak icin pozitif bir tamsayi giriniz");
		} else {
			
			rakamlarToplamiYazdir(sayi);     // önce method cagýcagýz ve  adý;rakamlarToplamýYazdýr olsun
	                                         // argument olarak sayimizi yazacagýz
		
			
		}
	}

	public static void rakamlarToplamiYazdir(int sayi) {
		
		int rakamlarToplami=0; 
		String sayi2=sayi+"";                 // integerde uzunluk yok ve "" hiçlik concatination yaptýk
		                                      // ve sayi1'i String'e cevirdik  
		
		for (int i = 0; i < sayi2.length(); i++) {  // i=1 ; i<=sayi2.lenght()
			rakamlarToplami+=sayi%10;
			sayi/=10;
		}
		
		    System.out.println("rakamlar toplami : " + rakamlarToplami);
		
		
		
		
		
	}

}
