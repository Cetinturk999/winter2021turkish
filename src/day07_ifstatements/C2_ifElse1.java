package day07_ifstatements;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		// Kullan�c�dAN D�KDORGEN�N KENAR UZUNLUKLARINI isteyiniz
		// Uzunluklar esit ise "Kare",de�ilse "Kare Degil" yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dikdortgenin kenar uzunluklar�n� giriniz");
		
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