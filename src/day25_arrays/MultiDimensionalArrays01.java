package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		/*
		 * 1 - Ic ice array olusturdugumuzda disardaki ana array'e outer array icerdeki kucuk arraylere 
		 */
		
		int arr [] [] = {{1,3,5}, {3,5}, {5,9,11,3}};  // iki katli bir array'dir
		// inner:iceri   inner array   
		System.out.println(Arrays.toString(arr));
		
		// 11 sayisini index ile ifade etmek istersek arr[2][2]
		// eger Array'i uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int [3][2]; // burada sagda [3][] boyle yazarsak null null null degerini verir yani yanlis bir cozum yolu
		// 3 tane [1,2] [3,4] [5,6] var bunlarin her birinin icinde de 2 tane sayi var anlaminda [3][2]
		// [3] ilk yazilan sayi outer array'in icinde kac tane inner array old. belirtir
		// [2] her bir inner aray'in uzunlugu :
		System.out.println(Arrays.toString(arr2));
		
		
		// Multidimensional array'leri yazdirmak icin toString method'u kullanilamaz.
		// cunku toString methodu outer array'i String'e cevirir
		// outer array'in icinde inner array'ler oldugundan toStrging method'unda inner array'lerin referans degerlei yazdirilir
		 
		System.out.println(Arrays.deepToString(arr2));
		
		
		
		
	}

}
