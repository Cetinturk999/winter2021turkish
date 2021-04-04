package day24_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		/* Soru 1: Verilen 3 elemanli bir array�in 
		 * tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		 *  Ornek; array [1, 2, 3] ise output [2, 3, 1] olacak
		 */
		
		int arr[] = {1,2,3,4,5,};    // kodlar�m�z� dinamik yapmak isteriz
		                             // dinamik ; degi�en sartlara ayak uydurmak
		
		int temp= arr[0];            // 1'i korumaya ald�k gecici olarak 
		                             // arry in 0. c� index'teki eleman�n� koruduk.
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];         // �rn; 0'a 1 yazsayd�k,  1. indexi 0. c� index e atad�k
		}
		
		arr[arr.length-1]=temp;
		
		System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 1]

	}

}
