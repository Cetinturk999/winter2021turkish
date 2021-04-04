package day15_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
		/*  Kullaniciya kac sayi toplamak istedigini sorun.
		 *  Kullanici 2,3 veya 4 degerini girerse, 
		 *  kullanicidan bu sayilari girmesini isteyin
		 *  ve sayilarin toplamini yazdirin.
		 *  Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		 *  “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 *  2'den kucuk bir sayi girerse en az 2 sayi girmelisin
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kac sayi toplamak istediginizigirniz");
		
		int adet=scan.nextInt();
		
	
        if (adet<2) {
			System.out.println("En az iki sayi girmelisiniz");
		} else if(adet==2) {
 
			ikisayiTopla();
			
		} else if(adet==3) {
			
			ucsayiTopla();
			
		} else if(adet==4) {
			
			dortsayiTopla();
			
		} else {
			System.out.println("Cok sayi girdiniz, toplayamam");
		}
		
		
		scan.close();
		
		
		
		

	}

	public static void dortsayiTopla() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 4 sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.println("4 sayinin toplami : " +(sayi1+sayi2+sayi3+sayi4));
		scan.close();
		
	}

	public static void ucsayiTopla() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 3 sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		System.out.println("3 sayinin toplami : " + (sayi1+sayi2+sayi3));
		scan.close();
		
	}

	public static void ikisayiTopla() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 2 sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("2 sayinin toplami : " + (sayi1+sayi2));
		scan.close();
		
	}

}
