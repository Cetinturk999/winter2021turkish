package day11_stringmanipulations;

public class C1_Concanition {

	public static void main(String[] args) {
		
		
		// concatenation : java'da + islemi yapýlýrken eger toplana ifadelerden biri veya
		// her ikisi String ise java toplama degil BÝRLESTÝRME yapa
		
		
		System.out.println( 15 + 20 + "Merhaba");
		System.out.println("Merhaba" +15 + 20);
		System.out.println("Merhaba" + ( 15+20));
		System.out.println("Merhaba" + 15*20 );
		
		
		String str1 = "Hello";
		String str2 = "World";
		
		// Hello World yazdýrmak istersek;
		
		System.out.println(str1 + " " + str2);
		
		// str1.concat(str2) methodu str1'in sonuna str2'yi ekler  
		
		System.out.println(str1.concat(str2));  // HelloWorld
		
		System.out.println(str1.concat(" ").concat(str2));  // Hello World
		
		System.out.println(str1.concat(" " + str2));  // Hello World
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
