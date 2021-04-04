package day07_ifstatements;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir tamsayi isteyin
		// Sayi pozitif ise "Sayi pozitif" yazdýrýn
		// Sayi 100'den küçük ise "Kucuk sayi" yazdýrýn
		// Sayi 1000'den buyukse "Buyuk sayi yazdýrýn"

		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi= scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Sayi pozitif");
		}
		
		if (sayi<100) {
			System.out.println("Kucuk sayi");
		}
		
		if (sayi>1000) {
			System.out.println("Buyuk sayi");
		}
		
		
			
		scan.close();
		

	}

}
