package day28_foreachloop1;

public class C1_ForEachLoop {

	public static void main(String[] args) {
		
		//
		
		int arr[]= {2,4,6,8,10,12};
		
		for (int i= 0; i < arr.length; i++) {  // Amac; Array'in butun elemanlarýni tek tek Loop'a getirmek
			System.out.print(arr[i]+" ");
			
			}
			
	    // for loop yazmamýzýn amacý array'in tum elemanlarý uzerinde islem yapmak ise;
        // for each loop daha kolay for yazmamýzý saglar.
			
		// each ==> her bir demek
		// for each loop : istediðim bir topluluktaki tum elemanlarý birer birer bana getirir.
		// for each loop'ta    baslangýc degeri YOKTUR,    bitiþ degeri YOKTUR ,    index YOKTUR.
		// artýþ aralýk YOK
		// for each loop'ta; topluluk olacak ve tum elemanlarla tek tek islem yapacagýz
		
		System.out.println();  // gorevi cursor'u satýra indirmek
		
		for (int each : arr) {
			
			System.out.print(each + " ");
			
			
			
		}	
			
			
			
			
			
		
		
		
	}

}
