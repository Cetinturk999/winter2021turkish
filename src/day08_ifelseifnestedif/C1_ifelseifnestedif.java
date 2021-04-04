package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_ifelseifnestedif {

	public static void main(String[] args) {
		
		
		// KULLANICIDAN GUN �SM�N� �STEY�N
		// girilen isim gecerli bir gun ise gun
		// isminin 1.,2. ve 3. harflerini ilk harf buyuk diger ikisi kucuk olarak yazd�r�n
		// gun ismi gecerli degilse  "gecerli gun ismi giriniz" yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini girin");
		
        String gun�smi = scan.nextLine(); // girilen t�m yaz�y� kucuk harfe cevirdik
        
        // next() : sadece ilk kelimeyi al�r.(ilk space'e kadar olan k�sm� al�r
        // nextLine () : o sat�r�n tamam�n� al�r
        
        if(gun�smi.equalsIgnoreCase("pazar") || gun�smi.equalsIgnoreCase("pazartesi") ) {
        	System.out.println("Paz");
       } else if (gun�smi.equalsIgnoreCase("Sali")) {
    	   System.out.println("Sal");
       } else if (gun�smi.equalsIgnoreCase("CARSAMBA")) {
    	   System.out.println("Car");
       } else if (gun�smi.equalsIgnoreCase("persembe")) {
    	   System.out.println("Per");
       } else if (gun�smi.equalsIgnoreCase("cuma") || gun�smi.equalsIgnoreCase("cumartesi")) {
    	   System.out.println("Cum");
       } else {
    	   System.out.println("Lutfen gecerli gun ismi giriniz");
       }
       		
       	// equalsIgnorecase() : methodu iki string'in buyuk, kucuk harf hassasiyeti olmadan
        // esit olup olmad�g�n� kontrol eder.
		
		
		scan.close();
		
		
	}

}
