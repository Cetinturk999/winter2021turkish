package day08_ifelseifnestedif;

import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
		
		/*Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
        Ilk harf A ise  “Gecerli Sifre” , degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol ediÝN.*/
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		if (ilkHarf>='A' && ilkHarf<='Z') {
			if (ilkHarf=='A') {
				System.out.println("gecerli sifre");
			} else {
                System.out.println("gecersiz sifre");
			}
			
			
		} else if(ilkHarf>='a' && ilkHarf<='z') {
			if (ilkHarf=='z') {
				System.out.println("gecerli sifre");
			} else {
				System.out.println("gecersiz sifre");
			}

		} else
		  System.out.println("Sifre gecersiz,lutfen ilk karakteri harf yapýnýz");
		
		
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
