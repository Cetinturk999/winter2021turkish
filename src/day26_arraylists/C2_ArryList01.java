package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C2_ArryList01 {

	public static void main(String[] args) {
		
		// bir ArrayList nas�l olusturulur?
		// ArrayList non primitive data tipidir ve bir objedir.
		// dolay�s�yla yeni bir tane olusturmak i�in 
		// new keyword kullanmal�y�z
		
		// 1. YOL :
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		// 2.YOL : 
		
		ArrayList<String> list2 = new ArrayList<>();

		
		// 3. YOL : en cok kullan�l�r
		
		// sol taraf declaration, ad� list3 olan String bir list olusturuyoruz
		// sag taraf deger ve bunun icin consructor kullanmal�y�z
		
		List<String> list3 = new ArrayList<>();
		
		// NOT : eger constructor olarak List<>() kullan�l�rsa; CTE verir.
		// List<>() constructor olarak kullan�lamaz.
		
		// List<String> list4 = new List<>();
		
		// Classimin ismini List yaparsak hi�bir methodu kullanamay�z.
		// olusturdugumuz class isimleri Javada kullan�lan obje isimleriyle ayn� olmamal�d�r.
		
         
		
		// List'e ELEMAN EKLEME ;
		// List olustururken otomatik olarak eleman ekleme �z yoktur
		// elemanlar�n tek tek eklenmesi gerekir
		
		list3.add("Ali");
		list3.add("Veli");
	    list3.add("Ayse");
		
		// List nas�l yazd�r�l�r
	    
	    System.out.println(list3);  // [Ali, Veli, Ayse]
		
		list3.add(1, "Can");        // 1. index'e istenen degeri ekler.
	    System.out.println(list3);  //  [Ali, Can, Veli, Ayse]
	    
	    list3.add(1, "Fatma");      // Fatma'y� Alinin yan�na yazd�r�r.Can geride kald�
	    System.out.println(list3);  // [Ali, Fatma, Can, Veli, Ayse]
	    
	    
	    
	    
	    /* SORU 6) Verilen bir Array�den istenen degere esit olan elamanlari kaldirip,
		 *  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		 */
		
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
	    int sayi=5;
	    
	    List<Integer> �stenenList = new ArrayList<>();  // int'�n wrapper class'�n� yazd�k.
	    
	    for (int i = 0; i < arr.length; i++) {
			if ( arr[i]!=sayi) {
				�stenenList.add(i);
			}
		}
	    
	    System.out.println(�stenenList);  // [0, 1, 3, 4, 5, 6, 7, 8]
	    
	    
	}

}
