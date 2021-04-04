package day15_methodCreation;

import java.util.Scanner;

public class C1_MethodCreation {

	public static void main(String[] args) {
		
		
   /*Soru 1 ) Kullanicidan bir sayi alin.
	 Bu sayinin negatif veya pozitif oldugunu,
	 tek mi cift mi oldugunu ve
	 3 basamaklý veya buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
	 100’den kucukse sadece 1’ler basamagini yazdýrýn
   */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi= scan.nextInt();
		
		pozitifNegatif(sayi);        // girilen sayi argümentinin pozitif yada negatif
		tekmiCiftmi(sayi);           // oldugunu yazdýrsýn. bu method coll
		                             // method olust icin mainin dýsýna gitmeliyiz
		
		// 100 den buyuk kucuk burada ayýrmalýyýz
		
		if (sayi>100) {
			
			yuzdenBuyuk(sayi);
			
		} else {
            yuzdenKucuk(sayi);
		}
		
		
		
		scan.close();
		
		
		
			}

	
	public static void yuzdenKucuk(int sayi) {
		System.out.println(sayi%10);
	}


	public static void yuzdenBuyuk(int sayi) {   // 523
		int rakamlarToplami=0;
		int rakamlarToplamý=sayi%10;      // 3 u elde ettik
		sayi/=10;                          // 52
		rakamlarToplami+=sayi%10;          // 2 yi elde ettik
		sayi/=10;                          
		rakamlarToplami+=sayi%10;
		System.out.println(rakamlarToplami);
	}


	public static void tekmiCiftmi(int sayi) {
		
		if (sayi%2==0) {
			System.out.println("sayi cift");
		} else {
            System.out.println("sayi tek");
		}
		
		
		
		
		
		
		
		
	}


	public static void pozitifNegatif(int sayi) {  // parametre yazarken data tipini de yazmalýyýz
		
	//	System.out.println(sayi>0 ? "pozitif" : "negatif");    // o yazýnca negatif dedi ve ternary ise yaramadý
		
		System.out.println(sayi>0 ? "pozitif" : (sayi<0 ? "negatif" : "nötr"));   // nested ternary cozumu
		
		
	
		
	
		
		
	}
	
	
	
	
	
}
