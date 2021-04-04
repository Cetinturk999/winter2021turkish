package day26_arraylists;

import java.util.Arrays;
import java.util.Iterator;

public class deneme1 {

	public static void main(String[] args) {
		
		/*  Soru 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
		 *  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		 */
		
		
		
		  int arr[] = {2,3,5,3,6,4,3,6,7};
			int sayi = 3;
			
			int count = 0;
			for (int i = 0; i < arr.length; i++) {      // => yeni Arry'in uzunlugunu belirledik   (-, -, -, -, -, -)
				if(arr[i]!=sayi) count++;
			}
			System.out.println("count:" + count);       // 3 rakamı olmayan 6 adet sayi vardır
			
			int arr2 [] = new int[count];              
			int j = 0;
			for (int i = 0; i < arr.length; i++) {      // => (2, 5, 6, 4, 6, 7)  uzunlugu belirlenen Array2'i doldurduk
				if(arr[i]!=sayi) {
					arr2[j] = arr [i];
					j++;
				}
			}
			System.out.println(Arrays.toString(arr2));  // =>   [2, 5, 6, 4, 6, 7]  
		
		
		
		
		/*
		
		int arr[] = {2,4,3,5,6,5,7,5,8};
		
		int sayi = 5;
		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				count++;
			}
		}
		
		int arr2[]= new int[arr.length-count];
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=5) {
				arr2[temp]=arr[i];
				temp++;
			}
		}
		
		System.out.println(Arrays.toString(arr2));   // [2, 4, 3, 6, 7, 8]
		
		*/
		
		
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
