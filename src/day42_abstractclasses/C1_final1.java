package day42_abstractclasses;

public class C1_final1 {
     
	final static int SAYI=10;
	
	//
	// 
	
	String isim;
	// Instance variable'lara ilk deger atamas� yapmak zorunda degiliz
	// deger atamad�g�n�zda jAVA DATA TURUNE GORE DEFAULT B�R DEGER ATAR
	
	// final String soyisim;
	// final variable'lar�n degeri sonradan degistirilemeyecegi icin ilk atama yap�lmadan
	// olusturulmas�na java izin vermez.
	
	public static void main(String[] args) {
	
		
		System.out.println(SAYI);
		
        System.out.println(Integer.MAX_VALUE);
	}
	
	
	public void deneme() {
		System.out.println("deneme yap�yoruz");
	}
	
	
	
	
	
	
	

}
