package day18_whileLoop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		
		// verilen sayinin asal olup olmadýgýný bulan 
		// bir program yazýn
		
		int sayi=50;
		String flag="Asal";    // flag;istedigimiz sartýn gerceklesip gerceklesmediðini kontrol eder
		
		int bolen=2;
		
		while (bolen<sayi) {
			
			if (sayi%bolen==0) {
				flag="Asal sayi degil";           
			}        
			bolen++; // artýs yazmazsak sonsuz a gider
		}
		
		System.out.println(flag);
		
		
	}

}
