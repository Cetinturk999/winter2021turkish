package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		
		Integer arr [] = {10,12,35,60,40}; // Neden List'e ceviriyoruz ? Cunku bazi methodlari kullanabilmek icin .
		// Gecis yapmak esneklik kazandirmiyor . Cunku List'e cevrilince Java bizi kisitliyor.
		// basina int degil Integer yazdim cunku elmas(<>) icinin ayni olmasi icin
		
		String arr9 [] = {"a"}; 
		
		List<String> listArr9 = new ArrayList<>(); // Yeni bir array list // 2 tane Array;     Array     ArrayList==List
		
		
		List<Integer> listArr = Arrays.asList(arr); // Wrapper Class Integer olacak . int ile Integer birbirinden farkli o yuzden Integer olacak
		System.out.println(listArr); // Cunku List<Integer> listArr yazarken Integer yazmak zorunlu o yuzden usttekini de Integer yapiyorum.
		
		// new demedim cunku var olan Array'i ListArray'e ceviriyorum.
		
		
		
		// verilen bir Array'i list'e nas�l ceviririz?
		// ne isimize yarar ; baz� (list) method lar� kullanabiliriz
		
		
		String arr2[] = {"Ali","Veli"};
		
		List<String> listArr2 = Arrays.asList(arr2);
		
		System.out.println(listArr2);   // [Ali, Veli]
		
		
		Integer arr1[]= {1,2,3};
		
		List<Integer> list2 = Arrays.asList(arr1);
		
		System.out.println(list2);      // [1, 2, 3]
		
		
		// Bazen cok fazla eleman� olan bir liste olusturmam�z gerekir
		// Bu durumda liste elemanlar�n� tek tek eklemek yerine
		// elemanlar� bir Arr'ye ekler sonrada Array'i list'e cevirebiliriz.
		// �rn : bir web sitesindeki tum urunleri listeye eklemek istediginizde
		
		// Ancak bu method'la Arry'den cevirdi�imiz list esnek olmaz yani Array �zelliklerini tas�r.
		// add(),remove(),clear() gibi uzunlugu etkileyen methodlar kullan�lamaz.
		
		// �rne�in;
		// listArr2.clear();
		// System.out.println(listarr2);   
		
		// Java bu degisimdeki Array ve List'i senkronize eder.Birinde yapt�g�m�z
		// degisiklik otomatik olarak digerinide update eder.
		
		// arr1 array ve list2 listesi senkron cal�s�r.
		// birinde yapt�g�m�z degisiklik digerinede islenir.
		
		arr1[1] =5;
		
		System.out.println(Arrays.toString(arr1));   // [1, 5, 3]
		System.out.println("list2 : " + list2);      // list2 : [1, 5, 3]
		
		list2.set(2, 13);
		System.out.println("list2 : " + list2);      // list2 : [1, 5, 13]
		System.out.println("array : " + Arrays.toString(arr1));   // array : [1, 5, 13]
		
	
		
		
		
	}

}
