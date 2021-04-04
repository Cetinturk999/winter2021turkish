package day24_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		/* Soru 1: Verilen 3 elemanli bir array’in 
		 * tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		 *  Ornek; array [1, 2, 3] ise output [2, 3, 1] olacak
		 */
		
		int arr[] = {1,2,3,4,5,};    // kodlarýmýzý dinamik yapmak isteriz
		                             // dinamik ; degiþen sartlara ayak uydurmak
		
		int temp= arr[0];            // 1'i korumaya aldýk gecici olarak 
		                             // arry in 0. cý index'teki elemanýný koruduk.
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];         // örn; 0'a 1 yazsaydýk,  1. indexi 0. cý index e atadýk
		}
		
		arr[arr.length-1]=temp;
		
		System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 1]

	}

}
