package day16_forLoop2;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		
		//kullanýcýdan pozitif bir tamsayi alýn
		// 1'den kullanýcýnýn girdiði sayiya kadar olan,
		// tum tamsayýlarin toplamýný yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();   // 
		
		int toplam=0;
		
		for (int i = 1; i <= sayi; i++) {
			
			//toplam=toplam+i;  yerine		
		      toplam+=i;
		      //System.out.println(toplam);  ==> for loop un arasýna syso yazdýrdýgýmýzda islem herdongude tekrar tekrar yazdýrýr.
		}
		
		System.out.println(toplam);  //  ==> for loopun dýsýna yazýlmalý
		
     scan.close();
		
		
	}

}
