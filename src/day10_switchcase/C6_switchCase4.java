package day10_switchcase;

import java.util.Scanner;

public class C6_switchCase4 {

	public static void main(String[] args) {
		
		// kullan�cdan VIP k�saltmas�nDA hangi harfin anlam�n� istedi�ini soral�m
		// girilen harfin ac�klamas�n� yazd�ral�m
		
		// VIP very �mportant person
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen harf giriniz");
		
		char harf=scan.next().charAt(0);  // scan.next  => ilk kelimeyi al�r
		                                  // .charAt(0) => al�nan kelimenin ilk harfini al�r
		                                  // vali=> v , �NEK=> � , pembe cicek => pembe => p
		                                 
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
		
	// Kullan�c�n�n birden fazla harf girmesini sorun olarak kabul ediyorsan�z ,
	// ve bunu hata olarak kullan�c�ya bildirmek istiyorsan�z ;
		
		System.out.println("Lutfen harf giriniz");
		String str = scan.next();
		
		switch (str) {                         // vali yaz�l�nca => kod gecersiz kelime yazar
		case "V" :                             
		case "v" :
		     System.out.println("very");
		     break;
		case "I" : 
		case "i" :
		     System.out.println("important");  // �NEK yaz�l�nca =>          "
		     break;
		case "P" :
		case "p" :
		     System.out.println("person");     // pempe C�CEK    =>           "
		     break;
		default:
			System.out.println("gecersiz harf");
		}
		
    scan.close();		
		
		
	}
}

