package day06_ifstatements;

import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		
		// kullan�c�dan gun ismini isteyin
		// girilen gunun haftai�i veya haftasonu oldu�unu yazd�r�n
		
		Scanner scan= new Scanner(System.in);		
		System.out.println("Lutfen gun ismini giriniz");
		
		String gunAd�= scan.next().toLowerCase(); // gelen kelime ne olursa olsun tamam�n� kucuk harfe cevirir.
		                                          // TOLOWER kullan�ld�ysa asg�daki gunler kucuk yaz�lmal�
		if (gunAd�.equals("cumartesi") || gunAd�.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		
		if (gunAd�.equals("pazartesi") || gunAd�.equals("sali") || gunAd�.equals("carsamba") ||
				gunAd�.equals("persembe") || gunAd�.equals("cuma")){
			System.out.println("Haftaici");
		}
		
		scan.close();
		
		
		

	}

}
