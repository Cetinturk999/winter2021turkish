package day35_inheritance;



public class Personel {

	public String isim;
	public int sayi;
   

    public Personel(String isim, int sayi) {  // parametreli cons. olusturdum
		// super(); =>  ihtiyacýmýz yok ve sildðiðmizde calýsýr
		/* java dan yardým alarak bir cons. olusturdugumuzda, 
		 * java cons. ilk satýrýna super keywordunu ekler.
		 * eger icinde oldugumuz clas bir char clas degilse super keyword u silinebilir.
		   bugune kadar olusturdugumuz consructurlarda super keywordu kullanmadýk.
		     anacak bixzim classlarimiz child class olmadýgýndan sorun olmadý
		 */
    	
    	System.out.println("Personel parametresiz consructor calýþtý");
	}


	public Personel() {                       // parametresiz cons. olusturdum
	   // super();
		
		System.out.println("Personel parametreli consructor calýþtý");
    }
        
	    
	
    /* her class default constructor'a sahiptir.
      default consructor'un parametresi yoktur
      biz parametreli veya parametresiz bir consructor olusturdugumuzda
      defaul consructor silinir.
      eger biz sadece bir tane parametreli consructor olusturursak, Java default olaný sildiði icin
      parametresiz cons. kalmaz.
      dolayýsýyla parametreli bir cons. olusturdugumuzda mutlaka de
      fault cons. yerine de bir parametresiz bir cons. olusturmamýz gerekir
    */
   
   

}
