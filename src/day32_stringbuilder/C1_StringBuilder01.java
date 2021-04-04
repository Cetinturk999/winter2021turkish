package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		
	
		StringBuilder sb1= new StringBuilder("Rumeysa");
		System.out.println(sb1);   // Rumeysa
		
	// append() => verilen SB sonuna istediğimiz string degerlerini ekler
		
		sb1.append(" ").append("Cetinturk");
		System.out.println(sb1);   // Rumeysa Cetinturk
		
	// .append(sb1, 0, 0) =>  verilen SB'in sonuna istedigimiz String degerlerini ekler
	// (6 dahil-inclusive , 10 haric-exclusive)
	    
		String cumle="Javayı cok sever";
		sb1.append(cumle, 6, 10);   
		System.out.println(sb1);   // Rumeysa Cetinturk cok
		
		System.out.println(sb1.length());   // 21
        System.out.println(sb1.capacity()); // 23  (7+16=23)
        
    // .charAt() => SB'in istedigimiz indexde olan karakterin bilgisini verir
        
        // sb1.charAt(1);
        System.out.println(sb1.charAt(1));  // u
        
        sb1.charAt(5);             // bize bilgi getiren methodlar SB'ı degistirmez
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
        // farklı data tiplerine ait objelerdir.
        // degerleri aynı olasada bakmaz ve iceriğin kıyaslanması mümkün degildir.
        
        // yeni bir StringBuilder olusturalım;
        
        StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur");
        
        System.out.println(sb1==sb2);           // f
        // new var objedir ve referanslar farklıdır f verir
        
        System.out.println(sb1.equals(sb2));    // f
        //StringBuilder'da equals() methodu String'den farklı calısır.
        // ancak aynı obje(kendisi) ile kıyaslandıgında true verir.
        // String'deki == gibi calisir.
        //   sb1.toString().equals(sb2.toString())    ==> calısır.
        
        System.out.println(sb1.equals(sb1));       // t 
        
    // .indexOf()    =>   SB'da arama yapar
        
        System.out.println( sb1.indexOf("Cetin"));  // 8
        System.out.println(sb1.indexOf("e", 6));    // 6. index sonrası e'nin kacıncı index'te old verir.
        
        System.out.println(sb1.indexOf("Kazım"));   // -1 aradıgımız String'i SB'de bulamazsa -1 dondurur
        
        
    // .insert( , ) => istediğimiz index'ten itibaren istenen String'i ekler
        
        sb1.insert(7, " ");    
        System.out.println(sb1);      // Rumeysa  Cetintur
        
        cumle="Merhaba dunya";
        sb1.insert(0, cumle, 0, 8);   // sb1.(index, str, offset, len)
        //System.out.println("......" + sb1.insert(0, cumle, 0, 8));  // ......Merhaba Merhaba Rumeysa  Cetintur     
                                      // SB'da hangi index'ten itibaren eklenecek
                                      // cumle : hangi String'den eklenecek
                                      // 0 : cumlenin hangi index'inden baslanacak
                                      // 8 : bitiş indexinden sonra kac karakter alınacak
       
        sb1.insert(25, cumle, 8, 13);
        
        System.out.println("....." + sb1);      //Merhaba Rumeysa  Cetinturdunya
        
        
    //  .lastIndexOf(isim)  => en son nerede kullanılmış
    // istenen Stringin kullanıldıgı son index'i verir
        
        System.out.println(sb1.lastIndexOf("t"));       // 22 
        System.out.println(sb1.lastIndexOf("a", 22));   // 14
                                                        // 22'den önceki son a'yı buluyor
        
    // .replace(start, end, isim)  => SB'ın baslangıc ve bitis index'leri arasında kismı
    // verilen String ile degistirir.
        
        sb1.replace(8, 16, "Seher"); 
        System.out.println(sb1);            // Merhaba Seher Cetinturdunya
      
    // .reverse() =>
        
        sb1.reverse();
        System.out.println(sb1);            // aynudrutniteC reheS abahreM
        
        sb1.reverse();
        
       
    //  .setCharAt(0, 0); => belli bir index ve bir argüment gireceğiz
        
        sb1.setCharAt(10, 'k');   // atama yapmadan degitirdi cunku bu bir SB'dır ve SB mutable'dir.
        System.out.println(sb1);  // Merhaba Seker Cetinturdunya
        
    // .subSequence(0, 0);  => SB'ın istedigimiz indexler arasındaki bolumu verir.
        
        System.out.println(sb1.subSequence(8, 13));  // Seker
        
    // .substring() =>  baslangıc index'i veriyoruz sonrasını yazdırıyor.
        
        System.out.println(sb1.substring(8));        //  Seker Cetinturdunya
       
        sb1.subSequence(8, 13);
        System.out.println(sb1);  // Merhaba Seker Cetinturdunya
        sb1.substring(8, 13);
        System.out.println(sb1);  // Merhaba Seker Cetinturdunya
        
    // .toString() => String'e cevirir.
        
        // iki farklı obje olusturduk ama icerikleri aynı;
        StringBuilder sb3=new StringBuilder("Java cok guzel");
        StringBuilder sb4=new StringBuilder("Java cok guzel");
        System.out.println(sb3.equals(sb4));    // false
        
        //iceriklerinin esit olup olmadıgına bakmak icin String'deki equals meto'unu kullanırız
        
        System.out.println(sb3.toString().equals(sb4.toString()));  //   t
        
        // sb3 ve sb4'u string e cevirdik ve iki string equals ile karsılastırıldıgında
        // sadece iceriğine bakar ve kalıcı olmaz.
        
        sb3.toString().concat("ınsanın sevdikce sevesi geliyor");  // String class'ına ait methodlar
                                           // kullanılınca kalıcı degisiklik olmaz
        System.out.println(sb3);
        
        // toString() => methodu kullanılınca SB String'e donusmus olur
        // dolayısıyla tum String methodları kullanılabilir
        System.out.println(sb3.toString().concat("ınsanın sevdikce sevesi geliyor"));
        // Java cok guzelınsanın sevdikce sevesi geliyor
        
        System.out.println(sb1.length());   // 27
        System.out.println(sb1.capacity()); // 48
        sb1.trimToSize();   // SB icin hazırlanan kapasitedeki fazlalıkları siler 
                            // lenght() ile kapasiteyi esit duruma getirir.
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        
    // .compareTo() => tum karakterleri sıradan kontrol ederek gider
        
        System.out.println(sb3.compareTo(sb4));  // 0
        
        System.out.println("Ali okula gel".compareTo("Abi okula gel"));     //10
        
        // esit olmayan iki farklı harf arası fark (b-l = 10)
        
        System.out.println("Hasan".compareTo("Hakan"));  // 8
        
        // s ve k esit olmayan (s-k= 8) iki harf arası fark
        
        System.out.println("Hakan".compareTo("Hasan"));  // -8
        
	}
}
