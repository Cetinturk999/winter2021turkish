package day13_stringmanipulations;

public class deneme8 {

	public static void main(String[] args) {
		
		/*
	    String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		String str1 = �$13.99�
		String str2 = �$10.55�
		ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

	    */
		
		
	  String str1="$13,99";
	  str1=str1.replaceAll("\\D", "");
	  System.out.println(str1);  // 1399
	  
	  String str2="$10,55";
	  str2=str2.replaceAll("\\D", "");
	  System.out.println(str2);  // 1055
	  
	  // int toplam=str1+str2; ==> i�eri�i say� olsada data olarak string'e atanm� old i�in kabul etmez
	                           // sayi g�r�n�ml� string 
	  
	  // str1 ve str2 iceri�i say� olan stringlerdir
	  // eger iceri�inin tamamen say� oldugunu bildi�miz
	  // string varsa parseDouble() veya parseInteger() methodu kullanabiliriz
	  // ancak primitive data tipleri methoda sahip olmad�klar�ndan wrapperclass kullan�lmal�
	  
	  System.out.println(str1+str2);
	  
	  double sayi1=Double.parseDouble(str1);  // string olan bir degeri double'a cevirdik
	  double sayi2=Double.parseDouble(str2);
	  
	  double toplam=(sayi1+sayi2)/100 ; // virgulleri yok etti�imi�z i�in yapt�k
		
	  System.out.println("$" + toplam);	 // 24,54
		
		
		
		
		
		
		

	}

}
