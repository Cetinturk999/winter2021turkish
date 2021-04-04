package day09_ternary;

import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		
		//kullanýcýdan iki sayý alin ve buyuk olaný yazdýrýn
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen karsilastirmak icin iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>=sayi2 ? sayi1 : sayi2 );
		
		
		scan.close();
		
		
		
		
		

	}

}
