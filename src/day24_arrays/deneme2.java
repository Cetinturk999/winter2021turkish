package day24_arrays;

import java.util.Arrays;

public class deneme2 {

	public static void main(String[] args) {
		
		/* Soru 1: Verilen 3 elemanli bir array’in 
		 * tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		 *  Ornek; array [1, 2, 3] ise output [2, 3, 1] olacak
		 */

		int arr[] = {1,2,3,4,5};
		
		int x =arr[0];
		
		System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5]
	
		/* 
		 * arr[1] = arr [0]
		 * arr[2] = arr [1]
		 * arr[3] = arr [2]     arr[i]=arr[i+1];
		 * arr[4] = arr [3]
		 * 
		 * arr[0] = arr [4]
		 * 
		 * {2,3,4,5,1}   [2, 3, 4, 5, 1]
		 */
		
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		    arr[arr.length-1]=x;
		
		System.out.println(Arrays.toString(arr));  // [2, 3, 4, 5, 1]
	}

}
