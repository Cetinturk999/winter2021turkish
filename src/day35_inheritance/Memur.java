package day35_inheritance;

public class Memur extends Personel{
	
	public int maas;
	
	public Memur() {
		 super();      //  => consol cýktýsý degismedi??
		System.out.println("Child class parametresiz consructor calisti");
	}
         /* inheritance da cons. olusturdugumuzda java nýn 
		 *  otomatik olarak cons'a koydugu super() keyword onemlidir. 
		 *
		 * super() keyword default cons. gibidir.Biz görmesekte yazmasakta calýsýr.
		 * ancak yerine baska bir keyword yazarsak etkisiz hale gelir.
	     ***** extends varsa,yerine birsey yazmadýkca super() calýsýr....*****
	     */
	
	     
	public static void main(String[] args) {
		
		Memur obj1 = new  Memur();
      /* java bu class ý calýstýrdýgýnda 
       * 1. olarak  12. satýr calýsýr.
		 2. memur obj1 .isim..args ya geli cons. görür
		 3. olarak 7. satýra gider.
		 4.  olarak 8. satýr calýsýr.parent class taki parametresiz const. göturur.
	       Super () keyword bizi parent  class taki cons a götürdu 
	       ve consaoldaki ilk coýktýyý yazdýrdý
	   */
	}
		public Memur(String isim, int sayi, int maas) {
			super(isim, sayi);
			
		}

}
