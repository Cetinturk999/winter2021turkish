package day02_scaanner;

import java.util.Scanner;

public class C3_Scanner {

	public static void main(String[] args) {
		
		// kullanýcýdan ismini ve soyismini alarak aralarýnda boþluk býrakarak isim ve soyismini yazdýrýn
		//Rumeysa , Çetintürk = Rumeysa Çetintürk
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen isminizi giriniz");
		
		String name=scan.nextLine();    // sadece next seçilirse kullanýcý birden fazla kelime girsede ilk kelimeyi alýr
		                                // eðer kullanýcýdan girdiði tüm yazýyý almak isterse nextline seçilmeli
		
		System.out.println("lütfen soyisminizi giriniz");  // " " sabit bir yazý old için " kullanýlýr.variable deðil
 	
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname);  // name ve surname sabt deðil bir variable dir." içine almýyoruz.
		                                           // " içine almýþ olsaydýk yani "name" yazýlsaydý çalýþtýrýldýðýnda name çýkardý
	
		scan.close();
		
	}
	

}
