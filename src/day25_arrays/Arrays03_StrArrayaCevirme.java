package day25_arrays;

import java.util.Arrays;

public class Arrays03_StrArrayaCevirme {

	public static void main(String[] args) {
		
      // verilen bir String'i ARRAY'a nas�l �eviririz;
		
	  // verilen bir cumlede kac kelime oldugunu bulunuz;
	  //    "     "      "   her kelimenin ilk harfini buyuk yap�n�z
		
		
	   String str = "Herkes Java'y� tan�sa severdi";
	   // bu String 'i kelimelere ay�ral�m
	   
	   // SPL�T (bolme/ay�rma) METHODU
	   
	   String arr[] = str.split(" ");   // String'i Array'a cevirdik
	   
	   System.out.println(Arrays.toString(arr));  // array duzgun yazd�rmak icin her kelimeden sonra bosluk b�rak�r
	                                              // split ay�rmak icin kulland�g�m�z karakterleri siler ve kendi koyar
	   
	   String arr2[]= str.split("Java");
	   System.out.println(Arrays.toString(arr2));  // Java y� bulacak ve oldurecek Herkes , y� tan�sa severdi yazd�racak
	   
	   String arr3[]=str.split("a");
	   System.out.println(Arrays.toString(arr3));
	   
	   String arr4[]=str.split("");                // "" hi�lik girdik
	   System.out.println(Arrays.toString(arr4));  // hi�lik leri yok ettik
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
