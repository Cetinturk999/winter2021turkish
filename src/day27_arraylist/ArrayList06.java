package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		
		// Verilen listeyi Array'e nasil ceviririz ?
    	
   	 /*Array : boyut sayýsýnýn belli olduðu ve deðerlerin çok sýk deðiþtirilmediði durumlarda kullanýlýr. 
   	 * Daha sonradan boyutu deðiþtirilemiyor.
   	 * 
   	 ArrayList : Boyutu dinamik yani deðiþken ve deðerlerin hýzlý deðiþmesi durumunda daha hýzlý çalýþýr.
   	 
   	   ArrayList ve array Arasýnda Seçim: Programcý, ne zaman ArrayList ve ne zaman array kullanmasý gerektiði konusunda
   	  ikileme düþebilir. Eðer, depoya konulacak öðe sayýsý belirli ve o sayý sýk sýk deðiþmeyecekse array seçimi uygun
   	   olur. Ama öðe sayýsý baþtan bilinemiyor ya da o sayý sýk sýk deðiþiyorsa ArrayList doðru bir seçimdir. 
   	   Tabii, buna ek olarak þunu söylemeliyiz: ArrayList nesnelerin depolanmasý içindir. 
   	   Ýlkel veri tipleri depolamak için array seçilmesi uygun olur.
   	    Bütün bunlarýn ötesinde ArrayList sýnýfý List arayüzünün metotlarýný kullanma yeteneðine sahiptir; 
   	    dolayýsýyla array yapýsýna oranla programcýya daha çok kolaylýk saðlar.
   	 */
   	
       List<String> list=new ArrayList<>();
       list.add("Ali");
       list.add("Veli");
       
       String arr[]= list.toArray(new String[0]);
       
       System.out.println(Arrays.toString(arr));
       
	
	}

}
