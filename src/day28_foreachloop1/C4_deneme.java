package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class C4_deneme {

	public static void main(String[] args) {
		
		//iki String array olusturunuz ve
		//bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazdiriniz.
		//Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz 
					
		String arr1[]= {"Ali", "Can","Ayse","Seher"};
		String arr2[]= {"Ali", "Veli","Mesut","Seher", "Sedat"};
		String arr3[]= {"Kazim","Ali"};
		String arr4[]= {"Ali"};
		
		List <String> ortakElemanlar = new ArrayList<>();
		
		for (String each1 : arr1) {
			for (String each2 : arr2) {
				for (String each3 : arr3) {
					for (String each4 : arr4) {
				if(each1.equals(each2) && each1.equals(each3) && each1.equals(each4)) {
					ortakElemanlar.add(each1);
				}
			}
		}
	}
		}
				System.out.println(ortakElemanlar);
		
		
		
		

	}

}
