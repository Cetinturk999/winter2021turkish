package day19_doWhileLoop;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		
		// kullan�c�dan bir c�mle ve bir harf isteyin
		// while loop kullanarak cumlede istenen harf 
		// kac kere kullan�lm�� bulunuz
		// program Case Sensitive olsun
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen saymak istedi�iniz harfi giriniz");
		String harf=scan.nextLine().substring(0, 1);  // harf yerine �rne�in kelime yazarsa ilk harfini almas� i�in (0,1)
		// char harf2= scan.next().charAt(0);

		int count=0;
		
		int index=0;
		
		while (index<cumle.length()) {             // cumlede butun indexlere bak�p son harfte bitmesini istiyoruz
			if (cumle.substring(index, index+1).equals(harf)) {// ali ata bak
				count++; 
			}
			   
			index++;
		}
		
		 System.out.println("cumlede " + harf + " harfi " + count + " defa kullan�lm��");
		
		
		
		
	} 
}
