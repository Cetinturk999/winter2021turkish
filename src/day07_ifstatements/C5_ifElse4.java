package day07_ifstatements;

import java.util.Scanner;

public class C5_ifElse4 {

	public static void main(String[] args) {
		
		// kullanýcýdan ücgenin kenar uzunluklarýný alýn
		// uc kenar esitse "eskenar" yazdýrýn
		// yoksa "eskenar degil" yazdýrýn
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarýný giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar");
		} else {
            System.out.println("eskenar degil");
		}
		
		
		scan.close();
	
		
	}

}
