package day19_doWhileLoop;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		
		// kullanýcýdan bir cümle ve bir harf isteyin
		// while loop kullanarak cumlede istenen harf 
		// kac kere kullanýlmýþ bulunuz
		// program Case Sensitive olsun
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen saymak istediðiniz harfi giriniz");
		String harf=scan.nextLine().substring(0, 1);  // harf yerine örneðin kelime yazarsa ilk harfini almasý için (0,1)
		// char harf2= scan.next().charAt(0);

		int count=0;
		
		int index=0;
		
		while (index<cumle.length()) {             // cumlede butun indexlere bakýp son harfte bitmesini istiyoruz
			if (cumle.substring(index, index+1).equals(harf)) {// ali ata bak
				count++; 
			}
			   
			index++;
		}
		
		 System.out.println("cumlede " + harf + " harfi " + count + " defa kullanýlmýþ");
		
		
		
		
	} 
}
