package day19_doWhileLoop;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		
		// kullanýcýdan bir cumle alýn,
	    // while loop kullanarak
	    // cumlede buyuk harf var mý yok mu yazdýrýn

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle yazýnýz");
		String cumle=scan.nextLine();
		
		int index=0;
		
		String flag= "kosul saglanmýyor";
		
		while (index<=cumle.length()-1) {
			
			if(cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag= "kosul saglanýyor";
			}
			
			
			index++;
		}
		
		System.out.println(flag);
		
	scan.close();	
		
	}

}
