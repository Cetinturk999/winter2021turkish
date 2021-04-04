package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		
		// Verilen listeyi Array'e nasil ceviririz ?
    	
   	 /*Array : boyut say�s�n�n belli oldu�u ve de�erlerin �ok s�k de�i�tirilmedi�i durumlarda kullan�l�r. 
   	 * Daha sonradan boyutu de�i�tirilemiyor.
   	 * 
   	 ArrayList : Boyutu dinamik yani de�i�ken ve de�erlerin h�zl� de�i�mesi durumunda daha h�zl� �al���r.
   	 
   	   ArrayList ve array Aras�nda Se�im: Programc�, ne zaman ArrayList ve ne zaman array kullanmas� gerekti�i konusunda
   	  ikileme d��ebilir. E�er, depoya konulacak ��e say�s� belirli ve o say� s�k s�k de�i�meyecekse array se�imi uygun
   	   olur. Ama ��e say�s� ba�tan bilinemiyor ya da o say� s�k s�k de�i�iyorsa ArrayList do�ru bir se�imdir. 
   	   Tabii, buna ek olarak �unu s�ylemeliyiz: ArrayList nesnelerin depolanmas� i�indir. 
   	   �lkel veri tipleri depolamak i�in array se�ilmesi uygun olur.
   	    B�t�n bunlar�n �tesinde ArrayList s�n�f� List aray�z�n�n metotlar�n� kullanma yetene�ine sahiptir; 
   	    dolay�s�yla array yap�s�na oranla programc�ya daha �ok kolayl�k sa�lar.
   	 */
   	
       List<String> list=new ArrayList<>();
       list.add("Ali");
       list.add("Veli");
       
       String arr[]= list.toArray(new String[0]);
       
       System.out.println(Arrays.toString(arr));
       
	
	}

}
