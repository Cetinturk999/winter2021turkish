package day19_doWhileLoop;

import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		
		/*Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi toplamaya eklemeyin
        ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini  
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin. 
		 */
		
		// kac negatif girdi
		// kac tane poz girdiði ve pozitif tolamýný
		// negati girerse uyar
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif tamsayilar giriniz.Bitirmek istediðinizde 0 tusuna basýnýz");
		
		int countPoz=0;
		int countNeg=0;
		int toplamPoz=0;
		
		int sayi=0;
		
		
		do {
			System.out.println("Lutfen pozitif sayi giriniz");
			sayi=scan.nextInt();
			if (sayi<0) {
				System.out.println("negatif sayi giremezsiniz");
				countNeg++;
			}
			
			if (sayi>0) {
				countPoz++;
				toplamPoz++;  // toplam = toplam + sayi;
				
			}
			
		} while (sayi!=0);
		
		
		
		System.out.println("Toplam" + countPoz + "adet pozitif sayi girdiniz");
		System.out.println("Toplam" + countNeg + "adet negatif sayi girdiniz");
		System.out.println("girdiginiz poz sayilar toplami " + toplamPoz);
		
		
		
	scan.close();	
		
		
		
	}

}
