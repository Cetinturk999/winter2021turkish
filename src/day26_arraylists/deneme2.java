package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class deneme2 {

	public static void main(String[] args) {
		
		
		 ArrayList<String> list = new ArrayList<String>();
		 
		 ArrayList<String> list2 = new ArrayList<>();
		 
		 List<String> list3 = new ArrayList<>();

         
		 list3.add("Zeynep");
		 list3.add("Beyza");
		 list3.add("Kemal");
		 
		 System.out.println(list3);
 
         list3.add(2, "Can");
         System.out.println(list3);
         
         list3.add(0, "Neseli");
         System.out.println(list3);
         
         list3.add(3, "Lale");
         System.out.println(list3);
         
         list3.add(6, "Sevimli");
         System.out.println(list3);
         
        
	}

}
     