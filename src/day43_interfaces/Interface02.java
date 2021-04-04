package day43_interfaces;

public interface Interface02 {
	
	// soru su; Burada ki default ve static bizim bildi�imiz default mu static mi
	// cevap : HAYIR
	
	static void deneme() {
		System.out.println("default keyword lu method cal�st�");
	}
	
	// bizim bildi�imiz default access modifier di
	// bir method'da birden fazla access modifier olur mu
	// bizim interface de olus tum method lar public ve abstracter d�r
	// interfaced e default keyword kullanarak concrete method olusturabiliriz
	// burada ki default keywor du access modifier degil 
	// Javan�n �zel bir c�z�m�d�r
	// burada ki bas�na yaz�ld�g� methodun concrete oldugunu belirtir
	
	static void deneme2() {
		System.out.println("static keyword lu method cal�sti");

	// yukar�da default keywor du icin yazd�klar�m�z static icin de gecerlidir.
    
	// static ve default keywor du kullanarak olusturdugumuz methodlar
	// override edilmek ZORUNDA DEG�LD�R
		
		
		
	}

}
