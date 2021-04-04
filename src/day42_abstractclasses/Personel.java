package day42_abstractclasses;

public abstract class Personel {
	
	// bir class'i abstract yapmak icin class keyword'unden once 
	// abstract yazmak yeterlidir.
	
	// abstract bir class'in icinde variable olabilir mi ?
	// olabilir
	
	
	public String isim= "Yasin";
	
	// variable'lar abstarct olur mu
	// olmaz...
	// public abstract int sayi=10;
	
	// abstract class'ý tum cncrete child'lari abstract class'taki 
	// tum dinamik özellikleriyanimethotlarý 
	// override etmek zorundadýr.
	
	// bir method abstrarct olabilir mi ve nasýl yapýlaýr?
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	// bir abscratch methodda concrete method yazýlabilir mi?
	//   "    "          "    abstracth ve concrete methodlar olabilir
    // concrete child class'lar abstract method'lari override ETMEK ZORUNDADIR ama
	// concrete methodlari override etmek istege baglidir.
	
	public void ozelSigorta() {
		System.out.println("bu personel ozel sigorta kapsamýndadýr");
		
		
		
		
		
	}
	
	

}
