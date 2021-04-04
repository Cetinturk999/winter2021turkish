package day21_scope;

public class Scope1 {
	
	static int okulId = 1201;                // NOOOOTTT! Variableler'a STAT�C yaz�ld�g�nda; clas i�inde her yerden cag�r�labilir ve kullan�labilir
	static String okulAd�= "Y�ld�z Koleji";  // method ister static olsun ister olams�n.  
	static boolean acikMi;                   // �nstance variableler static olmayan method larda direk kullanabiliyorken, static methodlarda
                                             // object olusturularak kullan�labiliyordu.
	
	                                         // static variable lar ise ister static isterse static olamayan tum method lardan direk kullan�labilir.
	
	public static void main(String[] args) {
		
		System.out.println(okulId + " " + okulAd� + " " + acikMi);   // 1201 Y�ld�z Koleji false (1)
		okulId= 1202;
		acikMi=true;
		
		staticMethod();  
		
		System.out.println(okulId + " " + okulAd� + " " + acikMi);   // 1203 Y�ld�z Koleji true (3)
		
	}   // main methodun sonu => 
	
	
	public static void staticMethod() {
		System.out.println(okulId + " " + okulAd� + " " + acikMi);   // 1202 Y�ld�z Koleji true (2)
		okulId=1203;
	}
	
	
    public void method() {  //   => buraya ugran�lmad�g�nda ; bu class cal�st�r�ld�g�nda
    	okulId=1205;        //      bu method cal�smaz
    }                       //      ne olursa olsun cal�smaz cunku cag�r�lmad�!!
    
    
    
    
    
    }
