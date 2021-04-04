package day16_forLoop2;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		
		// kullanicidan 2 tamsayi alin
		// ilk sayidan, ikinci sayiya kadar tum tamsayilari
		// yanyana aralarinda bosluk olarak yazdirin
		

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen iki tamsayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (sayi1>sayi2 ) {
			for (int i = sayi1; i > sayi2; i--) {   // buyuk sayı kucuk sayıya giderken azalarak gider
				System.out.print(i + " ");		
			}
	    } else {   // sayi1<=sayi2 old calisir
            for (int i= sayi1; i <= sayi2; i++) {
				
           // 10 10 girild calısmıyor sor???
            	
           scan.close(); 	
            	
			}
		}
		
		
	}

}
