package day10_switchcase;

import java.util.Scanner;

public class C5_switchCase3 {

	public static void main(String[] args) {
		// Kullan�c�dan yaz�yla hangi g�nde oldugunu isteyin
        // girilen gunun hafta ici veya hafta sonu oldugunu yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen hangi gunde oldugunuzu yaz�n�z");
		
		
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
			System.out.println("L�tfen tekrar giriniz");
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


