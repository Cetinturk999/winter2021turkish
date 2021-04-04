package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class deneme3 {

	public static void main(String[] args) {
		
		// verilen bir array'deki tum elemanlarý
		// bir listeye aktaran method yazýnýz
		
		
		String arr[] = {"hava","cok","yagmurlu","olacak","gibi","gozukuyor"};
			
		List<String> list = listcevir(arr);
		
		System.out.println(list);        //        [hava, cok, yagmurlu, olacak, gibi, gozukuyor]
		
		list.add(0, "Bugun");
		System.out.println(list);        // [Bugun, hava, cok, yagmurlu, olacak, gibi, gozukuyor]
		list.add(4, "soguk");
		System.out.println(list);        // [Bugun, hava, cok, yagmurlu, soguk, olacak, gibi, gozukuyor]
		list.remove(7);
		System.out.println(list);        // [Bugun, hava, cok, yagmurlu, soguk, olacak, gibi]
		

	}

	public static List<String> listcevir(String[] arr) {
		
		  List<String> depoList = new ArrayList<>(); 
		      for (String e : arr) {
				depoList.add(e);
			}
		
		return depoList;
	}

}
