package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		
	
		StringBuilder sb1= new StringBuilder("Rumeysa");
		System.out.println(sb1);   // Rumeysa
		
	// append() => verilen SB sonuna istedi�imiz string degerlerini ekler
		
		sb1.append(" ").append("Cetinturk");
		System.out.println(sb1);   // Rumeysa Cetinturk
		
	// .append(sb1, 0, 0) =>  verilen SB'in sonuna istedigimiz String degerlerini ekler
	// (6 dahil-inclusive , 10 haric-exclusive)
	    
		String cumle="Javay� cok sever";
		sb1.append(cumle, 6, 10);   
		System.out.println(sb1);   // Rumeysa Cetinturk cok
		
		System.out.println(sb1.length());   // 21
        System.out.println(sb1.capacity()); // 23  (7+16=23)
        
    // .charAt() => SB'in istedigimiz indexde olan karakterin bilgisini verir
        
        // sb1.charAt(1);
        System.out.println(sb1.charAt(1));  // u
        
        sb1.charAt(5);             // bize bilgi getiren methodlar SB'� degistirmez
        System.out.println(sb1);   // Rumeysa Cetinturk cok
        
        
    // .delete( , ) => SB'in istedigimiz index'leri arasindaki kismini siler
        
        sb1.delete(17, 21);
        System.out.println(sb1);   // Rumeysa Cetinturk
       
        sb1.deleteCharAt(16);
        System.out.println(sb1);   // Rumeysa Cetintur
        
     // .equals()
        
        String isim = "Rumeysa Cetintur";
        System.out.println(sb1.equals(isim));   // f
        
        // String ve String Builder ikiside obje olsada 
        // farkl� data tiplerine ait objelerdir.
        // degerleri ayn� olasada bakmaz ve iceri�in k�yaslanmas� m�mk�n degildir.
        
        // yeni bir StringBuilder olustural�m;
        
        StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur");
        
        System.out.println(sb1==sb2);           // f
        // new var objedir ve referanslar farkl�d�r f verir
        
        System.out.println(sb1.equals(sb2));    // f
        //StringBuilder'da equals() methodu String'den farkl� cal�s�r.
        // ancak ayn� obje(kendisi) ile k�yasland�g�nda true verir.
        // String'deki == gibi calisir.
        //   sb1.toString().equals(sb2.toString())    ==> cal�s�r.
        
        System.out.println(sb1.equals(sb1));       // t 
        
    // .indexOf()    =>   SB'da arama yapar
        
        System.out.println( sb1.indexOf("Cetin"));  // 8
        System.out.println(sb1.indexOf("e", 6));    // 6. index sonras� e'nin kac�nc� index'te old verir.
        
        System.out.println(sb1.indexOf("Kaz�m"));   // -1 arad�g�m�z String'i SB'de bulamazsa -1 dondurur
        
        
    // .insert( , ) => istedi�imiz index'ten itibaren istenen String'i ekler
        
        sb1.insert(7, " ");    
        System.out.println(sb1);      // Rumeysa  Cetintur
        
        cumle="Merhaba dunya";
        sb1.insert(0, cumle, 0, 8);   // sb1.(index, str, offset, len)
        //System.out.println("......" + sb1.insert(0, cumle, 0, 8));  // ......Merhaba Merhaba Rumeysa  Cetintur     
                                      // SB'da hangi index'ten itibaren eklenecek
                                      // cumle : hangi String'den eklenecek
                                      // 0 : cumlenin hangi index'inden baslanacak
                                      // 8 : biti� indexinden sonra kac karakter al�nacak
       
        sb1.insert(25, cumle, 8, 13);
        
        System.out.println("....." + sb1);      //Merhaba Rumeysa  Cetinturdunya
        
        
    //  .lastIndexOf(isim)  => en son nerede kullan�lm��
    // istenen Stringin kullan�ld�g� son index'i verir
        
        System.out.println(sb1.lastIndexOf("t"));       // 22 
        System.out.println(sb1.lastIndexOf("a", 22));   // 14
                                                        // 22'den �nceki son a'y� buluyor
        
    // .replace(start, end, isim)  => SB'�n baslang�c ve bitis index'leri aras�nda kism�
    // verilen String ile degistirir.
        
        sb1.replace(8, 16, "Seher"); 
        System.out.println(sb1);            // Merhaba Seher Cetinturdunya
      
    // .reverse() =>
        
        sb1.reverse();
        System.out.println(sb1);            // aynudrutniteC reheS abahreM
        
        sb1.reverse();
        
       
    //  .setCharAt(0, 0); => belli bir index ve bir arg�ment girece�iz
        
        sb1.setCharAt(10, 'k');   // atama yapmadan degitirdi cunku bu bir SB'd�r ve SB mutable'dir.
        System.out.println(sb1);  // Merhaba Seker Cetinturdunya
        
    // .subSequence(0, 0);  => SB'�n istedigimiz indexler aras�ndaki bolumu verir.
        
        System.out.println(sb1.subSequence(8, 13));  // Seker
        
    // .substring() =>  baslang�c index'i veriyoruz sonras�n� yazd�r�yor.
        
        System.out.println(sb1.substring(8));        //  Seker Cetinturdunya
       
        sb1.subSequence(8, 13);
        System.out.println(sb1);  // Merhaba Seker Cetinturdunya
        sb1.substring(8, 13);
        System.out.println(sb1);  // Merhaba Seker Cetinturdunya
        
    // .toString() => String'e cevirir.
        
        // iki farkl� obje olusturduk ama icerikleri ayn�;
        StringBuilder sb3=new StringBuilder("Java cok guzel");
        StringBuilder sb4=new StringBuilder("Java cok guzel");
        System.out.println(sb3.equals(sb4));    // false
        
        //iceriklerinin esit olup olmad�g�na bakmak icin String'deki equals meto'unu kullan�r�z
        
        System.out.println(sb3.toString().equals(sb4.toString()));  //   t
        
        // sb3 ve sb4'u string e cevirdik ve iki string equals ile kars�last�r�ld�g�nda
        // sadece iceri�ine bakar ve kal�c� olmaz.
        
        sb3.toString().concat("�nsan�n sevdikce sevesi geliyor");  // String class'�na ait methodlar
                                           // kullan�l�nca kal�c� degisiklik olmaz
        System.out.println(sb3);
        
        // toString() => methodu kullan�l�nca SB String'e donusmus olur
        // dolay�s�yla tum String methodlar� kullan�labilir
        System.out.println(sb3.toString().concat("�nsan�n sevdikce sevesi geliyor"));
        // Java cok guzel�nsan�n sevdikce sevesi geliyor
        
        System.out.println(sb1.length());   // 27
        System.out.println(sb1.capacity()); // 48
        sb1.trimToSize();   // SB icin haz�rlanan kapasitedeki fazlal�klar� siler 
                            // lenght() ile kapasiteyi esit duruma getirir.
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        
    // .compareTo() => tum karakterleri s�radan kontrol ederek gider
        
        System.out.println(sb3.compareTo(sb4));  // 0
        
        System.out.println("Ali okula gel".compareTo("Abi okula gel"));     //10
        
        // esit olmayan iki farkl� harf aras� fark (b-l = 10)
        
        System.out.println("Hasan".compareTo("Hakan"));  // 8
        
        // s ve k esit olmayan (s-k= 8) iki harf aras� fark
        
        System.out.println("Hakan".compareTo("Hasan"));  // -8
        
	}
}
