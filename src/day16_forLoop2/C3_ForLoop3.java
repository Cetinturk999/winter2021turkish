package day16_forLoop2;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		
		//kullan�c�dan pozitif bir tamsayi al�n
		// 1'den kullan�c�n�n girdi�i sayiya kadar olan,
		// tum tamsay�larin toplam�n� yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();   // 
		
		int toplam=0;
		
		for (int i = 1; i <= sayi; i++) {
			
			//toplam=toplam+i;  yerine		
		      toplam+=i;
		      //System.out.println(toplam);  ==> for loop un aras�na syso yazd�rd�g�m�zda islem herdongude tekrar tekrar yazd�r�r.
		}
		
		System.out.println(toplam);  //  ==> for loopun d�s�na yaz�lmal�
		
     scan.close();
		
		
	}

}
