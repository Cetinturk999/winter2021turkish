package day09_ternary;

public class C02_ternary2 {

	public static void main(String[] args) {
		
		
		int y = 1;
		int z = 1; 
		
		
		int a = y<10 ? y++ : z++;  // 1<10  ==> T
		                           // 
		
		
		System.out.println(y + "," + z + "," + a);  // z=1 ,
		                                            // int a = y++  (y=1 + 1 = 2) önce islem sonra artýrma post increment
		
		// y=2 
		
		
		System.out.println(y++); // post increment (önce islem sonr artýr) y=3
		
		System.out.println(++y); // pre increment (önce artýr sonra islem yap) y=4
		
		System.out.println(y);   
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
