package day25_arrays;

import java.util.Arrays;

public class Arrays03_StrArrayaCevirme {

	public static void main(String[] args) {
		
      // verilen bir String'i ARRAY'a nasýl çeviririz;
		
	  // verilen bir cumlede kac kelime oldugunu bulunuz;
	  //    "     "      "   her kelimenin ilk harfini buyuk yapýnýz
		
		
	   String str = "Herkes Java'yý tanýsa severdi";
	   // bu String 'i kelimelere ayýralým
	   
	   // SPLÝT (bolme/ayýrma) METHODU
	   
	   String arr[] = str.split(" ");   // String'i Array'a cevirdik
	   
	   System.out.println(Arrays.toString(arr));  // array duzgun yazdýrmak icin her kelimeden sonra bosluk býrakýr
	                                              // split ayýrmak icin kullandýgýmýz karakterleri siler ve kendi koyar
	   
	   String arr2[]= str.split("Java");
	   System.out.println(Arrays.toString(arr2));  // Java yý bulacak ve oldurecek Herkes , yý tanýsa severdi yazdýracak
	   
	   String arr3[]=str.split("a");
	   System.out.println(Arrays.toString(arr3));
	   
	   String arr4[]=str.split("");                // "" hiçlik girdik
	   System.out.println(Arrays.toString(arr4));  // hiçlik leri yok ettik
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
