package day06_ifstatements;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		
		// kullanýcýdan bir sayý isteyin
		// sayýnýn tek veya cift sayý old yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Girdiginiz sayi cift sayidir");
		}
		
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("Girdiginiz sayi tek sayidir");
		}
	
		System.out.println(sayi%2);
	    System.out.println("Katildiginiz icin tesekkur edriz");
		
		
		scan.close();

	}

}
