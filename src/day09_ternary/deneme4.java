package day09_ternary;

import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		
		//  Soru2 ) Kullanicidan bir tamsayi alin ve 
		//  sayinin tek veya cift oldugunu yazdirin
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		 // sayi%2==0 ? "cift sayi" : "tek sayi"
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		
		// girilrn sayinin mutlak degerini yazd�r�n
		
		
	    // sayi>0 ? sayi : -sayi
		// "sayinin mutlak degeri : " + (sayi>0 ? sayi: -sayi)
		
		System.out.println("sayinin mutlak degeri : " + (sayi>0 ? sayi : -sayi));
		
		
		
		scan.close();
		
		
		
		


	}

}
