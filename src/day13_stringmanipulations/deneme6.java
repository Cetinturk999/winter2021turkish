package day13_stringmanipulations;

public class deneme6 {

	public static void main(String[] args) {
		
	String str="Her ders Java gibi olsa";
	
	
	
	System.out.println(str.substring(10));  // 10. index a dahil ve sonras�

	// System.out.println(str.substring(-10));	// son 1o harfi yazd�rmak icin -10 yaz�lmaz rte verir
		                                    
	System.out.println(str.substring(str.length()-10));	// son 10 karakteri yazd�rmak i�in
                                                        //  "  gibi olsa"
	
	// ilk 10 karakteri almak icin 10 yaz�lmal�	         // 23-10    
	
		
	System.out.println(str.substring(0, 10));	
	
	// 11. ci karakterden sonuna kadar yazd�r
	
	System.out.println(str.substring(10));
	
	
	
	
	
	// str'�n ilk 10 harfini * ile gizleyin; geriye kalanlar normal yaz�ls�n
	
	System.out.println("**********" + str.substring(10));    // ilk �nce 10 karakteri alal�m
		
	
	System.out.println(str.substring(10, 10));  
	
    //	System.out.println(str.substring(8, 7)); // rte
	
	System.out.println(str.substring(22));
	
	System.out.println(str.substring(23));
	
	//System.out.println(str.substring(24));// RTE verir
	
	
	
	
	
	// str'�n ilk 10 harfini * ile gizleyin; geriye kalanlar normal yaz�ls�n
	
	
	String str2=str.substring(0,10);  // str'nin ilk 10 harfini ald�k
	
	str2=str2.replaceAll("\\W", "a");
	System.out.println(str2);
	
	
	System.out.println(str2.replaceAll("\\w", "*")+ str.substring(10));
	
	
	
	
	
	
	
	
	
	
	
	}

}
