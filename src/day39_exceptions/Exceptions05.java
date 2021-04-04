package day39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
		
	 // null olarak tan�mlanm�� bir obje ile uygun olmayan bir islem yapmaya cal�st�g�m�zda 
	 // java NullPointerException verir.
     // Uncheckend except�on'd�r.
		
	String str1=" ";
	String str2="";
	String str3=null;  // null bir deger degildir.Sadece str3'un hicbirseye
	                   // esit olmad�g�n� s�yleyen isaretcidir. (pointer)
	
	System.out.println(str1.length());    // 1
	System.out.println(str2.length());    // 0
	// System.out.println(str3.length()); // NullPointerException
	
	System.out.println(str3+"bos");         // nullbos
	System.out.println(str3.concat("bos")); // NullPointerException
		
		
	}

}
