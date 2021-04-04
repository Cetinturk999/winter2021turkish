package day19_doWhileLoop;

import java.util.Scanner;

public class C1_count {

	public static void main(String[] args) {
		
		// kullanýcýdan bir cümle ve bir harf isteyin
		// while loop kullanarak cumlede istenen harf 
		// kac kere kullanýlmýþ bulunuz
		// program Case Sensitive olsun
		
		
		// bir seyi 1234 die saydýrmak istiyorsak count kullanabiliriz
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen saymak istediðiniz harfi giriniz");
		String harf=scan.next().substring(0, 1);
		// scan kelimeyi, substring string olarak ilk harfi alýr
		
		// ali okula git 0 dan baslar lenght(-1) e kadar gider
		
		int count=0;
		
		int index=0;
		
		while(index<cumle.length()) {     // <= kullansaydýk lenght()-1 yazardýk
			
			if (cumle.substring(index, index+1).equals(harf)) {  // index 01 12 23 .. diye alcak
				
				// cumlede ki ilk harfi aldýk  //  0  1 -> a== a ? -> count+++
				
				count++;
				
			}
			index++;   // if'in icine yazmadýk yazarsak ve if calýsmaz ise sonsuzluk olur 
			           //     yazmazsak sonsuzluk olur
		}
		    System.out.println("cumlede " + harf + " harfi " + count + " defa kullanýlmýþ");
		
		
		
		scan.close();
		
	}

}
