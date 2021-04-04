package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		
		// verilen bir array'deki tum elemanlar�
		// bir listeye aktaran method yaz�n�z
		
		
		String arr[]= {"Ali","Veli","Ayse","Fatma"};   // bir array olusturduk (dinamik) icindekiler degisebilir
		
		List<String> list=listeyeCevir(arr);           // esitli�in sa��nda ; methodcall olusturduk.methoda array g�nderecegiz.
		                                               // argument olarak array(arr) yazmal�y�z.
		                                               // methodcall array'i methoda g�t�recek ve donuste liste d�necek 
		                                               // esitli�in solunda ; ismi list olan String bir liste olusturacag�m.
		
		list.add(0,"Bu is bu kadar");                  // [Bu is bu kadar, Ali, Veli, Ayse, Fatma]
    	System.out.println(list);
		list.remove(1);                                // Ali'yi siler
		System.out.println(list);                      // [Bu is bu kadar, Veli, Ayse, Fatma]
		
	}

	public static List<String> listeyeCevir(String[] arr) {   // method'un array al�p list'e d�ndurdugunu; 
		                                                      // (string[] arr) arra ald�g�n� anlar�z
		                                                      // List<String> 
	  List<String> geciciList = new ArrayList<>();            
	  
	  for (String each : arr) {                    // array deki her bir String'i al�p gecici list'e add yapt�k att�k 
		
		  geciciList.add(each);
	}
	  
	  return geciciList;
	  
	}

}
