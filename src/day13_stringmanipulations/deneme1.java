package day13_stringmanipulations;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan bir cumle ve aramak istedigi bir String isteyin
        // cumle Strin'i iceriyorsa "basar�l�" degilse "Basar�s�z" yazd�r�n
		
			Scanner scan= new Scanner(System.in);
			
		/*	
		    System.out.println("Lutfen bir cumle yaz�n�z");
		    String cumle=scan.nextLine().toLowerCase();
		    
		    System.out.println("Lutfen aramam� istediginiz kelimeyi giriniz");
            String aranan=scan.nextLine().toLowerCase();
		
		// cumle.contains(aranan)
		
           
		    System.out.println(cumle.contains(aranan) ? "basarili" : "basarisiz");
		                                                                             */
		
		 // kullan�c�da mail adresi isteyin
		 // mail adresi @gmail iceriyorsa "Mailiniz kaydedildi"
		 // yoksa "Lutfen gmail adresinizi giriniz" yazd�r�n
		
		
		
		
		System.out.println("Lutfen mail adresinizi giriniz");
		
		String mail=scan.next();
		
		int sondami=mail.indexOf("@gmail.com",mail.length()-10);
				
		if (mail.contains("@gmail.com") && sondami!=-1) {
			System.out.println("Mailin�z kaydedildi");
		} else {
            System.out.println("Lutfen gecerli gmail adresinizi giriniz");
		}
	
		
		
		// eger @gmail.com'un en sonda oldugunu kontrol etmek istersek;
		
	
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
                                                                       	

	}

	}
