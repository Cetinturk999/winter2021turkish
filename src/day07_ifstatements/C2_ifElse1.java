package day07_ifstatements;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		// KullanıcıdAN DİKDORGENİN KENAR UZUNLUKLARINI isteyiniz
		// Uzunluklar esit ise "Kare",değilse "Kare Degil" yazdırın
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dikdortgenin kenar uzunluklarını giriniz");
		
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