package day09_ternary;

public class deneme2 {

	public static void main(String[] args) {
		
		 
		int y = 1;
		int z = 1; 
		
		int a = y<10 ? y++ : z++; 
		
		System.out.println(y + "," + z + "," + a);
		
		// y=2 
		
		System.out.println(y++);   // post inc. önce islem (2) sonra arttýr (2+1= 3)          2
	
		System.out.println(++y);   // y=3 ==> pre inc. önce artýr (3+1=4) sonra islem (y=4)   4
		
		System.out.println(y);     // y=4                                                     4
		
		
		
		
	}

}
