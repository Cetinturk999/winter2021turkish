package day08_ifelseifnestedif;

import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		
		// Kullanicidan artik yil olup olmadigini kontrol 									
	 	// etmek icin yil girmesini isteyin.
					
		// Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		// Kural 2: 4’un kati olmasina ragmen 100 ile

		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		
		
		int yil= scan.nextInt();
		
		if (yil%4==0 && yil%100 != 0) {
			System.out.println("artýk yil");
		} else if(yil%4==0 && yil%100==0 && yil%400==0) {
            System.out.println("Artýk yil");
		} else {
			System.out.println("Artik yil degil");
		}
		
		
	scan.close();
		
		
		
		         
		
		
		
		
		
		
		
		
		
	}

}
