package day07_ifstatements;

import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir karakter girmesini isteyin
		// harf olup olmadığını yazdırın
		
	   Scanner scan= new Scanner(System.in);
	   System.out.println("Lutfen bir karakter giriniz");
		
		char karakter= scan.next().charAt(0);            // *yada tuLowerCase gelecek
		
	   if ((karakter >='a' && karakter<='z') || (karakter >='A' && karakter <='Z')) {             // *YA SART DEGİSECEK
		System.out.println("Girdiginiz karakter harf");
	} else {
        System.out.println("Girdiginiz karakter harf degil");
	}
		
		
		scan.close();
		

	}

}
