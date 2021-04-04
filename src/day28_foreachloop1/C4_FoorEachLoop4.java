package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class C4_FoorEachLoop4 {

	public static void main(String[] args) {
		
		//iki String array olusturunuz ve
		//bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazdiriniz.
		//Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz 
		
		
		String arr1[] = {"Ali","Can","Ayse","Seher","Veli"};
		String arr2[] = {"Ali","Veli","Mesut","Seher","Sedat",};
		
		// Ortak elemanlarý koymak icin bir List olusturalým
		
		List <String> ortakElemanlar = new ArrayList<>();
		
		 // git arr1'deki her bir elemaný getir
		 // 2. ci for each'e git arr2'deki herbir elemaný getir diyecegiz
		 // ikisi esitse ortak elamanlara ekle
		
		for (String eachArr1 : arr1) {                
			for (String eachArr2 : arr2) {
				
				if(eachArr1.equals(eachArr2)) {
					ortakElemanlar.add(eachArr1);
		        }
				
	        }
	
		}
		
		 // ortak elemanlar listesi var
		 // liste dolu yada bos olabilir.
		
		if (ortakElemanlar.isEmpty()) {
			System.out.println("Ortak eleman yok");
		} else {
			System.out.println(ortakElemanlar);
		}
		
	}

}
