package day07_ifstatements;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir tamsayi isteyin
		// Sayi pozitif ise "Sayi pozitif" yazd�r�n
		// Sayi 100'den k���k ise "Kucuk sayi" yazd�r�n
		// Sayi 1000'den buyukse "Buyuk sayi yazd�r�n"

		
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
