package day09_ternary;

import java.util.Scanner;

public class C06_nestedTernary2 {

	public static void main(String[] args) {
		
		// Kullanicidan bir harf isteyin 
		// kucuk harf ise consola ?Kucuk Harf? 
		// buyuk harfse consola ?Buyuk Harf?
		// yoksa ?girdiginiz karakter harf degil? yazdirin.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		
		
		System.out.println((ilkHarf>='A' && ilkHarf<='Z') || (ilkHarf>='a' && ilkHarf<='z') ? 
				           (ilkHarf>='A' && ilkHarf<='Z' ? "buyuk harf" : "kucuk harf") :
				           "girdiginiz harf karakter degil");
		
		scan.close();
		
	}

}
