package day29_passbyvalueimmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		
		// degisikligi kaıcı yapmak icin atama yaparsak
		// ımmutable class'lar nasıl davranır?
		
		String isim="Ali";
		isim=isim+"";
		
		System.out.println(isim.equals("Ali"));   // true
        System.out.println(isim=="Ali");          // false
        
        String str1= new String("Mehmet");
        String str2= new String ("Mehmet");
        
        System.out.println(str1==str2);         // false  referanslarinin ayni olmasi mumkun degil o yuzden false
        System.out.println(str1.equals(str2));  // true
        
        String str3="Mehmet";
        // new kelimesi olmadan olust String lere daha once olusturuldu mu diye java bakar ve old gorunce niye olust der
        //  heap'e str4 ==>   objesini koyar ama referansını daha önce olust str3'un referansına(stack) atar.
        String str4="Mehmet";
        
        System.out.println(str3==str4);	         // false ? TRUE => nedeni; java degeri 
                                                 // aynı olan str3 ve str4'e String havuzundaki aynı objeyi atıyor.
        System.out.println(str3.equals(str4));   // true
        
        System.out.println(str3==str1);	         // false
        System.out.println(str3.equals(str1));   // true
        
        
        
	}

}
