package day19_doWhileLoop;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		
		// kullan�c�dan bir cumle al�n,
	    // while loop kullanarak
	    // cumlede buyuk harf var m� yok mu yazd�r�n

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaz�n�z");
		String cumle=scan.nextLine();
		
		int index=0;
		
		String flag= "kosul saglanm�yor";
		
		while (index<=cumle.length()-1) {
			
			if(cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag= "kosul saglan�yor";
			}
			
			
			index++;
		}
		
		System.out.println(flag);
		
	scan.close();	
		
	}

}
