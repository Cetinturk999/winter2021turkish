package day07_ifstatements;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		
		// Kullan�c�dan yasini sorun
		// Yas 65 veya buyukse "emekli olabilirsin" yoksa "emekli olamazs�n" yazd�r�n

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsin");
			
		} else {
		    System.out.println("Emekli olamazs�n");
		}
			
	
        scan.close();		
	
		
	}

}
