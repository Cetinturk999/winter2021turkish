package day12_stringmanupalation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		
		// kullanýcýdan bir cumle alýn
		// ve asagýdaki uc durumdan uygun olaný yazdýrýn
		// 1- cumle java icermiyor
		// 2-cumle bir tane java iceriyor
		// 3-cumlede birden fazla java var
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle yazýnýz");
		
		
		String cumle = scan.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java");       // -1 yada ilk java'nin index'ini
		int sonJava=cumle.lastIndexOf("java");   // -1 yada son java'nin index'ini
		
		if (ilkJava==-1) {
			System.out.println("cumle java icermiyor");
		} else if(ilkJava==sonJava){
            System.out.println("cumle 1 java kelimesi iceriyor");
		} else {
			System.out.println("cumle 1'den fazla java iceriyor");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
