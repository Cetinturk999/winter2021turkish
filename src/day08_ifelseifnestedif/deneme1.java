package day08_ifelseifnestedif;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		
		
		// KULLANICIDAN GUN ÝSMÝNÝ ÝSTEYÝN
		// girilen isim gecerli bir gun ise gun
		// isminin 1.,2. ve 3. harflerini ilk harf buyuk harf diger ikisi kucuk olarak yazdýrýn
		// gun ismi gecerli degilse  "gecerli gun ismi giriniz" yazdýrý

		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gun ismi giriniz");
		
		String gunIsmi=scan.nextLine();
		
		
		if (gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if(gunIsmi.equalsIgnoreCase("sali")){
			System.out.println("Sal");

		} else if(gunIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
			
		} else if(gunIsmi.equalsIgnoreCase("PERSEMBE")) {
			System.out.println("Per");
			
		} else if(gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		} else {
			System.out.println("Lutfen gecerli gun ismi giriniz");
		}
	
		
				
		scan.close();
		
		
		

		
	}

}
