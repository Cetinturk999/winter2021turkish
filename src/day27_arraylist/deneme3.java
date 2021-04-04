package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		
		// Kullanicidan pozitif bir tamsayi alin
		// aldiginiz sayidan kucuk olan fibonacci dizisi elemanlarini yazdirin
		// 0 1 1 2 3 5 8 13 21 34.....
				
		// 1567
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		List<Integer> nacci =new ArrayList<>();
		nacci.add(1);
		nacci.add(1);
		
		System.out.println(nacci);
		
		for (int i = 1; nacci.get(i-1)+nacci.get(i) < sayi; i++) {
			
			nacci.add(nacci.get(i-1)+nacci.get(i));
		}
          System.out.println(nacci);
		
		
          int i=1;
          
          while(nacci.add(nacci.get(i-1)+nacci.get(i))) {
        	  nacci.add(nacci.get(i-1)+nacci.get(i));
        	  
        	  i++;
          }
          
          System.out.println(nacci);
          
          scan.close();
		
	}

}
