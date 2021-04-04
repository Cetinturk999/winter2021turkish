package day42_abstractclasses;

public class C2_final2 extends C1_final1{

	public static void main(String[] args) {
		
	System.out.println(	C1_final1.SAYI);
	
    // sTATÝC BÝR VARÝABLE OKUL ÝSMÝ GÝBÝ HERKES ÝÇÝN AYNIDIR.
	
	// C1_final.SAYI+=20;
	// SAYÝ VARÝABLE'I FÝNAL OLARAK TANIMLANDIGI ÝÇÝN DEGÝSTÝRÝLEME
	
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
	
	// final class yaptýgýmýzda inherit edilemez
	
	
	
}
