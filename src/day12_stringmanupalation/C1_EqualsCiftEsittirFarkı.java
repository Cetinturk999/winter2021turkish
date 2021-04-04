package day12_stringmanupalation;

public class C1_EqualsCiftEsittirFarkı {

	public static void main(String[] args) {


		String str1="Ali Can";
		
		String str2= str1 + "";   // Ali Can
		
		System.out.println(str1==str2);  // false
		                                 // == esit olmasını istiyorsak String'e objeye(Ali Can) ve adresine bakar
		                                 // str1 ve str2 adresler farklı oldugundan f verir
		
		// == Stringlerin hem degerlerine hem de adreslerine bakar
		// bu ornekte str1+"" yazdigimizda concatenation yapildigi icin Java yeni bir obje
		// olusturur ve islemin sonucunu yeni obje'nin icine koyar.
		// str1 ve str2 'yi == ile karsilastirirsak degerleri ayni fakat adresleri farkli oldugu icin 
		// false doner
		
		
		
		System.out.println(str1.equals(str2));  // true
		                                        // equals sadece String'lere bakar
		                                        // str1(Ali Can) ve str2 (Ali Can) 'ye bakar 
		
		// equals() methodu sadece String'lerin degerlerini karsilastirir
		// bu ornekte str1 ile str2 nin degerleri AYNI oldugu icin true dondurur
		
		
		
		
		String str3= "Ali Can";
		System.out.println(str1==str3);         // t
		System.out.println(str1.equals(str3));  // t
		
		
		// String str3 = str1;   // hersey aynı old için yeni bir obje olusturmuyor
		
		// System.out.println(str3==str1);         
		
		// System.out.println(str1.equals(str3));
		
		
		
		
		
		
	}

}
