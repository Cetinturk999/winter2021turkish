package day15_methodCreation;

import java.util.Iterator;

public class C4_Forloop {

	public static void main(String[] args) {
	
		// 5 defa Hello World yazd�ral�m
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		// bunun yerine loop kullan�yoruz
		// Java'ya,ne yapacag�n� ve kac kere yapacag�n� s�yluyoruz
		
		/* 
		   tum loop'larda 3 seyi yazmak zorunday�z
		   1) baslang�c degeri
		   2) bitis degeri
		   3) artis degeri
		*/
	
		
		for (int i=100 ; i>300 ; i-=5) {
			
			System.out.println("Hello World");
		}
		
		// NOT :eger sart k�sm� bizim sart�m�za g�re  t verirse
		// NOT :sonsuz d�ng�ye gider
        // NOT :loop ta art�� degeri pztf old gibi negatifte de olabilir
		// NOT :art�s degeri 1 olamak zorunda degil farkl� da olabilir
		// NOT : Eger loop un sart� hic true olmazsa loop body hic devreye girmez
		
	}

}
