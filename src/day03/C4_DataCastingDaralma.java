package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		//double bir degisken olusturalım ve bunu ınt ve sonrada byte'a çevirin
		
		double numDouble=129.56;
		
		int numInt= (int) numDouble;   //  129
		
		//double den integer a gecerken eger sayıda ondalıklı bölüm varsa
		// java ondalıklı bölümü siler (yok sayar)
		
		System.out.println("integer degisken degeri : " + numInt);
		
		byte numByte= (byte) numInt;
		 // daha dar (narrow) bir data tipine çevirirken eger  data tipinin sinirindan büyükse saymaya
		 // negatif en küçük sayıdan devam eder,istenen sayıya gelinceye kadar
		 //tekrar tekrar en küçük negatif sayıya gider
		
		System.out.println("byte degisken degeri : " + numByte);
		
		
		

	}

}
