package day03;

public class C6_IncrementDecrement {

	public static void main(String[] args) {
		
		int number=10;
		
        // bir variable'nin de�erini art�rmak i�in 3 yontem kullan�l�r
		
        // 1. ci yontem
		
		number = number + 5;
		
		// 2. ci yontem
		
		   number += 8;
		
		// 3.c� yontem sadece 1 art�rmak i�in
		
		   number++;  // ++ aras�nda bo�luk b�rak�lmaz
		
		//bu y�ntemler top islemine has degildir.tum operatorler icin kullan�l�r.
		// onemli:  3. yont sadece top ve c�karma islemi icin gecerlidir.
		
		// number'� 6 eksilt      
		    number -=6;            // not.-= aras�nda bo�luk b�rak�lmaz
		    
		// number'� ikiye bol
		    number /=2;
		    
	    // number'� 3'le carpin
		    number *=3;
		    
		//number'� 1 eksilt
		    number --;
		
		
	
	}

}
