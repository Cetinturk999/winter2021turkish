package day03;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		
		//kullanýcýdan ismini isteyip ilk harfini büyük harf olarak yazdýrýn
		//mehmet ==> baþharfiniz : M
		
		
	   Scanner scan =new Scanner(System.in);
	   System.out.println("Lütfen isminizi giriniz");
		
	   char ilkHarf = scan.next().toUpperCase().charAt(0); // toUpperCase büyük harf demek ve () içine parametre almaz
	   
	   //Stringde harflerin indeksleri 0 dan baþlar
	   // biz ilk harfi almak istediðimiz için index olarak 0 girmeliyiz
	   
	   System.out.println("bas harfiniz : " + ilkHarf);	
	   
	   // eðer charAt(0) yazdýktan sonra . koyarsak methodlar gelmez
	   // çunku charAt(0) methodu kullanilinca variable'imizi char yapmis oluruz
	   // char primitive data tipindedir ve
	   // primitive data tipleri method'lara sahip degildir
		
	
	   scan.close();
		
	}
	
	


}
