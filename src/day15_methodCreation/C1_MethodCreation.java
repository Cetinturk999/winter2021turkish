package day15_methodCreation;

import java.util.Scanner;

public class C1_MethodCreation {

	public static void main(String[] args) {
		
		
   /*Soru 1 ) Kullanicidan bir sayi alin.
	 Bu sayinin negatif veya pozitif oldugunu,
	 tek mi cift mi oldugunu ve
	 3 basamakl� veya buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
	 100�den kucukse sadece 1�ler basamagini yazd�r�n
   */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi= scan.nextInt();
		
		pozitifNegatif(sayi);        // girilen sayi arg�mentinin pozitif yada negatif
		tekmiCiftmi(sayi);           // oldugunu yazd�rs�n. bu method coll
		                             // method olust icin mainin d�s�na gitmeliyiz
		
		// 100 den buyuk kucuk burada ay�rmal�y�z
		
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
		int rakamlarToplam�=sayi%10;      // 3 u elde ettik
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


	public static void pozitifNegatif(int sayi) {  // parametre yazarken data tipini de yazmal�y�z
		
	//	System.out.println(sayi>0 ? "pozitif" : "negatif");    // o yaz�nca negatif dedi ve ternary ise yaramad�
		
		System.out.println(sayi>0 ? "pozitif" : (sayi<0 ? "negatif" : "n�tr"));   // nested ternary cozumu
		
		
	
		
	
		
		
	}
	
	
	
	
	
}
