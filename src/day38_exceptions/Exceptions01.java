package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
	 // kullanýcýdan 2 tamsayialin ve bolumlerini yazdýrýn
		
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("Lutfen bolunecek tamsayiyi yazin");
	int sayi1=scan.nextInt();
	System.out.println("Lutfen kaca bolmek istediginizi yazýn");
	int sayi2=scan.nextInt();	
	// Java exception'ý handle etmek icin cry-catch(yakalamak) blogu olusturmus
	
		
	try {
	  System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);	
	} catch (ArithmeticException e) {
		System.out.println("sayiyi sifira bolemezsin");
	}
		
	
		
		
		
		
	}

}
