package day16_forLoop2;

import java.util.Scanner;

public class C6_ForLoop {

	private static char tersYazi;

	public static void main(String[] args) {
		
		/* Soru 8 ) Interview Question 
		   Kullanicidan bir String isteyin
		   ve Stringi tersine ceviren bir program yazin.
		*/

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir yazi yaziniz");
		
		String yazi=scan.nextLine();
		
	   
		
		// 1. yol : variable olusturup en son yazdýrabilirim;
		//  bos bir string olusturdum
		
		
		String tersYazi="";
		
		for (int i = yazi.length()-1; i>= 0; i--) {
			
			tersYazi+=yazi.charAt(i);   // tersYazi=tersYazi+yazi.charAt()    ?charAt nie kullandýk
			
		}
		
		System.out.println("Girdiginiz yazinin tersten yazýlisi : " + tersYazi);
		
		

	
		// 2. yol: ters yaziyi sadece yazdýracaksak variable olusturmadan da yapabiliriz;
		
		
		System.out.print("Girdiginiz yazinin tersi : ");
		
         for (int i = yazi.length()-1; i>= 0; i--) {
			
			  tersYazi+=yazi.charAt(i);
		
		      System.out.print(yazi.charAt(i));  
		      
		   // Her dongu de bir sey yazdirmak istiyorsak For Body'sinin icine yazacagiz (syso yu)
	       // Diyelim ki sayilarin toplami ile ilgileniyoruz yani sadece sonuc ile ilgileniyorsak For Body'sinin disina yazdiriyoruz
		      
         }
		
         System.out.println("");
         
         
         
         
         
		// 3. yol : method olusturup bunu yazdýrabiliriz ;
         
         tersineCevir(yazi);    // method adý; tersineCevir
		
		
		scan.close();
         
	}

	public static void tersineCevir(String yazi) {
		
		System.out.print("Method yöntemiyle girdiginiz yazinin tersi : ");
		
        for (int i = yazi.length()-1; i>= 0; i--) {
			
			  tersYazi+=yazi.charAt(i);
		
		      System.out.print(yazi.charAt(i));
		      
		
        }
		
	}

}
