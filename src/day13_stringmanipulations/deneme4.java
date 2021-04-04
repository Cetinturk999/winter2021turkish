package day13_stringmanipulations;

import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		
		//  Kullanýcýdan bir cümle isteyin
		// cumledeki tum bosluklari silin
		// ve tum a'larýn yerine e yazýn
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String str=scan.nextLine();
		
		str=str.replace(" ","");
		str=str.replace('a', 'e');
		
		System.out.println(str);  // atama yapýlmazsa calýsmaz
		
        System.out.println("Lutfen bir daha cumle giriniz");
		
		String str2=scan.nextLine();
		
		str2=str2.replace(" ", "").replace('a', 'e');
		
		System.out.println(str2);
		
		
		// hem a hemde e nin yerine i yazalým ;
		
		System.out.println(str2.replace("a", "i").replace('e', 'i')); // buyuk harfle A 'yý degistirmez.kucuk harfleri degistirir
		
		
		//  hem a hemde e yerine i yazalým.buyuk kucuk harf gözetmeksizin
		
		System.out.println(str2.toLowerCase().replace("a", "i").replace("e", "i"));
		
		
		
		
		scan.close();
	}

}
