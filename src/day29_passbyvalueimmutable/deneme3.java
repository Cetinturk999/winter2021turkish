package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class deneme3 {

	public static void main(String[] args) {
	 /* Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
        Iki method olusturup list elemanlarini artirmayi deneyelim
      
      - 1. Method’da elemanlari for each loop kullanarak artirin
      - 2. Method’da elemanlari set method’u kullanarak artirin
      - Method’lari arka arkaya cagirip artislarin
        kalici olup olmadiklarini kontrol edelim.
    */

		List<Integer> list= new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);   // [10, 11, 12]
		
		arttýrFor(list);
		System.out.println("1. method sonrasý : " + list);   // [10, 11, 12]  eski degerde
		
		arttýrSet(list);
		System.out.println("2. method sonrasý : " + list);   // [15, 16, 17]  yeni degerdecungu set methodu istisnai
		
		
	}

	public static void arttýrSet(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)+5);
		}
	
		System.out.println(" " + list);   // [15, 16, 17]
	}

	public static void arttýrFor(List<Integer> list) {
	     for (Integer each : list) {
			each+=5;
			System.out.print(each + " ");     // 15 16 17
			;
			
		}
		System.out.println("");
	}

}
