package day06_ifstatements;

import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		
		// kullanýcýdan gun ismini isteyin
		// girilen gunun haftaiçi veya haftasonu olduðunu yazdýrýn
		
		Scanner scan= new Scanner(System.in);		
		System.out.println("Lutfen gun ismini giriniz");
		
		String gunAdý= scan.next().toLowerCase(); // gelen kelime ne olursa olsun tamamýný kucuk harfe cevirir.
		                                          // TOLOWER kullanýldýysa asgýdaki gunler kucuk yazýlmalý
		if (gunAdý.equals("cumartesi") || gunAdý.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		
		if (gunAdý.equals("pazartesi") || gunAdý.equals("sali") || gunAdý.equals("carsamba") ||
				gunAdý.equals("persembe") || gunAdý.equals("cuma")){
			System.out.println("Haftaici");
		}
		
		scan.close();
		
		
		

	}

}
