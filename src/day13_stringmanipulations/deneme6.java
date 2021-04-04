package day13_stringmanipulations;

public class deneme6 {

	public static void main(String[] args) {
		
	String str="Her ders Java gibi olsa";
	
	
	
	System.out.println(str.substring(10));  // 10. index a dahil ve sonrasý

	// System.out.println(str.substring(-10));	// son 1o harfi yazdýrmak icin -10 yazýlmaz rte verir
		                                    
	System.out.println(str.substring(str.length()-10));	// son 10 karakteri yazdýrmak için
                                                        //  "  gibi olsa"
	
	// ilk 10 karakteri almak icin 10 yazýlmalý	         // 23-10    
	
		
	System.out.println(str.substring(0, 10));	
	
	// 11. ci karakterden sonuna kadar yazdýr
	
	System.out.println(str.substring(10));
	
	
	
	
	
	// str'ýn ilk 10 harfini * ile gizleyin; geriye kalanlar normal yazýlsýn
	
	System.out.println("**********" + str.substring(10));    // ilk önce 10 karakteri alalým
		
	
	System.out.println(str.substring(10, 10));  
	
    //	System.out.println(str.substring(8, 7)); // rte
	
	System.out.println(str.substring(22));
	
	System.out.println(str.substring(23));
	
	//System.out.println(str.substring(24));// RTE verir
	
	
	
	
	
	// str'ýn ilk 10 harfini * ile gizleyin; geriye kalanlar normal yazýlsýn
	
	
	String str2=str.substring(0,10);  // str'nin ilk 10 harfini aldýk
	
	str2=str2.replaceAll("\\W", "a");
	System.out.println(str2);
	
	
	System.out.println(str2.replaceAll("\\w", "*")+ str.substring(10));
	
	
	
	
	
	
	
	
	
	
	
	}

}
