package day31_varargsstringbuilder;

public class C4_Varags03 {

	public static void main(String[] args) {
		
		
		
		/* 
		    * - Varargs tek method�a istedi�imiz kadar parametre yollayarak sonu� almamizi sa�lar.
		    *   Yani parametre say�miz de�i�ken ancak method�un 
		    *   yapaca�� i� sabitse Varargs kullanarak tek method�la kodumuzu yazabiliriz.
			* - Varargs ozellik olarak list gibi calisir (uzunlugu esnektir)
			*   fakat varargs�in arka planinda Java Array ile calisir.(List olarak degil)
			* - Varargs�i declare etmek icin data type�dan sonra ... kullaniriz. (int... sayi vb..)
			******** - Bir method�da varargs disinda parametre varsa varargs parametre olarak en sona yazilmalidir SOR
                (aksidurumda varargs nerede duracagini bilemez)
			* - Bir method�da sadece 1 varargs kullanilabilir
			*/
		
	
	// eger bir methodda varargs varsa en sonda olmal�	
		
	// verilen int'lardan ilki haric tum sayilari toplayin ve
	// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin
		
		
		toplacarp(4,6,8,9);
		toplacarp(4,7,2,8,5,9);
		toplacarp(1,2,3,4,4,6,8,9);
	}

	public static void toplacarp(int sayi,int sayi2, int...v) {
		System.out.println("varargs'a dahil olmayan argument: "+ sayi+","+sayi2);   
		int toplam=0;
		for (int each : v) {
			toplam+=each;
		}
		
		System.out.println(sayi*sayi2*toplam);
		}
	}
	
		
		
	

	