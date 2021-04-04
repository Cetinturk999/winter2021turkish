package day13_stringmanipulations;

public class C8_Examples2 {

	public static void main(String[] args) {
		
		/*
		    String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
			String str1 = �$13.99�
			String str2 = �$10.55�
			ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

		 */
		
		
		
		String str1="$13,99";                 // dolar isaretinden kal�c� kurtulmak istiyoruz
		str1=str1.replaceAll("\\D", "");      // kal�c� olarak bir String'e atad�k
		System.out.println(str1);
		
		String str2="$10,55";
		str2=str2.replaceAll("\\D", "");
		System.out.println(str2);
		
		//str1 ve str2 icerigi sayi olan String'lerdir.
		// Eger iceriginin tamamen sayi oladugunu bildigimiz String varsa
		// parseDouble() veya parseInteger() methodu kullanabiliriz
		// ancak primitive data tipleri method'a sahip olmadiklarindan wrapper class kullanmam lazim
		
		
		System.out.println(str1+str2);
		
		double sayi1= Double.parseDouble(str1);   // string olan bir degeri double'a cevirdik
		double sayi2= Double.parseDouble(str2);
		
		double toplam=(sayi1+sayi2)/100;    // virgulleri yok etti�imi�z i�in yapt�k
		
		System.out.println("$" +toplam);  // 24.54
		
		
		
		
		
		
		
		

	}

}