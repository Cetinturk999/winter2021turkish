package day37_overriding;

public class GeciciIsci extends Isci {

	    public String calistigiBolum="Yemekhane";
	
	public static void main(String[] args) {
		
		// Overiding (gecersiz k�lma) : tamamen methodlarla ilgilidir
		// bir child class ta parent class tan miras al�nan method'u degistirmeye
		// overriding denir.
		
		GeciciIsci gi1 = new GeciciIsci();
		gi1.maasHesapla();
		System.out.println(gi1.maasHesapla());
		gi1.mesai(); // 
	
	}
    /*/farkli bir isim yapsam override yapmazsam parent sinifindan metod ve gecici siniftan
	//metod gozukur, birisi degistirebilir, yanlislikla isciye saat ucretini 15 ile carpabilir
	//boyle yaparak parent class daki metodu gecersiz kilarak onun kullanimini burada engelliyoruz*/
	
	// overriding yapmak icin parent class taki method signature'i ile 
	// child class ta method ismi olusturulur.
	// signature ayni oldugundan sadece body degisir.
	// boylece parent class taki method child class � icin gecersiz olur.
	//
    public int maasHesapla() {
    	
    	return 30*8*10;
    }

	@Override   // annotation
	public void mesai() {
		// super.mesai();
		// overrid edelim;
		System.out.println("Gecici isciler haftada 25 saat calisirlar");
	}
	
	// annotation (ac�klama/dipnot) :
	// 1) Java  32. sat�rda kodu inceleyenler icin bir ac�klama getiriyor.
	
	// annotation olmasi ile olmamas� aras�ndaki fark;
	// annotation sadece bir ac�klama degildir.
	// override yapt�g�m�z method u surekli kontrol eder ve
	// parent class taki overriden method signuture  degistirilirse CTE verir.
	
	
	// 2) eger override edilen parent calss taki method un (overriden => gecersiz k�l�nan)
	// cal�smas�n� istiyorsak overriding method a super. overriden method yazar�z
	// eger overriding method da super. yaz�lmazsa 
	// overriding method calismaz. 
	
	// Access Modifier
	// Child Parent i s�n�rland�ramaz
	// yani overriding methodun access modifier i overriden methodun access modifier indan
	// daha dar olamaz.kural� prent koyar.
	
	// return type 
    // overridden methodun return type � primitive ise overriding method un return type da ayn� olmal�
	// eger return type primitive degilse 
	// (overridden methodun return type'i) �S A (overriding methodun return type'i) olmal�d�r.
	
	// 
	
	
}     
