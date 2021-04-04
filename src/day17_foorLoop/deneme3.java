package day17_foorLoop;

import java.util.Scanner;

public class deneme3 {

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
			System.out.println("Gecerli bir sayi yazýn");
		} else {
			faktoriyel(sayi);
			
		}
		
		
		
		
	
	}

	public static void faktoriyel(int sayi) {
		
		int toplam = 1;
		for (int i = 1; i <=sayi; i++) {
			toplam*=i;
			// syso yu icine yazdýrsaydým her topladýgý deger icin sonuc ekranýna yazdýrýr. 5 yazarsak;   1 2 6 24 120
			}
		
		System.out.println(toplam);   // 5 yazarsak; sadece sonucu verir  120
	}

}
