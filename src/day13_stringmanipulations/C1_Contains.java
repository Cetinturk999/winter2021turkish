package day13_stringmanipulations;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		
		
		
		     // kullan�c�dan bir cumle ve aramak istedigi bir String isteyin
	         // cumle Strin'i iceriyorsa "basar�l�" degilse "Basar�s�z" yazd�r�n
				
				Scanner scan= new Scanner(System.in);
				
				/*
				 
				System.out.println("Lutfen cumle yaz�n�z");  // Java guzel
				
				String cumle=scan.nextLine().toLowerCase();
				System.out.println("Lutfen aramam� istediginiz String'i girin");
				
				String aranan=scan.nextLine().toLowerCase();  // java
				
				//   cumle.contains(aranan)     // bu islemin sunucu boolean ve bunu yaz�ya cevirmeliyiz
			                                    // ternary yada if'e olabilir
				
			
				System.out.println(cumle.contains(aranan) ? "Basarili" : "Basarisiz"); 
				                                                                        */
		        
				 // kullan�c�da mail adresi isteyin
				 // mail adresi @gmail iceriyorsa "Mailiniz kaydedildi"
				 // yoksa "Lutfen gmail adresinizi giriniz" yazd�r�n

				
				System.out.println("Lutfen mail'inizi giriniz");
				String email=scan.next();
				
				if (email.contains("@gmail.com" )) {                   // email gmail.com iceriyor mu
					System.out.println("Mailiniz kaydedildi");
				} else {
		            System.out.println("Lutfen mail adresinizi giriniz");
				}                   
				
				
				// eger @gmail.com'un en sonda oldugunu kontrol etmek istersek
				
				int sondami=email.indexOf("@gmail.com" , email.length()-10);  // index olarak lenfth()-10 yazarsak
				
				// eger email gmail.com ile bitiyorsa bu islemin sonucu index olur (int)
				//   "    "      "        " bitmiyorsa -1 verir
				
				
				if (email.contains("@gmail.com") && sondami !=-1) {
					System.out.println("mailiniz kaydedildi");
				} else {
					System.out.println("lutfen gecerli gmail adresinizi giriniz");
				}
				
				
				

				
			scan.close();	
					

	}

}
