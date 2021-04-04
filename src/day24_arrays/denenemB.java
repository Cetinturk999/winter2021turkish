package day24_arrays;

import java.util.Arrays;

public class denenemB {

	public static void main(String[] args) {
		
		// ELEMAN SIRALAMA
		
		int myArray[]= {9,10,11,13,14};
		
		System.out.println(Arrays.toString(myArray));  // [9, 10, 11, 12, 13, 14]
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");        //  9 10 11 12 13 14 
		}

		//  Arrays.sort(myArray);
		
	    System.out.println(myArray);
		
		System.out.println(" ");
		System.out.println(Arrays.binarySearch(myArray,14));   // 4. indexte
		System.out.println(Arrays.binarySearch(myArray, 6));   // -1
		System.out.println(Arrays.binarySearch(myArray, 16));  // -6
		System.out.println(Arrays.binarySearch(myArray, 12));  // -4
		
		
		
	}

}
