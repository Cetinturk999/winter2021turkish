package day13_stringmanipulations;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		// ReplaceAll= hepsini replace ettirmek
		
		
		String str="Java ogren, mutlu ol, Java candir 12345";
		
		System.out.println(str.replace("Java", "hava"));
		
		// ReplaceAll() method'u Replace method'una benzr ama iki fark� vard�r;
		// 1) Replace method'u CHAR kabul eder ama ReplaceAll kabul etmez
		// 2) replaceAll method'u regexp kullan�m�na izin verir.
		
		
		System.out.println(str.replaceAll("\\w", "*")); // tum harf ve rakamlar yerine y�ld�z yazacak
		                                                // bosluk virguller kal�r
		
		System.out.println(str.replaceAll("\\W", "*")); // kucuk w'nun tersi
		
		System.out.println(str.replaceAll("\\d", ".")); // sayilari . yapar
		
		System.out.println(str.replaceAll("\\D", ".")); // sayi olmayanlari . 
		
		System.out.println(str.replaceAll("\\s", "&")); // bosluklari & yapar
		
		System.out.println(str.replaceAll("\\S", "&")); // bosluk olmayan
		
		System.out.println(str.replaceAll("\\d", ""));    // say�lari siler
		
	}

}
