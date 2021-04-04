package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		
     /* Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
       - Method’da indirim uygulayip fiyati main method’da yazdirin
       - Method’lari arka arkaya cagirip dogru calistiklarini
         kontrol edin
	 */	
		
		double fiyat=100;
		
		// java method call'u gorunce java clone fiyat olusturur ve methoda clone fiyatý gönderir.
		
		System.out.println("%10 indirimli fiyat : " + indirimUygula10(fiyat));   // clone fiyat olusturulur ve clone fiyat methoda gider
		System.out.println("%20 indirimli fiyat : " + indirimUygula20(fiyat));   // degeri 100 olan clone fiyat methodda ind girer  
		System.out.println("%25 indirimli fiyat : " + indirimUygula25(fiyat));   // indirimli fiyatlar; 90,80,75   ama buraya geldiðinde
		System.out.println("method call'dan sonra fiyat : " + fiyat);            // fiyat ; 100 olur
		
		// her methoda giden clone fiyat farklýdýr.
		// double fiyat;  kabul etmez farklýdýr cunku.
		//      ""       herbir method icine koysakta kabul etmez farklýdýr cunku.
		
		// datayý gözlemliyor onun value'suna uygun kopyasýný gönderiyor
		// kendi gitmiyor value sunu gönderiyor
	}

	public static double indirimUygula25(double fiyat) {  // double;fiyat bu local v.
		fiyat*=0.75;
		// double fiyat;  kabul etmez farklýdýr.24. satýr
		return fiyat;
	}

	public static double indirimUygula20(double fiyat) {  // double fiyat;bu local v.
		fiyat*=0.80;
		// double fiyat;  kabul etmez farklýdýr.24. satýr
		return fiyat;
	}

	public static double indirimUygula10(double fiyat) {   // double fiyat;bu local v.
		fiyat*=0.90;
		// double fiyat;  kabul etmez farklýdýr.24. satýr
		return fiyat;
	}

}
