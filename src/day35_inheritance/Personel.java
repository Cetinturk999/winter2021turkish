package day35_inheritance;



public class Personel {

	public String isim;
	public int sayi;
   

    public Personel(String isim, int sayi) {  // parametreli cons. olusturdum
		// super(); =>  ihtiyac�m�z yok ve sild�i�mizde cal�s�r
		/* java dan yard�m alarak bir cons. olusturdugumuzda, 
		 * java cons. ilk sat�r�na super keywordunu ekler.
		 * eger icinde oldugumuz clas bir char clas degilse super keyword u silinebilir.
		   bugune kadar olusturdugumuz consructurlarda super keywordu kullanmad�k.
		     anacak bixzim classlarimiz child class olmad�g�ndan sorun olmad�
		 */
    	
    	System.out.println("Personel parametresiz consructor cal��t�");
	}


	public Personel() {                       // parametresiz cons. olusturdum
	   // super();
		
		System.out.println("Personel parametreli consructor cal��t�");
    }
        
	    
	
    /* her class default constructor'a sahiptir.
      default consructor'un parametresi yoktur
      biz parametreli veya parametresiz bir consructor olusturdugumuzda
      defaul consructor silinir.
      eger biz sadece bir tane parametreli consructor olusturursak, Java default olan� sildi�i icin
      parametresiz cons. kalmaz.
      dolay�s�yla parametreli bir cons. olusturdugumuzda mutlaka de
      fault cons. yerine de bir parametresiz bir cons. olusturmam�z gerekir
    */
   
   

}
