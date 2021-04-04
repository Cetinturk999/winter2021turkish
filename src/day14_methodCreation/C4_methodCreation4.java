package day14_methodCreation;

public class C4_methodCreation4 {

	public static void main(String[] args) {
		
		toplama(60,50);

	}

	   // Method kolunda double yazip , method'a float yazinca kabul etmiyor
	   // Method koluna double yazip  , method'a int yazinca kabul etmiyor
	   // Method koluna 'a' yazinca  , method'a int yazinca ASCII degerini aliyor. (byte short yazinca hata veriyor)
	   // Sinir degerlerinden buyuk deger yazinca kabul etmiyor.
	
	   public static void toplama(int sayi1, int sayi2) {
		   System.out.println("integer method sonucu : " + (sayi1+sayi2));
	   }
	
	
	   public static void toplama(double sayi1, double sayi2) {
		   System.out.println("double method sonucu : " + (sayi1+sayi2));
	   }
	
	
	   public static void toplama(int sayi1, double sayi2) {
		   System.out.println("integer/double method sonucu : " + (sayi1+sayi2));
	   }
	
	   
	   public static void toplama(char char1, char char2) {
		   System.out.println("char method sonucu : " + (char1+char2));
	   }
	   
	
	   public static void toplama(String sayi1, String sayi2) {
		   System.out.println("String method sonucu : " + (sayi1+sayi2));
	   }
	
	
	
	
	
	
	
	
	
}
