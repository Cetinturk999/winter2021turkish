package day03;

public class C6_IncrementDecrement {

	public static void main(String[] args) {
		
		int number=10;
		
        // bir variable'nin değerini artırmak için 3 yontem kullanılır
		
        // 1. ci yontem
		
		number = number + 5;
		
		// 2. ci yontem
		
		   number += 8;
		
		// 3.cü yontem sadece 1 artırmak için
		
		   number++;  // ++ arasında boşluk bırakılmaz
		
		//bu yöntemler top islemine has degildir.tum operatorler icin kullanılır.
		// onemli:  3. yont sadece top ve cıkarma islemi icin gecerlidir.
		
		// number'ı 6 eksilt      
		    number -=6;            // not.-= arasında boşluk bırakılmaz
		    
		// number'ı ikiye bol
		    number /=2;
		    
	    // number'ı 3'le carpin
		    number *=3;
		    
		//number'ı 1 eksilt
		    number --;
		
		
	
	}

}
