package day18_whileLoop;

import java.util.Scanner;

public class C5_WhileLoop4 {

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
				count++;           // boleni bulunca count'ý 1 arttýrýyorum
				System.out.println(bolen);
			} 

			bolen++;
			
		}
		
		    System.out.println(sayi + " sayisinin bolenleri : " + count + " adettir");
		
		
		    /* bolenleri su sekilde yazdýrýn;
		      1-1
		      2-2
		      3-4
		      4-5
	          6-10 */
	         
	         bolen=1;   // var olan variableyi yeniden olusturamayýz ama yeniden deger atayabiliriz
	         count=0;
	         
	         while (bolen<=sayi) {
	        	 
	        	 if (sayi%bolen==0) {
	 				count++;         
	 				System.out.println(count + "- " + bolen);
	 			} 
	        	bolen++; 
	         }
		    
	         
	    scan.close();     
	         
   }

}