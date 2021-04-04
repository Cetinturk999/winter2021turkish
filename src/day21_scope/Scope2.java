package day21_scope;

public class Scope2 {
	

	public static void main(String[] args) {
		
		// Static variablelar için, obje olusturma ihtiyacý yoktur.
        // baska bir class tan static variable lara ulasmak istedigimizde
		// ulasmak ýstedigimiz (( class'ýn adý.static variable adý )) yazmamýz yeterlidir.
		
		System.out.println(Scope1.okulAdý); // Yýldýz Koleji
		System.out.println(Scope1.okulId);  // 1201
		
		                                    // Java Run Time program'dir
		 								    // Scope2 Class'i calistirildiginda Scope1 calismazzzzzz
										    // dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
                                             
		Scope1.okulAdý="Mehmet Koleji";     // Scope 1'de  "Yýldýz Koleji"  olarak atanan okul adýný,bu class'ta yani
                                            // Scope 2 class'ýnda  "Mehmet Koleji"  olarak degistirdik.		                                     
		System.out.println(Scope1.okulAdý); // Mehmet Koleji
		
		
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);  //  1203
		System.out.println(Scope1.okulAdý); // Mehmet Koleji
		
		
		
	}

}
