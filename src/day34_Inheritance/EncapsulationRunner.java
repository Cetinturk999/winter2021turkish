package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 = new Encapsulation();
		// obj1.getOkulIsmi() ne getirdi�ini g�rmek icin syso icine yazd�k
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
 		System.out.println(obj1.getOkulAcikMi());  // boolean ifadelerin getter � "is" 'dir.
		// get ile datalar� okuyoruz
 		
        obj1.setOkulIsmi("Mehmet Koleji");   // obj1 �c�n okul ismini degistirdik
        // set methodu ile atayabiliyoruz
        // static olmayan variableler objeye bagl�d�r.
        
        Encapsulation obj2 = new Encapsulation();
        System.out.println(obj2.getOkulIsmi());   // Y�ld�z Koleji
        System.out.println(obj1.getOkulIsmi());   // Mehmet Koleji obj1 uzerinden islem yapt�g�m�z icin ve degisikli�i dahil etti
        
        // encapsulat�on isimli class olusturduk
        // obj 1 olusturduk  
        // Y�ld�z Koleji => obj1 uzerinden mehmet koleji atad�k ve sadece obj1 degisti
        // Hes no =>
        // okul ac�k m� => 
        
        // obj2 olusturduk  (obj1 den ilk degerleri ald� ve obj1 uzerinde yap�lan degisiklikleri almaz)
        //  System.out.println(obj2.getOkulIsmi());  => Y�ld�z Koleji verdi   
        //  System.out.println(obj1.getOkulIsmi());  =>  Mehmet Koleji
        
        
        
        
        
	}

}
