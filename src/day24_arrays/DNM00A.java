package day24_arrays;

import java.util.Arrays;

public class DNM00A {

	public static void main(String[] args) {
		
		
		//String isim ="Baris";
		//String isim1[] = new String[5]; 
		//System.out.println(Arrays.toString(isim1));
		
		
		char[] str = {'B','A','R','I','S'};
		
		String isim = new String(str);
		
		System.out.println(isim);  // BARIS
		
		int arr[]= new int[5];
		int[] arr1 = {9,12,16,21,24,34};
		System.out.println(Arrays.toString(arr1));  // [9, 12, 16, 21, 24]
		
		arr[0]=9;
		arr[1]=12;
		arr[0]=16;
		arr[0]=21;
		arr[0]=24;
		arr[0]=34;
		
	}

}
