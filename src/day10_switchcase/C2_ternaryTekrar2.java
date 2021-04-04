package day10_switchcase;

import java.util.Scanner;

public class C2_ternaryTekrar2 {

	public static void main(String[] args) {
		
		// kullan�c�dan bir sayi alin
		// sayi cift ise cift yazd�r�n
		// degilse sayinin karesini yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi=scan.nextInt(); // double alamay�z cunku virgullu say�lara % kullanamay�z.
		                         // % 's� String lerde kullan�r�z
		
		// eger ternary'de iki durum icin farkl� data tipleri donusu oluyorsa
		// ya variable'a atama yapmadan direk yaxd�r�n�z
		// ya da mumkunse sonuclar� ayn� data tipine cevirmeye calisiriz
		
		String sonuc = sayi%2==0 ? "cift sayi" : sayi*sayi+"";
		System.out.println(sonuc);

	scan.close();	
		
		
		
	}

}
