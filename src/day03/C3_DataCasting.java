package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		// byte veri t�r�nde bir de�i�ken olu�turup de�er atay�n
		//olu�turulan variable'i ad�m ad�m AUTO W�DEN�NG ile geni�letip yazd�r�n
		
		
		byte numByte= 34;
		
		System.out.println("byte deg�sken deger� :" + numByte);    // 34
		
		// short yapal�m
		
		short numShort = numByte;  //  short byte'dan buyuk oldugu icin Java sikayet etmiyor
		                           // Auto Widening ile degeri short variable'a atiyor
		                         
		System.out.println("short degisken degeri : " + numShort);   //  34
		
		int numInt = numShort;
		
		System.out.println("Integer degisken degeri : " + numInt);  //  34
		
		float numFloat = numInt;
		
		System.out.println("float degisken degeri : " + numFloat);   //   34.0
		
        double numDouble = numFloat;
		
		System.out.println("double degisken degeri : " + numDouble);   //  34.0
		
		
	}

}
