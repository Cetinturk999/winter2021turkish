package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// verilen bir array'de bir eleman�n 
		// var olup olmad�g�n� nas�l kontrol ederiz
		
		int arr[]= {10,25,3,16,75};
		
		int sayi=25;
		
		/*
		
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;
			} 
			
		}

		if (flag) {
			System.out.println("array sorulan eleman� i�eriyor");
		} else {
			System.out.println("array sorulan eleman� i�ermiyor");
		}
		
		*/
		
		
		// pratik y�ntem ile; Arrays cals'�ndan method kullanarak
		// �nce s�ralama yapacag�z
		
		Arrays.sort(arr);  // [3,10,16,25,75]
		
		System.out.println(Arrays.binarySearch(arr, 25));  // sonuc olarak t yada f degil aranan sayinin indeksini d�ner
		
		System.out.println(Arrays.binarySearch(arr,10)); // 1
		
		System.out.println(Arrays.binarySearch(arr, 28));  
		// olmayan bir sayi girdi�imizde olsayd� nerede olurdu ona g�re veriyor
		// index olarak degil say�ya g�re veriyor 
		
		System.out.println(Arrays.binarySearch(arr, 5));  // -2
		
		System.out.println(Arrays.binarySearch(arr, 100));  // -6
		
		// binary search sonuc olarak arad�g�m�z eleman varsa indexini verir.
		// yoksa - isareti ile olsayd� kac�nc� eleman olacag�n� dndururdu
		
		
		
		int arr2[]= {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);  // [3,12,12,14,15,25,65]
		
		System.out.println(Arrays.binarySearch(arr2,14));  // 3
		
		System.out.println(Arrays.binarySearch(arr2,14));  // -6
		
		System.out.println(Arrays.binarySearch(arr2,12));  // 1
		
		System.out.println(Arrays.binarySearch(arr2,2));  // -1
		
		// n�ye olmaynda s�ralam verd�g� de ortaya c�kt�... -0 olamaz da ondan
		
		
		
		// ARRAY NASIL STR�NGE CEVR�L�R:
		
		String arrayString =Arrays.toString(arr2);   // Array class'ndan yararland�k
		
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));  // 5. ci indexten sonras�n� yazd�r�yor.
		                                               // bastaki koseli parantez dahil tum String'i Array'e ceviriyor
		
		
		
	}

}
