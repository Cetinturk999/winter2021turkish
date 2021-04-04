package day13_stringmanipulations;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir cümle isteyin
		// cumledeki tum bosluklari silin
		// ve tum a'larýn yerine e yazýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String str=scan.nextLine();
		
		str=str.replace(" ", "");
		str=str.replace("a", "e");
		
		System.out.println(str);  // atama yapýlmazsa manipulations str' degistirmez
		
		// eger atama yaparsak str kalýcý degistigi icin biz bir daha orjinal str'a ulasamayýz
		// bu yuzden kullanýcýdan alýnan str'a degil yeni bir String'e atamak daha mantýklýdýr
		
		System.out.println("Lutfen bir cumle daha giriniz");
		String str2=scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace('a', 'e'));
		
		
		// hem a hemde e nin yerine i yazalým ;
		
		System.out.println(str2.replace("a", "i").replace('e', 'i'));   // buyuk harflE A yazýlýrsa onu degistirmez
		                                                                // sadece kucukleri degistirir
		
		
		// hem a hemde e yerine i yazalým.buyuk kucuk harf gözetmeksizin
		
		System.out.println(str2.toLowerCase().replace("a", "i").replace("e", "i"));
		
		
		scan.close();
		
		
		
		
	}

}
