package day18_whileLoop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		
		/* while loop ; ...oldugu surece
		 * loop u kac kere kullanacagýmýz hesaplanabilir durumdaysa for loop kullanýlýr.
		 * belli ritimde ilerliyorsa yada adým sayýsý belli ise forloop
		 * while loop ; bir sart saglandýgý surece tektar eder.
		   loop'larda; 1- baslangýc degeri
		               2- bitiþ sartý/degeri
		               3- artýs yada azalýs
		
		*/
		
		
		// soru : 10'dan 30'a kadar olan sayýlardan
		//  4 ile bölünebilenleri aralarýnda bir bosluk olacak 
		//  sekilde 
		 
		
		// for loop cözümü:
		
		for (int i = 10; i <= 30; i++) {
		    	
			if(i%4==0 ) {
				System.out.println(i + " ");
			}
		}
		
		
		// while loop ile cözümü ;
		
		int sayi=10;  // 1. sartý gerceklestirdim(baslangýc degeri/kosulu)
		
		while (sayi<30) {   // 2. sartý gerceklestirdim(bitiþ degeri/kosulu)
			
			if(sayi%4==0 ) {
				System.out.println(sayi + " ");
			}
			
		sayi++;    // 3. sarti gerceklestirdim (degisim degeri)
	
		
		// sayi++ yazmazsak birsey yazdýrmaz döngu halinde doner durur ama while'dan cýkamaz.
		
		}
		
		
	}
		
}
		
		
		
	


