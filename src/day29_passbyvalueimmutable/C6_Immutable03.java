package day29_passbyvalueimmutable;

public class C6_Immutable03 {

	public static void main(String[] args) {
		
		// atama yap�ld�g�nda ne olur?
		
		String isim="";
		
		for (int i = 0; i < 10; i++) {
			isim=isim+i;
			System.out.println(isim);
		}
		// java bu kod cal�st��nda kac obje olusturur???
		// 
		System.out.println("==================");
		System.out.println(isim);
		

	}

}
