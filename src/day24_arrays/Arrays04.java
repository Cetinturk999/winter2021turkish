package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		
		// kullan�c�dan degerler alarak int bir array olusturun
		// �nce kullan�c�dan girecegi sayi adedi almam�z laz�m ki array i olustural�m
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kac sayidan bir array istedi�inizi yaz�n�z");
		
		int uzunluk=scan.nextInt();
		
		int arr[]= new int[uzunluk];     // �rn kullan�c� 5 girdi  // array olusturduk
	
		System.out.println("Lutfen sayilari giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		scan.close();
		
		
		// loop ile ;
		
		
		
		
		
	}

}
