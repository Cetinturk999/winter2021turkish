package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		
	  // kULLANÝCÝDAN GUN ÝSMÝNÝN ÝLK HARFÝNÝ ÝSTEYÝN
	  // ve harfe uygun olan gun isimlerini yazdýrýn
	  // c.... cumartesi	
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen gun isminin ilk harini yazýnýz");
		
	    char ilkHarf=scan.next().toUpperCase().charAt(0);
	    
	    // bu satir itibariyle girilen String'in ilk karakterini almýþ olduk
	    
	    // p , s , c 
	    
	    if (ilkHarf=='p' || ilkHarf=='P') {
	    	System.out.println("pazar,pazartesi veya persembe");
	    }
		
	    if (ilkHarf=='s' || ilkHarf=='S') {
	    	System.out.println("carsamba,cuma veya cumartesi");
	    }
		
		if (ilkHarf=='c'  || ilkHarf=='C') {
			System.out.println("carsamba,cuma veya cumartesi");
		}
		
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && 
				ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C') {
			System.out.println("Lutfen gecerli bir harf yaziniz");
		}
		
		
		
		scan.close();
		
		
	}

}
