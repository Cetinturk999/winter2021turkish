package day18_whileLoop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		
		/* while loop ; ...oldugu surece
		 * loop u kac kere kullanacag�m�z hesaplanabilir durumdaysa for loop kullan�l�r.
		 * belli ritimde ilerliyorsa yada ad�m say�s� belli ise forloop
		 * while loop ; bir sart sagland�g� surece tektar eder.
		   loop'larda; 1- baslang�c degeri
		               2- biti� sart�/degeri
		               3- art�s yada azal�s
		
		*/
		
		
		// soru : 10'dan 30'a kadar olan say�lardan
		//  4 ile b�l�nebilenleri aralar�nda bir bosluk olacak 
		//  sekilde 
		 
		
		// for loop c�z�m�:
		
		for (int i = 10; i <= 30; i++) {
		    	
			if(i%4==0 ) {
				System.out.println(i + " ");
			}
		}
		
		
		// while loop ile c�z�m� ;
		
		int sayi=10;  // 1. sart� gerceklestirdim(baslang�c degeri/kosulu)
		
		while (sayi<30) {   // 2. sart� gerceklestirdim(biti� degeri/kosulu)
			
			if(sayi%4==0 ) {
				System.out.println(sayi + " ");
			}
			
		sayi++;    // 3. sarti gerceklestirdim (degisim degeri)
	
		
		// sayi++ yazmazsak birsey yazd�rmaz d�ngu halinde doner durur ama while'dan c�kamaz.
		
		}
		
		
	}
		
}
		
		
		
	


