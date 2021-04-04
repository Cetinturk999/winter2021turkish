package day18_whileLoop;

import java.util.Scanner;

public class dnm5 {

	public static void main(String[] args) {
		
		/* Soru 6 ) Kullanicidan pozitif bir tamsayi alin
		 * ve bu sayiyi tam bolen sayilari
		 * ve toplam kac tane  olduklarini ekranda yazdirin
		 */

        Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		
		int sayi= scan.nextInt();
		int bolen=1;
		int count=0;
		
		
		int bolen2= -1;
        int count2=0;
		while (bolen2>=-sayi) {
			if(sayi%bolen2==0) {
				System.out.print(bolen2 + " ");
				count2++;
			}
			bolen2--;
		}
		System.out.println(" Bolen sayisi : " + count2);
		
		
		
		while(sayi>=bolen) {
			if(sayi%bolen==0) {
				System.out.print(bolen+ " ");
				count++;
			}
			bolen++;
		}  
		 System.out.print(" Bolen sayisi : " + count);
		
		
	}

}
