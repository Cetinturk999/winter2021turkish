package day01_variables;

public class C2_Variables {
	
     public static void main(String[] args) {
    	 
           int sayi; // ; yaz�m dilindeki . gibidir. java ;'� g�r�nce o sat�rdaki kod yaz�l�m�n�n bitti�ini anlar.
           sayi=27;
           
           System.out.print(sayi); // 27M  e�er println de�ilde print yazarsak yazd�rma i�leminden sonra alt sat�ra ge�mez
    	 
    	   char ilkHarf='M' ;
    	   
    	   System.out.println(ilkHarf); // print ln yaz�nca yazma i�leminden sonra alt sat�ra ge�er
    	   
    	   double sayiDouble = 5.34;
    	   
    	   System.out.println(sayiDouble);  // 5.34
    	   
    	   System.out.println(sayi + sayiDouble);  //  32.34 
    	   
    	   System.out.println(sayi + ilkHarf); // 27 + 77 =104  M nin asci de�eri=77 
    	   // e�er bir toplama i�leminde char de�i�ken kullan�l�rsa karakterin asci de�eri toplan�r
    	   
    		 
     }
     

}