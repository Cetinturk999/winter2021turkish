package day02_scaanner;

import java.util.Scanner;

public class C2_Scanner {
	
	
     //kullan�c�dan dairenin yar� �ap�n� isteyin ve dairenin alan�n� yazd�r�n
			
	 public static void main(String[] args) {
				
	      Scanner scan= new Scanner(System.in);   // scanner objesi olu�turur 1. ad�m  
	                                              // d��ar�dan i�eriye bilgi al�nd��� i�in in kullan�l�r
	 
          System.out.println("alan�n� hesaplamak i�in dairenin yar��ap�n� girin");  //kullan�c�dan ne istedi�imizi kullan�c�ya yazd�rmak 2.ad�m
      
        // kullan�c�dan yar��ap istedim.dolay�s�yla �nce kullan�c�n�n girdi�i yar��ap� i�ine koyabilece��m                   
        // bir de�i�ken olu�turmal�y�m
        // kodlama alan�ndan d��ar�ya bilg verildi�inde,yazd�rmak i�in out kullan�l�r. 
          
     double yar��ap = scan.nextDouble(); // yar��ap isminde bir variable olu�turuyor=kullan�c�n�n girdi�i de�eri al�yor       
		    
           System.out.println("dairenin alan�= " + 3.14 *yar��ap*yar��ap);	

           scan.close();    
	 
	 }
    }