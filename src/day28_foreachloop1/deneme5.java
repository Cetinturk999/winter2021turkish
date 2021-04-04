package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class deneme5 {

	
	public static void main(String[] args) {
		
		  // Bir integer list olusturunuz ve
		  // bu list’deki tum sayilarin karesinin carpimini
		  // For-each loop kullanarak bulunuz.
		  // Sonucu ekrana yazdiriniz.
		
		
	    List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		int karelerininCapimi=1;
		
		for (Integer each : list) {
			karelerininCapimi *= each*each;
		}
		  System.out.println(karelerininCapimi);
		

		
		
		
		
		
		
		
		
	}

}
