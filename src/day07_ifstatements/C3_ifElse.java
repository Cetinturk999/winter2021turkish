package day07_ifstatements;

import java.util.Scanner;

public class C3_ifElse {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir karakter girmesini isteyin
		// harf olup olmad���n� yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if ((karakter >='a' && karakter<='z') || (karakter >='A' && karakter<='Z')) {
			System.out.println("girdiginiz karakter harf");
		} else {
            System.out.println("girdiginiz harf karakter degil");
		} 
			// 'a'<=karakter<='z' bu karakterler dizisidir ve snuc t f vermez
		
		
		scan.close();
	
	}
}