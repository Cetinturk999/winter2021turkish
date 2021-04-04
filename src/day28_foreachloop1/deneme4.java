package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class deneme4 {

	public static void main(String[] args) {
		
		  // iki String array olusturunuz ve
	      // bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
		  // Sonucu ekrana yazdiriniz.
		  // Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz 
				

		String arr1[]= {"selam.","bahar.","fatma","nasýlsýn."};
		String arr2[]= {"selam","bahar","ayse","nasýlsýn"};
		
		List <String> ortakKelime = new ArrayList<>();
		for (String eachArr1 : arr1) {
			for (String eachArr2 : arr2) {
				if (eachArr1.equals(eachArr2)) {
					ortakKelime.add(eachArr1);
				}
			}
		}
		if(ortakKelime.isEmpty()) {
			System.out.println("ortak eleman yok");
		} else {
		System.out.println(ortakKelime);
		}
		
		
		
		
	}

}
