package day03;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		
		//kullan�c�dan ismini isteyip ilk harfini b�y�k harf olarak yazd�r�n
		//mehmet ==> ba�harfiniz : M
		
		
	   Scanner scan =new Scanner(System.in);
	   System.out.println("L�tfen isminizi giriniz");
		
	   char ilkHarf = scan.next().toUpperCase().charAt(0); // toUpperCase b�y�k harf demek ve () i�ine parametre almaz
	   
	   //Stringde harflerin indeksleri 0 dan ba�lar
	   // biz ilk harfi almak istedi�imiz i�in index olarak 0 girmeliyiz
	   
	   System.out.println("bas harfiniz : " + ilkHarf);	
	   
	   // e�er charAt(0) yazd�ktan sonra . koyarsak methodlar gelmez
	   // �unku charAt(0) methodu kullanilinca variable'imizi char yapmis oluruz
	   // char primitive data tipindedir ve
	   // primitive data tipleri method'lara sahip degildir
		
	
	   scan.close();
		
	}
	
	


}
