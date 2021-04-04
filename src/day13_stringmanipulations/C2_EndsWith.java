package day13_stringmanipulations;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		
		
		
	
		String str="Java'yla hayat ne guzel";
		System.out.println(str.endsWith("zel"));       // t
		System.out.println(str.endsWith("zel "));      // f
		System.out.println(str.endsWith("ne guzel"));  // t
		
		// Kullanýcýdan bi email isteyin
		// eger @ isareti icermiyorsa "Girdiginiz bilgi email  degil"
		// eger @  "     iceriyor ama @gmail.com icermiyorsa "Lutfen gmail adresi yazin"
		// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir email giriniz");
		
		String email=scan.next();
		
		if (!email.contains("@")) {         // email @ isareti iceriyor mu. basýnda ! olunca -> email @ isareti icermiyorsa
			System.out.println("Girdiginiz bilgi email  degil");
			
		} else if(!email.contains("@gmail.com")) {        
            System.out.println("Lutfen gmail adresi yazin");
            
		} else if(!email.endsWith("@gmail.com")){
			System.out.println("Gecersiz gmail adresi");
			
		} else {
			System.out.println("Email'iniz basarýyla kaydedildi");
		}
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}
