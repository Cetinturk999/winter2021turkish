package day19_doWhileLoop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		
		/*Kullanicidan toplamak uzere pozitif sayilar isteyin,
          islemi bitirmek icin 0’a basmasini soyleyin.
          Kullanici yanlislikla negative sayi girerse o sayiyi toplamaya eklemeyin
          ve “Negatif sayi giremezsiniz” yazdirip basa donun
          Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
          yanlislikla kac negative sayi girdigini  
          ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin. 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Oyuna hoþgeldiniz.Bitirmek istediðinizde 0'a basýnýz");
		
		
		int countPoz=0;   // poz sayilari sayacagiz
		int countNeg=0;    // neg sayilari saymak icin degisken olusturduk
		int toplamPoz=0;  // top bulmak için variable olusturduk
		int sayi=1;
		
		
		do {
			
			System.out.println("Lutfen pozitif bir sayi giriniz");
			sayi=scan.nextInt();
			
			if (sayi>0) {
				
				countPoz++;
				toplamPoz += sayi;
			}  
			
			if(sayi<0) {

				countNeg++;              // negatif sayi girince adedine 1 ekliyoruz
				System.out.println("Negatif sayi giremezsiniz");
				
					}
			
		} while(sayi !=0);    // 0!=0 --> f olunca   asgýya inip syso yu yazdýracak
		
		
		System.out.println("toplam " + countPoz + " pozitif sayi girdiniz") ;
		System.out.println("toplam " + countNeg + " negatif sayi girdiniz") ;
		System.out.println("Girdiginiz pozitif sayilarin toplami : " + toplamPoz);
		
		
		
		scan.close();
		
		
	}

}
