package day26_arraylists;

import java.util.Arrays;

public class denemea {

	public static void main(String[] args) {
		
		// sayi yazan yerdeki degeri array'den silipyeni bir array olusturacagız
		
		int arr [] = {2,3,5,3,6,4,3,6,7};

		int sayi=3;
		
		// int [] = {2,5,6,4,6,7};
		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				count++;
			}
		}
		System.out.println(count);
		
		
		// 2. adım yeni array'imizi olusturacagız.
		
		int arr2[] = new int[arr.length-count];
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=sayi) {
				arr2[temp]=arr[i];
				     temp++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
	}

}
