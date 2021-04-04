package day26_arraylists;

import java.util.Arrays;

public class C1_Array01 {

	public static void main(String[] args) {
		
		/*Soru 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
		 *  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		 */
		
		
		int arr[]= {2,3,5,3,6,4,3,6,7};  //  lenght->9   array'in uzunlugunu degistiremeyecegimiz için, 
		                                 //  önce, arr2 olusturup 3'e esit olmayanlarý koyacagýz
		                                 //  {2,5,6,4,6,7}
		int sayi =3;           // sayi degisebilir ama soru 3'e göre yapýldý
		
		
		// 1.ADIM
		// arr icinde kaldýrmamýz gereken sayi kac tane var bulmalýyýz 
		// 
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				count++;
			}
		}
		
		// 2.ADIM
		// yeni array olusturalým
		
		int arr2[]= new int[arr.length-count];
		
		// 3.ADIM
		// ARR ARRAY'ÝNDEN elemanlarý tek tek alýp istenen sayiya esit degilse
		// arr2'ye ekleyecegiz
		
		int temp=0;     // bununla yeni array'in indexlerini kontrol edecegiz    
		
		/*
		 * i = 0 dan  8e giderken
		 *  index     sayi                             temp
		 *    0        2==3 F   arr[0]=2   temp++   0 idi 1 oldu     
		 *    1        3==3 T              artmadi      1
		 *    2        5==3 F   arr[1]=5   temp++       1              
		 *    3        3==3 T              artmadi      2                  
		 *    4        6==3 F   arr[2]=6   temp++       2        
		 *    5        4==3 F   arr[3]=4   temp++       3    
		 *    6        3==3 T              artmadi      4   
		 */      
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=3) {
				arr2[temp]=arr[i];
				temp++;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

}
