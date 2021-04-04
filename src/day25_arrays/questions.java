package day25_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class questions {

	public static void main(String[] args) {
		
		// Kullanicidan kac kelime girecegini isteyin
		// daha sonra kelimeleri alarak Array'e cevirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Kac kelime gireceginizi belirtin ");
		int uzunluk = scan.nextInt();
		
		String arr[]= new String[uzunluk];
		
		System.out.println("Kelimeleri giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.next();  
			
			// nextLine yapmadýk.cunku index'lere kelimeyi degil  cumleyi aldý
		}
		System.out.println(Arrays.toString(arr));
		
		scan.close();

	}

}
