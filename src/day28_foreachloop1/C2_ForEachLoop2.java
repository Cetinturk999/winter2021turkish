package day28_foreachloop1;

public class C2_ForEachLoop2 {

	public static void main(String[] args) {
		
		// Bir integer array olusturunuz ve
		// bu array’deki tum sayilarin carpimini
		// For-each loop kullanarak bulunuz.
		// Sonucu ekrana yazdiriniz.
		
		int arr[]= {1,2,1,2,4,3,1,2};
		int carpim=1;
		for (int each : arr) {       // array'a git her int degeri bana getir!
			carpim *= each;              
		}
		
		System.out.println("array'in tum elemanlarinin carpimi : " + carpim);
		
		
		
		System.out.println();
		
		
		int arr1[] = {2,3,4,5,6,1,7};
		int carpim1=1;
		
		for (int e : arr1) {
			carpim1*=e;
		}
		
		System.out.println("2.'ci liste elemanlarý carpimi : " + carpim1);
		
		
	}

}
