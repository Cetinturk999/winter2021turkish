package day26_arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C4_ArrayList {

	public static void main(String[] args) {
		
		// ......... C1 class'taki sorunun kolay cözumu ...........
		
		
		/*Soru 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
		 *  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		 */
		
		int arr[]= {2,2,3,2,4,5,6,2,6,4,7,2,8};
		
		
		int sayi=2;
		int sayi2=6;
		int sayi3=4;
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=sayi && arr[i]!=sayi2 && arr[i]!=sayi3) {
				list.add(arr[i]);
			}
		}
		
		System.out.println(list);
		
		
		
		
		
		

	}

}
