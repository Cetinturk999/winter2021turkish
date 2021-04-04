package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C2_ArryList01 {

	public static void main(String[] args) {
		
		// bir ArrayList nasýl olusturulur?
		// ArrayList non primitive data tipidir ve bir objedir.
		// dolayýsýyla yeni bir tane olusturmak için 
		// new keyword kullanmalýyýz
		
		// 1. YOL :
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		// 2.YOL : 
		
		ArrayList<String> list2 = new ArrayList<>();

		
		// 3. YOL : en cok kullanýlýr
		
		// sol taraf declaration, adý list3 olan String bir list olusturuyoruz
		// sag taraf deger ve bunun icin consructor kullanmalýyýz
		
		List<String> list3 = new ArrayList<>();
		
		// NOT : eger constructor olarak List<>() kullanýlýrsa; CTE verir.
		// List<>() constructor olarak kullanýlamaz.
		
		// List<String> list4 = new List<>();
		
		// Classimin ismini List yaparsak hiçbir methodu kullanamayýz.
		// olusturdugumuz class isimleri Javada kullanýlan obje isimleriyle ayný olmamalýdýr.
		
         
		
		// List'e ELEMAN EKLEME ;
		// List olustururken otomatik olarak eleman ekleme öz yoktur
		// elemanlarýn tek tek eklenmesi gerekir
		
		list3.add("Ali");
		list3.add("Veli");
	    list3.add("Ayse");
		
		// List nasýl yazdýrýlýr
	    
	    System.out.println(list3);  // [Ali, Veli, Ayse]
		
		list3.add(1, "Can");        // 1. index'e istenen degeri ekler.
	    System.out.println(list3);  //  [Ali, Can, Veli, Ayse]
	    
	    list3.add(1, "Fatma");      // Fatma'yý Alinin yanýna yazdýrýr.Can geride kaldý
	    System.out.println(list3);  // [Ali, Fatma, Can, Veli, Ayse]
	    
	    
	    
	    
	    /* SORU 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
		 *  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		 */
		
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
	    int sayi=5;
	    
	    List<Integer> ÝstenenList = new ArrayList<>();  // int'ýn wrapper class'ýný yazdýk.
	    
	    for (int i = 0; i < arr.length; i++) {
			if ( arr[i]!=sayi) {
				ÝstenenList.add(i);
			}
		}
	    
	    System.out.println(ÝstenenList);  // [0, 1, 3, 4, 5, 6, 7, 8]
	    
	    
	}

}
