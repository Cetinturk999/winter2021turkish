package day18_whileLoop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		
		// verilen sayinin asal olup olmad�g�n� bulan 
		// bir program yaz�n
		
		int sayi=50;
		String flag="Asal";    // flag;istedigimiz sart�n gerceklesip gerceklesmedi�ini kontrol eder
		
		int bolen=2;
		
		while (bolen<sayi) {
			
			if (sayi%bolen==0) {
				flag="Asal sayi degil";           
			}        
			bolen++; // art�s yazmazsak sonsuz a gider
		}
		
		System.out.println(flag);
		
		
	}

}
