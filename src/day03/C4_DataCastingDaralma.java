package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		//double bir degisken olustural�m ve bunu �nt ve sonrada byte'a �evirin
		
		double numDouble=129.56;
		
		int numInt= (int) numDouble;   //  129
		
		//double den integer a gecerken eger say�da ondal�kl� b�l�m varsa
		// java ondal�kl� b�l�m� siler (yok sayar)
		
		System.out.println("integer degisken degeri : " + numInt);
		
		byte numByte= (byte) numInt;
		 // daha dar (narrow) bir data tipine �evirirken eger  data tipinin sinirindan b�y�kse saymaya
		 // negatif en k���k say�dan devam eder,istenen say�ya gelinceye kadar
		 //tekrar tekrar en k���k negatif say�ya gider
		
		System.out.println("byte degisken degeri : " + numByte);
		
		
		

	}

}
