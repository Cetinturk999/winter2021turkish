package day17_foorLoop;

import java.util.Scanner;

public class C5return {

	 
		
		public static void main(String[] args) {
			// kullanicidan 35 dan kücük pozitif bir sayi alin
			// girilen sayinin faktöriyelini hesaplayip yazdiran bir method olusturun
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Lütfen faktöriyelini istediginiz 35'ten kücük pozitif bir tam sayi giriniz");
			int sayi=scan.nextInt();
			
			if (sayi>0 && sayi<35) {
				System.out.println(faktöriyelSonuc(sayi));
			} else {
				System.out.println("Lütfen gecerli bir sayi giriniz");
			}
				
			scan.close();
		}
										
		public static int faktöriyelSonuc(int sayi) {
			
			int faktöriyelSonuc=1;
			
			for (int i=1; i<=sayi; i++) {
				faktöriyelSonuc=faktöriyelSonuc*i;   
			}
			
			return faktöriyelSonuc;
	}

}
