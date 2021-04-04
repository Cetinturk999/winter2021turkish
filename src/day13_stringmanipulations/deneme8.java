package day13_stringmanipulations;

public class deneme8 {

	public static void main(String[] args) {
		
		/*
	    String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		String str1 = “$13.99”
		String str2 = “$10.55”
		ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

	    */
		
		
	  String str1="$13,99";
	  str1=str1.replaceAll("\\D", "");
	  System.out.println(str1);  // 1399
	  
	  String str2="$10,55";
	  str2=str2.replaceAll("\\D", "");
	  System.out.println(str2);  // 1055
	  
	  // int toplam=str1+str2; ==> içeriði sayý olsada data olarak string'e atanmý old için kabul etmez
	                           // sayi görünümlü string 
	  
	  // str1 ve str2 iceriði sayý olan stringlerdir
	  // eger iceriðinin tamamen sayý oldugunu bildiðmiz
	  // string varsa parseDouble() veya parseInteger() methodu kullanabiliriz
	  // ancak primitive data tipleri methoda sahip olmadýklarýndan wrapperclass kullanýlmalý
	  
	  System.out.println(str1+str2);
	  
	  double sayi1=Double.parseDouble(str1);  // string olan bir degeri double'a cevirdik
	  double sayi2=Double.parseDouble(str2);
	  
	  double toplam=(sayi1+sayi2)/100 ; // virgulleri yok ettiðimiþz için yaptýk
		
	  System.out.println("$" + toplam);	 // 24,54
		
		
		
		
		
		
		

	}

}
