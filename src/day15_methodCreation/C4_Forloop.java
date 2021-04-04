package day15_methodCreation;

import java.util.Iterator;

public class C4_Forloop {

	public static void main(String[] args) {
	
		// 5 defa Hello World yazdýralým
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		// bunun yerine loop kullanýyoruz
		// Java'ya,ne yapacagýný ve kac kere yapacagýný söyluyoruz
		
		/* 
		   tum loop'larda 3 seyi yazmak zorundayýz
		   1) baslangýc degeri
		   2) bitis degeri
		   3) artis degeri
		*/
	
		
		for (int i=100 ; i>300 ; i-=5) {
			
			System.out.println("Hello World");
		}
		
		// NOT :eger sart kýsmý bizim sartýmýza göre  t verirse
		// NOT :sonsuz döngüye gider
        // NOT :loop ta artýþ degeri pztf old gibi negatifte de olabilir
		// NOT :artýs degeri 1 olamak zorunda degil farklý da olabilir
		// NOT : Eger loop un sartý hic true olmazsa loop body hic devreye girmez
		
	}

}
