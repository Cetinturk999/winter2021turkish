package day34_Inheritance;

public class Encapsulation {

	private String okulIsmi="Yýldýz Koleji";
	private int okulHesapNo=12345;
	private boolean okulAcikMi=true;
	
	
	// get() methodu ile görebilirler ama degistiremezler
	// okul ismini bana döndürecek ve return type String olmalý cunku okul ismi String 
	// yani data tipi ile ayný olmalý
	
	
	public String getOkulIsmi() {
		return okulIsmi;   
        // methodun okul ýsmini döndurmesini istiyoruz		
	}
	
	public int getOkulHesapNo() {
		return okulHesapNo;
		// grt methodu bana okul hesap no getirmeli
		
	}
	
	public boolean getOkulAcikMi() {
		return okulAcikMi;
		
	}
	
	public void setOkulIsmi(String okulIsmi) {
		// set methodu bize birsey dondurmeyecek o yuzden void olacak atama yapacak 
		// parametre atamalýyýz
		this.okulIsmi=okulIsmi;    
		// dýsarýdan gelen okul ismini bu class ismine atama yapar
		// obje uzerinden old icin bu clasdaki orjinal degeri degistirmiyor
		
	}
	
	public void setOkulHesapNo(int okulHesapNo) { // set met birsey dondurmeyecek o yuzden void yaptýk
	      this.okulHesapNo=okulHesapNo;
	}
	
	public void setOkulAcikMi(boolean okulAcikMi) {
		 this.okulAcikMi=okulAcikMi;
	}
		
  /*Tum variable'lar private ve sadece getter() methodlari olusturdum. 
	Bu tarz bir class'da datalar sadece okunabilir ama degistirilemez. 
	String'lerde degistirilemez yani immutable'dir .
	Bu tarz class'lara immutable class denir, yani Setter'i OLMAYAN classlara denir.
	*/
}
