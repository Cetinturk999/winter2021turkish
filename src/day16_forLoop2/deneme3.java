package day16_forLoop2;


import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		
	   // kullan�c�dan pozitif bir tamsayi al�n
	   // 1'den kullan�c�n�n girdi�i sayiya kadar olan,
	   // tum tamsay�larin toplam�n� yazd�r�n
				
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		int toplam=0;   // 0 cunku 0 top g�re etkisiz eleman
		
		
		for (int i = 1; i >= sayi; i++) {
			
			toplam+=i;
			
		}
		
		
		System.out.println(toplam);
		
			
		
		scan.close();
		

	}

}
