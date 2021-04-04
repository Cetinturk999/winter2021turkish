package day02_scaanner;

import java.util.Scanner;

public class C2_Scanner {
	
	
     //kullanýcýdan dairenin yarý çapýný isteyin ve dairenin alanýný yazdýrýn
			
	 public static void main(String[] args) {
				
	      Scanner scan= new Scanner(System.in);   // scanner objesi oluþturur 1. adým  
	                                              // dýþarýdan içeriye bilgi alýndýðý için in kullanýlýr
	 
          System.out.println("alanýný hesaplamak için dairenin yarýçapýný girin");  //kullanýcýdan ne istediðimizi kullanýcýya yazdýrmak 2.adým
      
        // kullanýcýdan yarýçap istedim.dolayýsýyla önce kullanýcýnýn girdiði yarýçapý içine koyabileceðým                   
        // bir deðiþken oluþturmalýyým
        // kodlama alanýndan dýþarýya bilg verildiðinde,yazdýrmak için out kullanýlýr. 
          
     double yarýçap = scan.nextDouble(); // yarýçap isminde bir variable oluþturuyor=kullanýcýnýn girdiði deðeri alýyor       
		    
           System.out.println("dairenin alaný= " + 3.14 *yarýçap*yarýçap);	

           scan.close();    
	 
	 }
    }