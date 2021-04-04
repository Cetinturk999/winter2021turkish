package day10_switchcase;

import java.util.Scanner;

public class C5_switchCase3 {

	public static void main(String[] args) {
		// Kullanýcýdan yazýyla hangi günde oldugunu isteyin
        // girilen gunun hafta ici veya hafta sonu oldugunu yazdýrýn
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen hangi gunde oldugunuzu yazýnýz");
		
		
		String gun=scan.next().toLowerCase();
		
		
	 
   /*    switch (gun) {
	   case "pazartesi" :
			System.out.println("Hafta ici");
			break;
	   case "sali" :
			System.out.println("Hafta ici");
			break;	
		case "carsamba" :
			System.out.println("Hafta ici");
			break;
		case "persembe" :
			System.out.println("Hafta ici");
			break;
		case "cuma" :
			System.out.println("Hafta ici");
			break;
		case "cumartesi" :
			System.out.println("Hafta sonu");
			break;
		case "pazar" :
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Lütfen tekrar giriniz");
			break;   */
		
			
		switch (gun) {
		case "pazartesi":	
		case "sali":	
		case "carsamba":	
		case "persembe":
		case "cuma":
			System.out.println("Hafta ici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Lutfen gecerli bir gun giriniz");
			
			
	
			scan.close();
			
		}
			
			
			
			
			
		}
		
				
 }


