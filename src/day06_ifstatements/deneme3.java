package day06_ifstatements;

import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		 
		 // kULLAN�C�DAN GUN �SM�N�N �LK HARF�N� �STEY�N
		 // ve harfe uygun olan gun isimlerini yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gun isminin ilk harfini giriniz");

		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
	    // bu satir itibariyle girilen stringin ilk karakterini alm�s olduk
		// p,s,c
		
	    if (ilkHarf=='p' || ilkHarf== 'P') {
	    	System.out.println("pazar,pazartesi veya pesembe");
	    }
		
		if (ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
	
		if(ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("carsamba,cuma veya cumartesi");
		}
		
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S' &&
				ilkHarf!='c' && ilkHarf!='C') {
			System.out.println("Lutfen gecerli bir harf yaziniz");
		}
		
		scan.close();
		
	}
	

}
