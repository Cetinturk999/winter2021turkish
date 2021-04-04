package day21_scope;

public class Scope1 {
	
	static int okulId = 1201;                // NOOOOTTT! Variableler'a STATÝC yazýldýgýnda; clas içinde her yerden cagýrýlabilir ve kullanýlabilir
	static String okulAdý= "Yýldýz Koleji";  // method ister static olsun ister olamsýn.  
	static boolean acikMi;                   // Ýnstance variableler static olmayan method larda direk kullanabiliyorken, static methodlarda
                                             // object olusturularak kullanýlabiliyordu.
	
	                                         // static variable lar ise ister static isterse static olamayan tum method lardan direk kullanýlabilir.
	
	public static void main(String[] args) {
		
		System.out.println(okulId + " " + okulAdý + " " + acikMi);   // 1201 Yýldýz Koleji false (1)
		okulId= 1202;
		acikMi=true;
		
		staticMethod();  
		
		System.out.println(okulId + " " + okulAdý + " " + acikMi);   // 1203 Yýldýz Koleji true (3)
		
	}   // main methodun sonu => 
	
	
	public static void staticMethod() {
		System.out.println(okulId + " " + okulAdý + " " + acikMi);   // 1202 Yýldýz Koleji true (2)
		okulId=1203;
	}
	
	
    public void method() {  //   => buraya ugranýlmadýgýnda ; bu class calýstýrýldýgýnda
    	okulId=1205;        //      bu method calýsmaz
    }                       //      ne olursa olsun calýsmaz cunku cagýrýlmadý!!
    
    
    
    
    
    }
