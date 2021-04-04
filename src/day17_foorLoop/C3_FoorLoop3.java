package day17_foorLoop;

import java.util.Scanner;



public class C3_FoorLoop3 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 40'tan kucuk pozitif bir sayi alin girilen sayinin faktoryelini
		 * hesaplayip yazdiran bir method olusturun 6 ! = 1 * 2 * 3 * 4 * 5 *6 = 720
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen faktoriyel hesaplamak için 40'tan kucuk pozitif bir tamsayý giriniz");

		int sayi = scan.nextInt();

		if (sayi<=0 || sayi>=40) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		} else {
            faktoriyelBul(sayi);  
		} 

		scan.close();
		
	}

	public static void faktoriyelBul(int sayi) {
         long faktoriyel=1;
         
		for (long i = 1; i <=sayi; i++) {  // long yerine int yazýlabilir
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
		
		
		
		
	}

}
