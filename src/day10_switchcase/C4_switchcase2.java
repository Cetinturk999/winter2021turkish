package day10_switchcase;

import java.util.Scanner;

public class C4_switchcase2 {

	public static void main(String[] args) {
		
		// kullanýcýdan kacýncý ayda oldugunu alýn
		// ve ay ismini yadýrýn
		
	Scanner scan= new Scanner(System.in);
	System.out.println("Lutfen kacýncý ayda oldugunuzu giriniz");
	
	int ay=scan.nextInt();
	
	switch (ay) {
	case 1 :
	    System.out.println("ocak");
	    break;
	case 2 :
	    System.out.println("subat");
	    break;
	case 3 :
	    System.out.println("mart");
	    break;
	case 4 :
	    System.out.println("nisan");
	    break;
	case 5 :
	    System.out.println("mayýs");
	    break;
	case 6 :
	    System.out.println("haziran");
	    break;
	case 7 :
	    System.out.println("temmuz");
	    break;
	case 8 :
	    System.out.println("agustos");
	    break;
	case 9:
		System.out.println("Eylul");
		break;
    case 10:
		System.out.println("Ekim");			
		break;
	case 11:
		System.out.println("Kasim");
		break;
	case 12:
		System.out.println("Aralik");
		break;
		default:
			System.out.println("Gecerli bir ay no giriniz:");
		}    
	    
	    
	    
	    scan.close();
	    
	}	
		
		
}


