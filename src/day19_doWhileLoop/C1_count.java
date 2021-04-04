package day19_doWhileLoop;

import java.util.Scanner;

public class C1_count {

	public static void main(String[] args) {
		
		// kullan�c�dan bir c�mle ve bir harf isteyin
		// while loop kullanarak cumlede istenen harf 
		// kac kere kullan�lm�� bulunuz
		// program Case Sensitive olsun
		
		
		// bir seyi 1234 die sayd�rmak istiyorsak count kullanabiliriz
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen saymak istedi�iniz harfi giriniz");
		String harf=scan.next().substring(0, 1);
		// scan kelimeyi, substring string olarak ilk harfi al�r
		
		// ali okula git 0 dan baslar lenght(-1) e kadar gider
		
		int count=0;
		
		int index=0;
		
		while(index<cumle.length()) {     // <= kullansayd�k lenght()-1 yazard�k
			
			if (cumle.substring(index, index+1).equals(harf)) {  // index 01 12 23 .. diye alcak
				
				// cumlede ki ilk harfi ald�k  //  0  1 -> a== a ? -> count+++
				
				count++;
				
			}
			index++;   // if'in icine yazmad�k yazarsak ve if cal�smaz ise sonsuzluk olur 
			           //     yazmazsak sonsuzluk olur
		}
		    System.out.println("cumlede " + harf + " harfi " + count + " defa kullan�lm��");
		
		
		
		scan.close();
		
	}

}
