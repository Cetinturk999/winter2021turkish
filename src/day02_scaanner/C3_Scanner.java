package day02_scaanner;

import java.util.Scanner;

public class C3_Scanner {

	public static void main(String[] args) {
		
		// kullan�c�dan ismini ve soyismini alarak aralar�nda bo�luk b�rakarak isim ve soyismini yazd�r�n
		//Rumeysa , �etint�rk = Rumeysa �etint�rk
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen isminizi giriniz");
		
		String name=scan.nextLine();    // sadece next se�ilirse kullan�c� birden fazla kelime girsede ilk kelimeyi al�r
		                                // e�er kullan�c�dan girdi�i t�m yaz�y� almak isterse nextline se�ilmeli
		
		System.out.println("l�tfen soyisminizi giriniz");  // " " sabit bir yaz� old i�in " kullan�l�r.variable de�il
 	
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname);  // name ve surname sabt de�il bir variable dir." i�ine alm�yoruz.
		                                           // " i�ine alm�� olsayd�k yani "name" yaz�lsayd� �al��t�r�ld���nda name ��kard�
	
		scan.close();
		
	}
	

}
