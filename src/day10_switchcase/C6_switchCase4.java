package day10_switchcase;

import java.util.Scanner;

public class C6_switchCase4 {

	public static void main(String[] args) {
		
		// kullanýcdan VIP kýsaltmasýnDA hangi harfin anlamýný istediðini soralým
		// girilen harfin acýklamasýný yazdýralým
		
		// VIP very ýmportant person
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen harf giriniz");
		
		char harf=scan.next().charAt(0);  // scan.next  => ilk kelimeyi alýr
		                                  // .charAt(0) => alýnan kelimenin ilk harfini alýr
		                                  // vali=> v , ÝNEK=> Ý , pembe cicek => pembe => p
		                                 
		switch (harf) {                   // pembe cicek => p => (switch case) person yazar
		case 'V' :
		case 'v' :
		     System.out.println("very");
		     break;
		case 'I' : 
		case 'i' :
		     System.out.println("important");
		     break;
		case 'P' :
		case 'p' :
		     System.out.println("person");
		     break;
		default:
			System.out.println("gecersiz harf");
			
		}
		
	// Kullanýcýnýn birden fazla harf girmesini sorun olarak kabul ediyorsanýz ,
	// ve bunu hata olarak kullanýcýya bildirmek istiyorsanýz ;
		
		System.out.println("Lutfen harf giriniz");
		String str = scan.next();
		
		switch (str) {                         // vali yazýlýnca => kod gecersiz kelime yazar
		case "V" :                             
		case "v" :
		     System.out.println("very");
		     break;
		case "I" : 
		case "i" :
		     System.out.println("important");  // ÝNEK yazýlýnca =>          "
		     break;
		case "P" :
		case "p" :
		     System.out.println("person");     // pempe CÝCEK    =>           "
		     break;
		default:
			System.out.println("gecersiz harf");
		}
		
    scan.close();		
		
		
	}
}

