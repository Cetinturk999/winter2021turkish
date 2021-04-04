package day24_arrays;

import java.util.Arrays;

public class denemeA {

	public static void main(String[] args) {
		
		int myArray[] = new int[6];
		
		// System.out.println(myArray);   [I@244038d0   ref verir
		
		System.out.println(Arrays.toString(myArray));  // [0, 0, 0, 0, 0, 0]

		
		int myArray1[] = new int[3];
		
		myArray1[0]=9;
		myArray1[1]=10;
		myArray1[2]=11;
		
		System.out.println(Arrays.toString(myArray1));  // [9, 10, 11]
		
		
		int arr1[] = {9,10,11};
		
		int size = arr1.length;
		
		System.out.println(arr1.length);   // 3
		
		
		
		
	}

}
