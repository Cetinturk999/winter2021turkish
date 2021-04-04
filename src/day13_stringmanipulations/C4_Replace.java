package day13_stringmanipulations;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir c�mle isteyin
		// cumledeki tum bosluklari silin
		// ve tum a'lar�n yerine e yaz�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String str=scan.nextLine();
		
		str=str.replace(" ", "");
		str=str.replace("a", "e");
		
		System.out.println(str);  // atama yap�lmazsa manipulations str' degistirmez
		
		// eger atama yaparsak str kal�c� degistigi icin biz bir daha orjinal str'a ulasamay�z
		// bu yuzden kullan�c�dan al�nan str'a degil yeni bir String'e atamak daha mant�kl�d�r
		
		System.out.println("Lutfen bir cumle daha giriniz");
		String str2=scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace('a', 'e'));
		
		
		// hem a hemde e nin yerine i yazal�m ;
		
		System.out.println(str2.replace("a", "i").replace('e', 'i'));   // buyuk harflE A yaz�l�rsa onu degistirmez
		                                                                // sadece kucukleri degistirir
		
		
		// hem a hemde e yerine i yazal�m.buyuk kucuk harf g�zetmeksizin
		
		System.out.println(str2.toLowerCase().replace("a", "i").replace("e", "i"));
		
		
		scan.close();
		
		
		
		
	}

}
