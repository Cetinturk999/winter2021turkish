package day19_doWhileLoop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullan�c�dan bir cumle al�n,
		// while loop kullanarak
		// cumlede buyuk harf var m� yok mu yazd�r�n

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaz�n�z");
		String cumle=scan.nextLine();
		
		int index=0;
	
		while (index<cumle.length()) {
			if (cumle.charAt(index)>'A' && cumle.charAt(index)>'Z') {	
			}
			index++;
		}
		
		System.out.println("girdiginiz cumlede");
		
		// flag da iki durum var 
		
		
		
		scan.close();
		
	}

}
