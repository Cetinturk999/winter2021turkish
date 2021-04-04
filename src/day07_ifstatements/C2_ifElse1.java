package day07_ifstatements;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		// KullanýcýdAN DÝKDORGENÝN KENAR UZUNLUKLARINI isteyiniz
		// Uzunluklar esit ise "Kare",deðilse "Kare Degil" yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dikdortgenin kenar uzunluklarýný giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Kare");
		} else {
			System.out.println("Kare degil");
		}
		
		scan.close();
		
	

		}
		
	}