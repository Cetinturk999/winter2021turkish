package day18_whileLoop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		
		/* Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
		 * ve baslangic harfinden baslayip bitis harfinde biten 
		 * tum harfleri buyuk harf olarak ekrana yazdirin.
		 * Kullanicinin hata yapmadigini farz edin.
		 */
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kelimenin ilk harfini yaz�n�z");
		char basHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen kelimenin son harfini yaz�n�z");
		
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		for (char i = basHarf; i <= sonHarf; i++) {
			System.out.print(i + " ");
		}
		
		
		// while loop ile c�z�m�;
		
		// baslang�z degeri var ; basHarf
		
		char ilkHarf = 0;
		while (ilkHarf<=sonHarf) {
			
			System.out.print(ilkHarf + " ");    
			ilkHarf++;
		}
		
		//  z ve a girilirse 
	}

}
