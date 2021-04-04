package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
    List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);   // [Ali, Can, Ayse, Fatma]
		
		// SET : �stenen idex'teki eleman� kald�r�r yerine bizim istedi�imiz eleman� koyar Replace eder. 
		
		list.set(2, "Kemal");
		System.out.println(list);   // [Ali, Can, Kemal, Fatma]
		
		list.set(0, "Semih");
		System.out.println(list);   // [Semih, Can, Kemal, Fatma]
		
		// list.set(4, "Mustafa");  olmayan bir index kullan�l�rsa RTE verir.
		
		// add ekliyor, set ise degistiriyor replace yap�yor
		
		list.add(2, "Yasin");
		System.out.println(list);    // [Semih, Can, Yasin, Kemal, Fatma]
		list.add(5, "Hurriyet");
		System.out.println(list);    // [Semih, Can, Yasin, Kemal, Fatma, Hurriyet]
		
		// list.add(10, "Sefer");
		// System.out.println(list);  size'dan buyuk index kabul etmez Except�on verir.
		
		System.out.println(list.contains("Hurriyet"));   // TRUE
		System.out.println(list.contains("Mehmet"));     // false
		list.contains("Cemal");      //  bize boolean bir sonu� verir liste degi�mez
		
		// List'in elemanlar�n� s�ralay�n�z
		// array'lerde arrays class'�ndan yard�m al�yorduk
		
		Collections.sort(list);
		System.out.println(list);    //  [Can, Fatma, Hurriyet, Kemal, Semih, Yasin]
		
	}

}
