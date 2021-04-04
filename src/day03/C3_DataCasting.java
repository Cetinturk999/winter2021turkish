package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		// byte veri türünde bir deðiþken oluþturup deðer atayýn
		//oluþturulan variable'i adým adým AUTO WÝDENÝNG ile geniþletip yazdýrýn
		
		
		byte numByte= 34;
		
		System.out.println("byte degýsken degerý :" + numByte);    // 34
		
		// short yapalým
		
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
