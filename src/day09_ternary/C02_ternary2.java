package day09_ternary;

public class C02_ternary2 {

	public static void main(String[] args) {
		
		
		int y = 1;
		int z = 1; 
		
		
		int a = y<10 ? y++ : z++;  // 1<10  ==> T
		                           // 
		
		
		System.out.println(y + "," + z + "," + a);  // z=1 ,
		                                            // int a = y++  (y=1 + 1 = 2) �nce islem sonra art�rma post increment
		
		// y=2 
		
		
		System.out.println(y++); // post increment (�nce islem sonr art�r) y=3
		
		System.out.println(++y); // pre increment (�nce art�r sonra islem yap) y=4
		
		System.out.println(y);   
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
