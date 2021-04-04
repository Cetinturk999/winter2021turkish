package day39_exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Exceptions01 {

	public static void main(String[] args) {
		
		// Java ya bi dosyayý okumasýný veya dosyaya yazmasýný soylediðimizde
		// Java "Ya dosyayý bulamazsam" der ve bizden cözum uretmemizi ister
		// Dosya bulma ile ilgili turu : FileNotFoundException
		// Java kodu yazar yazmaz burada ki olsý problemi görur CTE verir.
		// Kodumuzu yazdýgýmýz anda ortaya cýkan bu tur exceptions'lara Checked (kontrol edilebilir) Exceptions denir.
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\fatmanur\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();   // tum hata acýklamalarýný yazdýrýr ama kodumuz bloke olmaz
		    System.out.println(e.getMessage());  // daha az hata acýklamasý yazdýrýr
		}
		
		System.out.println("Kod bloke olmamýstýr");
		
		
		
	}

}
