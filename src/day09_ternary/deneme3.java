package day09_ternary;

import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		
		//kullan�c�dan iki say� alin ve buyuk olan� yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen karsilastirmak icin iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>=sayi2 ? sayi1 : sayi2 );
		
		
		scan.close();
		
		
		
		
		

	}

}
