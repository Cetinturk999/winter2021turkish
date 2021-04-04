package day18_whileLoop;

import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
		
		/* Soru 6 ) Kullanicidan pozitif bir tamsayi alin
		 * ve bu sayiyi tam bolen sayilari
		 * ve toplam kac tane  olduklarini ekranda yazdirin
		 */
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bölenleri bulmak icin pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();   // 100 girdi dersek
		int bolen=1;               // sayi%1==0 , sayi%2==0 .......
		int count=0;
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				
				System.out.println(bolen + " ");
				  count++;
		        }
			
			bolen++;
			
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
