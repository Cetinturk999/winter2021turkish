package day37_overriding;

public class GeciciIsci extends Isci {

	    public String calistigiBolum="Yemekhane";
	
	public static void main(String[] args) {
		
		// Overiding (gecersiz kýlma) : tamamen methodlarla ilgilidir
		// bir child class ta parent class tan miras alýnan method'u degistirmeye
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
	// boylece parent class taki method child class ý icin gecersiz olur.
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
	
	// annotation (acýklama/dipnot) :
	// 1) Java  32. satýrda kodu inceleyenler icin bir acýklama getiriyor.
	
	// annotation olmasi ile olmamasý arasýndaki fark;
	// annotation sadece bir acýklama degildir.
	// override yaptýgýmýz method u surekli kontrol eder ve
	// parent class taki overriden method signuture  degistirilirse CTE verir.
	
	
	// 2) eger override edilen parent calss taki method un (overriden => gecersiz kýlýnan)
	// calýsmasýný istiyorsak overriding method a super. overriden method yazarýz
	// eger overriding method da super. yazýlmazsa 
	// overriding method calismaz. 
	
	// Access Modifier
	// Child Parent i sýnýrlandýramaz
	// yani overriding methodun access modifier i overriden methodun access modifier indan
	// daha dar olamaz.kuralý prent koyar.
	
	// return type 
    // overridden methodun return type ý primitive ise overriding method un return type da ayný olmalý
	// eger return type primitive degilse 
	// (overridden methodun return type'i) ÝS A (overriding methodun return type'i) olmalýdýr.
	
	// 
	
	
}     
