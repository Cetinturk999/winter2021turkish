package day42_abstractclasses;

public class C2_final2 extends C1_final1{

	public static void main(String[] args) {
		
	System.out.println(	C1_final1.SAYI);
	
    // sTAT�C B�R VAR�ABLE OKUL �SM� G�B� HERKES ���N AYNIDIR.
	
	// C1_final.SAYI+=20;
	// SAY� VAR�ABLE'I F�NAL OLARAK TANIMLANDIGI ���N DEG�ST�R�LEME
	
	 C2_final2 obj1= new  C2_final2();
	
	obj1.deneme();
	
	}

	public void deneme() {
		System.out.println("child class'daki overriding method");
	}
	
	/*
	public  void deneme2() {
		// cannot override the final method from C1_final
	}
	*/
	
	// final class yapt�g�m�zda inherit edilemez
	
	
	
}
