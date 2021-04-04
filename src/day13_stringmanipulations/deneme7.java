package day13_stringmanipulations;

import java.util.Scanner;

public class deneme7 {

	public static void main(String[] args) {
		
		
		// kullanýcýdan 4 harfli bir kelime alýn
		// ve girilen kelimeyi tersten yazdýrý
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime giriniz");
		
		String str= scan.nextLine();
		
		if (str.length()!=4) {              // (str.length()<4 || str.length()>4)  böylede olur
			System.out.println("lutfen 4 karakterli bir kelime giriniz");
		} else {
            System.out.print(str.substring(3));
            System.out.print(str.substring(2, 3));
            System.out.print(str.substring(1, 2));
            System.out.print(str.substring(0, 1));
                  
		}
		
		// charAt ile yapýmý;
		
		if (str.length()!=4) {
			System.out.println("Lutfen 4 harfli bir kelime giriniz");
		} else {
            System.out.print(str.charAt(3));
            System.out.print(str.charAt(2));
            System.out.print(str.charAt(1));
            System.out.print(str.charAt(0));
            
		}
		
		
		

	}

}
