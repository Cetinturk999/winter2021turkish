package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// Conditional(      )
		
		// 2 tane  Conditional op vardýr;
		
		//  AND && , OR || 
		//  AND Op mükemmelliyetçidir .hepsi t ise t'dur.Biri bile F olsa sonuç f'dur.
		
		boolean isTrue= 5>4 && 7-8>0;  // T && T ==> T 
		                               // bircok t olsada bir tane f olursa f'tur.
		                               // mükemmelliyetçi
		
		System.out.println(isTrue);    // false
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0);  // true cunku hepside t
		
		System.out.println(x+y<0 && x-y>0);   // false cunku f && t => F
		                                      // Java F görünce geriye bakmaz ve F yazar
		
		// OR  ||    ise operatörü optimisttir.
	    // Verilen karsýlaþtýrmalardan bir tanesi bile T ise sonuç T'dur.
	    // t=1 , f=0 ise + islemi gibi dusunulebilir.
		
		System.out.println(x<y || x*y>0);  //  F ve T ==> True
		
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
