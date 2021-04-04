package day39_exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Exceptions01 {

	public static void main(String[] args) {
		
		// Java ya bi dosyay� okumas�n� veya dosyaya yazmas�n� soyledi�imizde
		// Java "Ya dosyay� bulamazsam" der ve bizden c�zum uretmemizi ister
		// Dosya bulma ile ilgili turu : FileNotFoundException
		// Java kodu yazar yazmaz burada ki ols� problemi g�rur CTE verir.
		// Kodumuzu yazd�g�m�z anda ortaya c�kan bu tur exceptions'lara Checked (kontrol edilebilir) Exceptions denir.
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\fatmanur\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();   // tum hata ac�klamalar�n� yazd�r�r ama kodumuz bloke olmaz
		    System.out.println(e.getMessage());  // daha az hata ac�klamas� yazd�r�r
		}
		
		System.out.println("Kod bloke olmam�st�r");
		
		
		
	}

}
