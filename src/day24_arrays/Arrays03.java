package day24_arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		//  soru 2: verilen bir array in elemanlar�n� toplayan bir prog yazal�m
		
		int arr[]= {10,15,2,45,78};
		
		
		// 0+10=10 ,10+15=25 , 25+2=27, 27+45=72, 72+ 
		
		int toplam=0;   // local variabledir deger vermeden kullan�lamaz itiraz eder
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}
		
		System.out.println(toplam);          // 150
		
		// verilen array in toString methodu olmadan yanyana ve aralarinda bir bo�ukla yazd�ral�m
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");      // 10 15 2 45 78
		}
		
		
		
		
		
	}

}
