package day07_ifstatements;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		
		// Kullanýcýdan yasini sorun
		// Yas 65 veya buyukse "emekli olabilirsin" yoksa "emekli olamazsýn" yazdýrýn

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsin");
			
		} else {
		    System.out.println("Emekli olamazsýn");
		}
			
	
        scan.close();		
	
		
	}

}
