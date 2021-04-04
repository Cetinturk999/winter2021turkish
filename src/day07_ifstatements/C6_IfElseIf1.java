package day07_ifstatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		
		// Kullanicidan 100 uzerinden notunu isteyin.
		// Not�u harf sistemine cevirip yazdirin.
		// 50�den kucukse �D�, 50-60 arasi �C�, 
		// 60-80 arasi �B�, 80�nin uzerinde ise �A� 
		

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen notunuzu sayi olarak giriniz");
		
		double not=scan.nextDouble();    // �grenciler notu virgullu de girebilir
                                         // bu yuzden int degil double ald�k
		 
		
		if (not<0 || not>100) {    // istenmeyen durum
           System.out.println("Lutfen gecerli bir not giriniz");	
          
		} else if (not<50){         // notumuz; 0<= not <=100
           System.out.println("Notunuz D");
           
		} else if (not<60){         // not 50 ile 100 aras�ndad�r   not>=50 && not<60'yaz�labilir ama yukar�da eledim gerek yok
			System.out.println("Notunuz C");
			
		} else if(not<80) {         // not 60 ile 100 aras�ndad�r
			System.out.println("Notunuz B");
			
		} else {                    // not 80 ile 100 aras�nda
			System.out.println("Notunuz A");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
