package day21_scope;

public class Scope2 {
	

	public static void main(String[] args) {
		
		// Static variablelar i�in, obje olusturma ihtiyac� yoktur.
        // baska bir class tan static variable lara ulasmak istedigimizde
		// ulasmak �stedigimiz (( class'�n ad�.static variable ad� )) yazmam�z yeterlidir.
		
		System.out.println(Scope1.okulAd�); // Y�ld�z Koleji
		System.out.println(Scope1.okulId);  // 1201
		
		                                    // Java Run Time program'dir
		 								    // Scope2 Class'i calistirildiginda Scope1 calismazzzzzz
										    // dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
                                             
		Scope1.okulAd�="Mehmet Koleji";     // Scope 1'de  "Y�ld�z Koleji"  olarak atanan okul ad�n�,bu class'ta yani
                                            // Scope 2 class'�nda  "Mehmet Koleji"  olarak degistirdik.		                                     
		System.out.println(Scope1.okulAd�); // Mehmet Koleji
		
		
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);  //  1203
		System.out.println(Scope1.okulAd�); // Mehmet Koleji
		
		
		
	}

}
