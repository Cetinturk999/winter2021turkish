package day10_switchcase;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		
		//Soru5 ) Kullanicidan bir sayi alin ve
		//sayi 3 basamakli pozitif ise “uc basamakli sayi”, 
		//yoksa  “Uc  basamakli degil” yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		// sayi>99 ? () : "sayi 3 basamakli degil"
		
		String sonuc = sayi>=100 ? (sayi<1000 ? "sayi 3 basamakli" : "3 basamakli degil") :"sayi 3 basamakli degil" ;
		System.out.println(sonuc);

		
   // nested ternary olmasýn
		
		String sonuc2 = sayi>=100 && sayi<1000 || sayi<=-100 && sayi>-1000? "3 basamakli" : "3 basamakli degil";
		System.out.println(sonuc2);
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
