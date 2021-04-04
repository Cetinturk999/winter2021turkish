package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_ifelseifnestedif {

	public static void main(String[] args) {
		
		
		// KULLANICIDAN GUN ÝSMÝNÝ ÝSTEYÝN
		// girilen isim gecerli bir gun ise gun
		// isminin 1.,2. ve 3. harflerini ilk harf buyuk diger ikisi kucuk olarak yazdýrýn
		// gun ismi gecerli degilse  "gecerli gun ismi giriniz" yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini girin");
		
        String gunÝsmi = scan.nextLine(); // girilen tüm yazýyý kucuk harfe cevirdik
        
        // next() : sadece ilk kelimeyi alýr.(ilk space'e kadar olan kýsmý alýr
        // nextLine () : o satýrýn tamamýný alýr
        
        if(gunÝsmi.equalsIgnoreCase("pazar") || gunÝsmi.equalsIgnoreCase("pazartesi") ) {
        	System.out.println("Paz");
       } else if (gunÝsmi.equalsIgnoreCase("Sali")) {
    	   System.out.println("Sal");
       } else if (gunÝsmi.equalsIgnoreCase("CARSAMBA")) {
    	   System.out.println("Car");
       } else if (gunÝsmi.equalsIgnoreCase("persembe")) {
    	   System.out.println("Per");
       } else if (gunÝsmi.equalsIgnoreCase("cuma") || gunÝsmi.equalsIgnoreCase("cumartesi")) {
    	   System.out.println("Cum");
       } else {
    	   System.out.println("Lutfen gecerli gun ismi giriniz");
       }
       		
       	// equalsIgnorecase() : methodu iki string'in buyuk, kucuk harf hassasiyeti olmadan
        // esit olup olmadýgýný kontrol eder.
		
		
		scan.close();
		
		
	}

}
