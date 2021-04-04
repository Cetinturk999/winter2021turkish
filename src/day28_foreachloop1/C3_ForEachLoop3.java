package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		
		// verilen bir array'deki tum elemanlarý
		// bir listeye aktaran method yazýnýz
		
		
		String arr[]= {"Ali","Veli","Ayse","Fatma"};   // bir array olusturduk (dinamik) icindekiler degisebilir
		
		List<String> list=listeyeCevir(arr);           // esitliðin saðýnda ; methodcall olusturduk.methoda array gönderecegiz.
		                                               // argument olarak array(arr) yazmalýyýz.
		                                               // methodcall array'i methoda götürecek ve donuste liste dönecek 
		                                               // esitliðin solunda ; ismi list olan String bir liste olusturacagým.
		
		list.add(0,"Bu is bu kadar");                  // [Bu is bu kadar, Ali, Veli, Ayse, Fatma]
    	System.out.println(list);
		list.remove(1);                                // Ali'yi siler
		System.out.println(list);                      // [Bu is bu kadar, Veli, Ayse, Fatma]
		
	}

	public static List<String> listeyeCevir(String[] arr) {   // method'un array alýp list'e döndurdugunu; 
		                                                      // (string[] arr) arra aldýgýný anlarýz
		                                                      // List<String> 
	  List<String> geciciList = new ArrayList<>();            
	  
	  for (String each : arr) {                    // array deki her bir String'i alýp gecici list'e add yaptýk attýk 
		
		  geciciList.add(each);
	}
	  
	  return geciciList;
	  
	}

}
