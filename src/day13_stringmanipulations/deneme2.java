package day13_stringmanipulations;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		
		String str="Java'yla hayat ne guzel";
		
		System.out.println(str.endsWith("zel"));
		
		System.out.println(str.endsWith("ne guzel"));
		
		System.out.println(str.endsWith("zel "));  // " " icine yaz�l�nca string olur ve stringlerde ayn� olmal�
		                                           // yani "zel" ile "zel " ayn� degil
		
		
		// kullan�c�dan bir email isteyin
		// eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		// eger @ isareti iceriyor ama @gmail.com icermiyorsa "Lutfen gmail adresi yaz�n"
		// eger ilk iki sarti sagl�yor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazs�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen mail adresinizi giriniz");
		
		String email=scan.next();
		
		if (!email.contains("@")) {
			System.out.println("Girdiginiz bilgi email degil");
		} else if(!email.contains("gmail")){
            System.out.println("Lutfen gmail adresi yaz�n");
		} else if(!email.endsWith("gmail.com")){
			System.out.println("Gecersiz email adresi");
		} else
		    System.out.println("Email'iniz basariyla kaydedildi");
		
	  
		//    b�ylede yap�labilir;
		
		
	    //	  if (!email.contains("@")) {
	    //		 System.out.println("Girdiginiz bilgi email degil");
		//		 System.out.println("Girdiginiz bilgi email degil");
		//	  } else if(!email.contains("gmail")){
		//       System.out.println("Lutfen gmail adresi yaz�n");
		//	  } else if(!email.endsWith("gmail.com")){
		//		 System.out.println("Gecersiz email adresi");
		//	  } else
		//	     System.out.println("Email'iniz basariyla kaydedildi");
		//	  } else if(!email.contains("gmail")){
		//        System.out.println("Lutfen gmail adresi yaz�n");
		//    } else if(email.endsWith("gmail.com")){
		//        System.out.println("Email'iniz basariyla kaydedildi");
        //    } else
	    //        System.out.println("Gecersiz email adresi");
		                                                             
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		

	}

}
