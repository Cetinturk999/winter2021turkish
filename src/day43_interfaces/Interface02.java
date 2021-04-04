package day43_interfaces;

public interface Interface02 {
	
	// soru su; Burada ki default ve static bizim bildiðimiz default mu static mi
	// cevap : HAYIR
	
	static void deneme() {
		System.out.println("default keyword lu method calýstý");
	}
	
	// bizim bildiðimiz default access modifier di
	// bir method'da birden fazla access modifier olur mu
	// bizim interface de olus tum method lar public ve abstracter dýr
	// interfaced e default keyword kullanarak concrete method olusturabiliriz
	// burada ki default keywor du access modifier degil 
	// Javanýn özel bir cözümüdür
	// burada ki basýna yazýldýgý methodun concrete oldugunu belirtir
	
	static void deneme2() {
		System.out.println("static keyword lu method calýsti");

	// yukarýda default keywor du icin yazdýklarýmýz static icin de gecerlidir.
    
	// static ve default keywor du kullanarak olusturdugumuz methodlar
	// override edilmek ZORUNDA DEGÝLDÝR
		
		
		
	}

}
