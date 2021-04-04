package day17_foorLoop;

import java.util.Scanner;

public class C4_NestedFoorLoop {

	public static void main(String[] args) {
		
     /*   Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
      *                      
           *                  
           * *               
           * * *               
           * * * *	           
      */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 10'dan kucuk poztif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		 
		for (int i = 1; i <=sayi; i++) {
			System.out.println(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				
				
				
				/* for (int i = 1; i <=sayi; i++)  yazsaydýk alt alta 5 yýldýz koyardý
				   System.out.println(" ");
				*/


				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
	
	}

}
