package day35_inheritance;

public class Memur extends Personel{
	
	public int maas;
	
	public Memur() {
		 super();      //  => consol c�kt�s� degismedi??
		System.out.println("Child class parametresiz consructor calisti");
	}
         /* inheritance da cons. olusturdugumuzda java n�n 
		 *  otomatik olarak cons'a koydugu super() keyword onemlidir. 
		 *
		 * super() keyword default cons. gibidir.Biz g�rmesekte yazmasakta cal�s�r.
		 * ancak yerine baska bir keyword yazarsak etkisiz hale gelir.
	     ***** extends varsa,yerine birsey yazmad�kca super() cal�s�r....*****
	     */
	
	     
	public static void main(String[] args) {
		
		Memur obj1 = new  Memur();
      /* java bu class � cal�st�rd�g�nda 
       * 1. olarak  12. sat�r cal�s�r.
		 2. memur obj1 .isim..args ya geli cons. g�r�r
		 3. olarak 7. sat�ra gider.
		 4.  olarak 8. sat�r cal�s�r.parent class taki parametresiz const. g�turur.
	       Super () keyword bizi parent  class taki cons a g�t�rdu 
	       ve consaoldaki ilk co�kt�y� yazd�rd�
	   */
	}
		public Memur(String isim, int sayi, int maas) {
			super(isim, sayi);
			
		}

}
