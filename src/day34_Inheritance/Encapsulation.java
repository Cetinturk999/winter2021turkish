package day34_Inheritance;

public class Encapsulation {

	private String okulIsmi="Y�ld�z Koleji";
	private int okulHesapNo=12345;
	private boolean okulAcikMi=true;
	
	
	// get() methodu ile g�rebilirler ama degistiremezler
	// okul ismini bana d�nd�recek ve return type String olmal� cunku okul ismi String 
	// yani data tipi ile ayn� olmal�
	
	
	public String getOkulIsmi() {
		return okulIsmi;   
        // methodun okul �smini d�ndurmesini istiyoruz		
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
		// parametre atamal�y�z
		this.okulIsmi=okulIsmi;    
		// d�sar�dan gelen okul ismini bu class ismine atama yapar
		// obje uzerinden old icin bu clasdaki orjinal degeri degistirmiyor
		
	}
	
	public void setOkulHesapNo(int okulHesapNo) { // set met birsey dondurmeyecek o yuzden void yapt�k
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
