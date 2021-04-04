package day37_overriding;

public class Isci extends Personel{

	public String bolum="Kaynak Atolyesi";
	public int maas=5000;
	public String isim="Mesut";
	
	
	
	public int maasHesapla() {
		return 30*8*15;     // 30 gün sayisi, 8 gunluk mesai, 15 saat ucreti
	}
	
	public void mesai() {
		System.out.println("Isciler gunluk 8 saat calýsýr");
	}
	
	// owerloading ; ayni isimde ama farkli method signature'larine sahip methodlar
	public int maasHesapla(int gunSayisi) {
		
		return gunSayisi*8*15;
	}
	
	public int maasHesapla(int gunukCalismaSaati,int gunSayisi) {
		
		return gunSayisi*gunukCalismaSaati*15;
	}
	public int maasHesapla(int gunukCalismaSaati,int gunSayisi,int saatUcreti) {
		
		return gunSayisi*gunukCalismaSaati*saatUcreti;
	}
}
