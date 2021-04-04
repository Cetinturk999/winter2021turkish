package day16_forLoop2;


import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		
	   // kullanýcýdan pozitif bir tamsayi alýn
	   // 1'den kullanýcýnýn girdiði sayiya kadar olan,
	   // tum tamsayýlarin toplamýný yazdýrýn
				
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		int toplam=0;   // 0 cunku 0 top göre etkisiz eleman
		
		
		for (int i = 1; i >= sayi; i++) {
			
			toplam+=i;
			
		}
		
		
		System.out.println(toplam);
		
			
		
		scan.close();
		

	}

}
