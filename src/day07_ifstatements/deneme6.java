package day07_ifstatements;

import java.util.Scanner;

public class deneme6 {

	public static void main(String[] args) {
		
		// Kullanicidan 100 uzerinden notunu isteyin. 
		// Not’u harf sistemine cevirip yazdirin.
		// 50’den kucukse “D”, 50-60 arasi “C”,
        // 60-80 arasi “B”, 80’nin uzerinde ise “A” 
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen notunuzu sayý olarak giriniz");
		
		double not=scan.nextDouble();        // ögrenciler notu virgullu de girebilir
		                                     // bu yuzden int degil double aldýk
		
		if (not<0 || not>100) {                // istenmeyen durum
			System.out.println("Lutfen gecerli bir not giriniz");
			
		} else if (not<50) {
			System.out.println("Notunuz : D");
        } else if (not<60) {
			System.out.println("Notunuz : C");
		} else if (not<80) {
			System.out.println("Notunuz : B");
		} else{
            System.out.println("Notunuz : A");
		} {

		} 

		
     scan.close();
		}

}
