package day13_stringmanipulations;

import java.util.Scanner;

public class deneme7 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan 4 harfli bir kelime al�n
		// ve girilen kelimeyi tersten yazd�r�
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime giriniz");
		
		String str= scan.nextLine();
		
		if (str.length()!=4) {              // (str.length()<4 || str.length()>4)  b�ylede olur
			System.out.println("lutfen 4 karakterli bir kelime giriniz");
		} else {
            System.out.print(str.substring(3));
            System.out.print(str.substring(2, 3));
            System.out.print(str.substring(1, 2));
            System.out.print(str.substring(0, 1));
                  
		}
		
		// charAt ile yap�m�;
		
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
