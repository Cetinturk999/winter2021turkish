package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// Conditional(      )
		
		// 2 tane  Conditional op vard�r;
		
		//  AND && , OR || 
		//  AND Op m�kemmelliyet�idir .hepsi t ise t'dur.Biri bile F olsa sonu� f'dur.
		
		boolean isTrue= 5>4 && 7-8>0;  // T && T ==> T 
		                               // bircok t olsada bir tane f olursa f'tur.
		                               // m�kemmelliyet�i
		
		System.out.println(isTrue);    // false
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0);  // true cunku hepside t
		
		System.out.println(x+y<0 && x-y>0);   // false cunku f && t => F
		                                      // Java F g�r�nce geriye bakmaz ve F yazar
		
		// OR  ||    ise operat�r� optimisttir.
	    // Verilen kars�la�t�rmalardan bir tanesi bile T ise sonu� T'dur.
	    // t=1 , f=0 ise + islemi gibi dusunulebilir.
		
		System.out.println(x<y || x*y>0);  //  F ve T ==> True
		
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
