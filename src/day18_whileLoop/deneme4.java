package day18_whileLoop;

import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		
		/* Soru 6 ) Kullanicidan pozitif bir tamsayi alin
		 * ve bu sayiyi tam bolen sayilari
		 * ve toplam kac tane  olduklarini ekranda yazdirin
		 */
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bolenleri bulmak icin pozitif bir tamsayi giriniz");
		int sayi = scan.nextInt();
		
		// for loop ile cözumu
		
		// 20 ; 1,2,4,5,10 // 
		/*
		int count=0;
		
		for (int bolen = 1; bolen <= sayi; bolen++) {
			if (sayi%bolen==0) {
				count++;
				System.out.print(bolen + " ");
			}
		}
		System.out.println("");
		System.out.println(count);
		*/
		
		// while loop
		
		/*
		int bolen = 1;
		int count=0;
		while(bolen<=sayi) {
			if (sayi%bolen==0) {
				count++;
				System.out.print(bolen + " ");
			}
			bolen++;
		}
		System.out.println("");
		System.out.println(count);
		*/
		
		int bolen = 1;
		int count=0;
		
		do {
					if (sayi%bolen==0) {
						count++;
						System.out.print(bolen + " ");
					}
					
					bolen++;
					
					
				} while (bolen!=sayi+1);
		System.out.println("");
		System.out.println(count);
		
		// do while loop ta while içine ne olmasýný istiyorsak onu yazýyoruz.
		// bu soruda while icine; sayi nin bölene esit olmamasýný istedik

	}

}
