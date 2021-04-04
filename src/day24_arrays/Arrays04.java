package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		
		// kullanýcýdan degerler alarak int bir array olusturun
		// önce kullanýcýdan girecegi sayi adedi almamýz lazým ki array i olusturalým
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kac sayidan bir array istediðinizi yazýnýz");
		
		int uzunluk=scan.nextInt();
		
		int arr[]= new int[uzunluk];     // örn kullanýcý 5 girdi  // array olusturduk
	
		System.out.println("Lutfen sayilari giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		scan.close();
		
		
		// loop ile ;
		
		
		
		
		
	}

}
