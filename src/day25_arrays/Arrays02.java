package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// verilen bir array'de bir elemanýn 
		// var olup olmadýgýný nasýl kontrol ederiz
		
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
			System.out.println("array sorulan elemaný içeriyor");
		} else {
			System.out.println("array sorulan elemaný içermiyor");
		}
		
		*/
		
		
		// pratik yöntem ile; Arrays cals'ýndan method kullanarak
		// önce sýralama yapacagýz
		
		Arrays.sort(arr);  // [3,10,16,25,75]
		
		System.out.println(Arrays.binarySearch(arr, 25));  // sonuc olarak t yada f degil aranan sayinin indeksini döner
		
		System.out.println(Arrays.binarySearch(arr,10)); // 1
		
		System.out.println(Arrays.binarySearch(arr, 28));  
		// olmayan bir sayi girdiðimizde olsaydý nerede olurdu ona göre veriyor
		// index olarak degil sayýya göre veriyor 
		
		System.out.println(Arrays.binarySearch(arr, 5));  // -2
		
		System.out.println(Arrays.binarySearch(arr, 100));  // -6
		
		// binary search sonuc olarak aradýgýmýz eleman varsa indexini verir.
		// yoksa - isareti ile olsaydý kacýncý eleman olacagýný dndururdu
		
		
		
		int arr2[]= {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);  // [3,12,12,14,15,25,65]
		
		System.out.println(Arrays.binarySearch(arr2,14));  // 3
		
		System.out.println(Arrays.binarySearch(arr2,14));  // -6
		
		System.out.println(Arrays.binarySearch(arr2,12));  // 1
		
		System.out.println(Arrays.binarySearch(arr2,2));  // -1
		
		// nýye olmaynda sýralam verdýgý de ortaya cýktý... -0 olamaz da ondan
		
		
		
		// ARRAY NASIL STRÝNGE CEVRÝLÝR:
		
		String arrayString =Arrays.toString(arr2);   // Array class'ndan yararlandýk
		
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));  // 5. ci indexten sonrasýný yazdýrýyor.
		                                               // bastaki koseli parantez dahil tum String'i Array'e ceviriyor
		
		
		
	}

}
