package day37_overriding;

public class Formen extends Isci{
    public String sorumluOlduguBolum="bakim";
    public String isim="Emrullah";
    
	public static void main(String[] args) {
		
        // Inheritance'da data turu olarak class ismi kullan�m�
	    // bir class ta obje uretirken data turu olarak class'�n kendisini
	    // veya parent(lar)�n� kullanabiliriz.
	    // olusturdugumuz obj ile variable kullanmam�z gerekirse hangi degeri alacag�n� anlamak icin
		// once data turu olan class a gideriz.orada arad�g�m�z variable varsa kullan�r yoksa parent(lar)�na bakar�z.
		// yukar� dogru giderken ilk buldugumuz degeri kullan�r�z.
		
		// minik bir degisiklik ile isci class'ina public String isim="Mesut" ekledik. Bu class'a da public String isim="Emrullah"; ekledim.
	    // Personel classinda hala Emre duruyor. fr3'e deger atamadim ama isim olarak ekrana Mesut yazdiriyor neden ?
	    // Cunku bir objeden variable'a gitmek istiyorsak once data turune bakariz.
		// Data turu olarak Isci old. icin oradaki atamayi yazdirir yani Mesut'u eger orada isim olmasa idi,
	    // parent class'a cikip bakacakti ve oradaki variable'i yazdiracakti.
		
		Formen fr1 = new Formen();
		// fr1 objesini kullanarak hangi class'lar�n variable'lerini kullanbilirim
		
		fr1.sorumluOlduguBolum="Marangozhane";  // . deyince g�rd�k,deger atayabliriz
	
	    fr1.maas =10000;    // �sci clas�ndan deger atad�k
	
	    System.out.println(fr1.isim + " " + fr1.sorumluOlduguBolum+" " + fr1.maas);
	    // Emre Marangozhane 10000
	    // isim icin fr21 �n data turu formen ve formen clas�na gideriz isim de Emeullah,isim yoksa isciye yoksa personele gideriz.
	    Isci fr2 = new Formen();  // �sci class�ndan obje olusturduk ama 
	                              //data turunden isci secildigi icin formen i g�remem.isci class � ve ustunu g�rebilirim
	    fr2.bolum="Kaynak atolyesi";  // fr2. deyince
	    // fr2.isim="Yakup";
	    // String str = "Seher";     => burada string data turu ama ayn� zamnda string javada class ismidir.
	    // fr2 icin i�ci class degil data turudur.
	    
	    // bir objeden variab a gideceksek data turunu bakar�z.data tru class ise classa gider isme bakar�z ve onu verir
	    
	    System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);  
	    // Yakup Kaynak atolyesi 5000
	    // Mesut Kaynak atolyesi 5000 oldu
	    
       Personel fr3 = new Formen();
       System.out.println(fr3.isim);  // Emre
	
	}

}
