package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modulus(%) operatoru bölme iþleminde kalaný verir
		// 15 tek mi cift mi ? 15/2 kalan=1 
	    // 25 uce bolunur mu ? 25/3 kalan=1 
		// herhangi bir sayinin 7 ile bolunebildigini kontrol etmek icin
		// modulus islemi kullaniriz 
				
		int kalan= 15 % 4 ;
		
		System.out.println(kalan); // 3
		
		System.out.println(26 % 8);  //2
		
		
		// 856'nýn birler basamaðý kaçtýr? 6
		
		int sayi=856;
		int birlerBasamagi = sayi % 10 ; 
		
        System.out.println("sayinin birler basamagi : " + birlerBasamagi);  // 6
		
		// 856 sayisinin 10'lar basamagi kactir
        
		// bunun icin buldugum birler basamagindan kurtulmam gerekiyor
		// birler basamagindan kurtulmak icin ise sayiyi 10'a boluyorum
		 
		sayi/=10; // 85
		System.out.println("10'a'a boldukten sonra sayinin degeri : " + sayi);  // 85
		
		int onlarBasamagi= sayi % 10;
		System.out.println("Onlar basamagi : " + onlarBasamagi);  // 5
		
		// yuzler basamagini bulmak icin bir kere daha ayni islemi( 10'a böl.) yapiyorum
		
	    sayi/=10; // bu satirla onlar basamagindan da kurtulurum
		 
		System.out.println("2.defa 10'a boldukten sonra " + sayi);  // 8
		 
	    int yuzlerBasamagi=sayi;
	    System.out.println(yuzlerBasamagi);
		 
	
		
		
		
	}

}
