package day01_variables;

public class C2_Variables {
	
     public static void main(String[] args) {
    	 
           int sayi; // ; yazým dilindeki . gibidir. java ;'ü görünce o satýrdaki kod yazýlýmýnýn bittiðini anlar.
           sayi=27;
           
           System.out.print(sayi); // 27M  eðer println deðilde print yazarsak yazdýrma iþleminden sonra alt satýra geçmez
    	 
    	   char ilkHarf='M' ;
    	   
    	   System.out.println(ilkHarf); // print ln yazýnca yazma iþleminden sonra alt satýra geçer
    	   
    	   double sayiDouble = 5.34;
    	   
    	   System.out.println(sayiDouble);  // 5.34
    	   
    	   System.out.println(sayi + sayiDouble);  //  32.34 
    	   
    	   System.out.println(sayi + ilkHarf); // 27 + 77 =104  M nin asci deðeri=77 
    	   // eðer bir toplama iþleminde char deðiþken kullanýlýrsa karakterin asci deðeri toplanýr
    	   
    		 
     }
     

}