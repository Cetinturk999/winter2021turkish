package day06_ifstatements;

import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
		
		// kullan�c�dan bir dikdortgenin iki kenar uzunlugunu al�n
		// kenar uzunluklar� esitse kare ,degilse dikdortgen yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu giriniz");
				
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Kare");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikdortgen");
		}
		
		if (kenar1<=0 || kenar2>=0) {
			System.out.println("Lutfen gecerli uzunluk giriniz");
		}
		
		
		
		scan.close();
		
		// bug : yaz�l�mdaki hatalara denir.
		
	}

}
