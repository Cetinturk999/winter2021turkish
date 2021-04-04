package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		
		// List'in UZUNLUGU Nas�l Bulunur?

		List<Integer> list = new ArrayList<>();
		
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list);              // [10, 15, 8, 12, 20]
		
		System.out.println(list.size());       // 5
		
		// list.size listenin uzunlugunu verir
		
		// Bir Eleman Nas�l S�L�N�R;
		
		list.remove(1);   
		System.out.println(list);               // [10, 8, 12, 20]
		
		System.out.println(list.remove(2));     // git 12'yi kald�r! dedik,bize 12'yi d�nd�r�r
		 
		// remove(index) kulland�g�m�zda o index teki eleman� remove eder ve
		// bunun delili olarak bize o eleman� getirir.
		// eger olmayan bir index girersek RTE verir.
		
		System.out.println(list);               // [10, 8, 20]
		
		//System.out.println(list.remove(5));   // git 5'i kald�r! dedik, RTE verdi
	
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan")); // git hasan'i kaldir dedik bulamadigi icin FALSE dondurur
		System.out.println(list2);                 // [Ali]
		
		// remove(Object) method'u kullanildiginda eger Java istenen elemani bulup remove ederse 
		// bize true dondurur, listede bulamazsa istegin yerine 
		// getirilemedigini anlamamiz icin false dondurur
		
		
		System.out.println(list2.remove("Ali"));  // TRUE
		
		
		
		
	}

}
