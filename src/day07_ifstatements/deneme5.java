package day07_ifstatements;

import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
		
		// kullan�c�dan �cgenin kenar uzunluklar�n� al�n
		// uc kenar esitse "eskenar" yazd�r�n
		// yoksa "eskenar degil" yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklar�n� giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eskenar");
		} else {
            System.out.println("Eskenar degil");
		}
		
		
		scan.close();
		
		
	

	}

}
