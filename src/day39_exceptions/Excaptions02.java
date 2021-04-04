package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excaptions02 {

	public static void main(String[] args) {
		/*eger kodumuzu yazd�g�m�zda birden fazla except�on'la ili�kli durum olusuyorsa
		 * ic ice try catch bloklar� olusturabiliriz.
		 * bu �rnekye ilk once dosyay� okutmak istedik
		 * Java  "ya dosyay� bulamazsam"  diye  bizden yard�m istedi
		 * biz de  try catch blogu �le F�leNotExcept�on ile handle etmesine yard�mc� olduk.
		 * Sonra dosyadakileri yaz�lar� okumaya cal�st�k ve Java yeniden  "Ya dosyaya� okuyamazsam" diye yard�m istedi
		 * Bizde try catch blogu ile IOException ile handle etmesini saglad�k
		 */
		
		// ASCII kodlarinda -1 olmadigi icin,-1  esit degilse cal�s(true) anlaminda -1'e esitledim . Hala sikayet var ustune gel
		// Surrond with try catch yap . Bunun sebebi nedir ? Bir once ki exception turumuz FileNotFoundException'idi (Ya evde yoksa).
		// Dosyayi bulduk ama okuyamiyorsak exception aliyorsak o durumlar icin bunu yapiyoruz .
		// System.out.print(k); boyle oldugu zaman File icinde yazilanlarin ASCII degerlerini veriyor normal degerleri yazdirmak icin;
		// System.out.print((char) k); yazarsak ASCII degil normal yazilanlari veriyor.
		
		/* Nested try catch var. Disarda olan Dosya bulunamazsa diyeydi, FileNotFoundException. 
		* Dosyayi buldu diyelim simdi icerideki try catch'e bakacagim burada ise Dosyayi Okuyamazsam durumuna bakiyorum, IOException.
		* FileNotFoundException is-A IOException iliskisi var . Eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum
		* olusuyorsa, nested try-catch bloklari olusturabiliriz. Bu ornekte ilk once dosyayi okutmak istedik,
		* Java, "Ya dosyayi bulamazsam ? " diye bizden yardim istedi . Biz de try-catch blogu ile FileNOTDounfException ile 
		* handle etmesinde yardimci olduk. Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam"
		* diye yardim istedi, biz de try-catch blogu ile IOException ile handle etmesini sagladik.
		*/ 
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\fatmanur\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		    
			int k=0;
		    try {
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) {  // dosyalarla ilgili genel yazma ve okuma sorunlar� ile handle eder
				
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {  //
			
		   
			System.out.println(e.getMessage());  
		}
		System.out.println("");
		System.out.println("Kod bloke olmam�st�r");
		
	}

}
