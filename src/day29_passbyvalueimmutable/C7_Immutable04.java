package day29_passbyvalueimmutable;

public class C7_Immutable04 {

	public static void main(String[] args) {
		
		String a = "";
        a+=2;
        a+='c';
        a+=false;
        String isim = "Ali";
		
		isim = isim+"";
		System.out.println(isim.equals("Ali")); // true // equals sadece degere baktigi icin dogru
		System.out.println(isim=="Ali"); // false / == hem degere hem referansa bakiyor, deger Ali fakat referans farkli old. icin false verdif (a=="2cfalse") {
            System.out.println("==");
        
        if (a.equals("2cfalse")) {
            System.out.println("equals");
            
        }
        
      /*  String isim = "Ali";
		
		isim = isim+"";
		System.out.println(isim.equals("Ali")); // true // equals sadece degere baktigi icin dogru
		System.out.println(isim=="Ali"); // false / == hem degere hem referansa bakiyor, deger Ali fakat referans farkli old. icin false verdi
        
        */
        
        
        
        
        
	}
	

}

