package day28_foreachloop1;

public class C1_ForEachLoop {

	public static void main(String[] args) {
		
		//
		
		int arr[]= {2,4,6,8,10,12};
		
		for (int i= 0; i < arr.length; i++) {  // Amac; Array'in butun elemanlar�ni tek tek Loop'a getirmek
			System.out.print(arr[i]+" ");
			
			}
			
	    // for loop yazmam�z�n amac� array'in tum elemanlar� uzerinde islem yapmak ise;
        // for each loop daha kolay for yazmam�z� saglar.
			
		// each ==> her bir demek
		// for each loop : istedi�im bir topluluktaki tum elemanlar� birer birer bana getirir.
		// for each loop'ta    baslang�c degeri YOKTUR,    biti� degeri YOKTUR ,    index YOKTUR.
		// art�� aral�k YOK
		// for each loop'ta; topluluk olacak ve tum elemanlarla tek tek islem yapacag�z
		
		System.out.println();  // gorevi cursor'u sat�ra indirmek
		
		for (int each : arr) {
			
			System.out.print(each + " ");
			
			
			
		}	
			
			
			
			
			
		
		
		
	}

}
