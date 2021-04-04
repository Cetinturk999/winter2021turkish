package day10_switchcase;

import java.util.Scanner;

public class C2_ternaryTekrar2 {

	public static void main(String[] args) {
		
		// kullanýcýdan bir sayi alin
		// sayi cift ise cift yazdýrýn
		// degilse sayinin karesini yazdýrýn
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi=scan.nextInt(); // double alamayýz cunku virgullu sayýlara % kullanamayýz.
		                         // % 'sý String lerde kullanýrýz
		
		// eger ternary'de iki durum icin farklý data tipleri donusu oluyorsa
		// ya variable'a atama yapmadan direk yaxdýrýnýz
		// ya da mumkunse sonuclarý ayný data tipine cevirmeye calisiriz
		
		String sonuc = sayi%2==0 ? "cift sayi" : sayi*sayi+"";
		System.out.println(sonuc);

	scan.close();	
		
		
		
	}

}
