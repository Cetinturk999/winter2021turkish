package day18_whileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class dnm4 {

	public static void main(String[] args) {
		
		/* Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
		 * ve baslangic harfinden baslayip bitis harfinde biten 
		 * tum harfleri buyuk harf olarak ekrana yazdirin.
		 * Kullanicinin hata yapmadigini farz edin.
		 */
    	   
      
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangýc harfini giriniz");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Bitis harfini giriniz");
		char sonHarf = scan.next().toUpperCase().charAt(0);
		
		
		/*while(ilkHarf<=sonHarf) {
			System.out.print(ilkHarf + " ");
			ilkHarf++;
		}
		*/
		
		for (int i = ilkHarf; i<=sonHarf; i++) {
			System.out.print(i + " ");
		
		}
		
		
	}

}
