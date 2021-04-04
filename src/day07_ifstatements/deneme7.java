package day07_ifstatements;

import java.util.Scanner;

public class deneme7 {

	public static void main(String[] args) {
		
	    // Kullanicidan iki sayi isteyin, 
		// sayilarin ikisi de pozitif ise "sayilarin toplami" ni yazdirin	
		// sayilarin ikisi de negative ise "sayilarin carpimi" ni yazdirin, 
		// sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, 
		// sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
		
		// a=0 veya b=o
		// a>0 ve b>0
		// a<0 ve b<0
		// else...
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1==0 || sayi2==0) {
			System.out.println("Sifir carpmaya gore yutan elemandir. ");
		} else if(sayi1>0 && sayi2>0) {
            System.out.println("Sayilarin toplami" + (sayi1+sayi2));
		} else if(sayi1<0 && sayi2<0){
			System.out.println("Sayilarin carpimi" + sayi1*sayi2);
		} else {
			System.out.println("Farkli isaretlerde sayilarla islem yapamzsin"); // iki durum vardýr;
			                                                                    // 1. sayi poz 2. sayi negatif
			                                                                    // 1. sayi neg 2. sayi poz
		}
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}
