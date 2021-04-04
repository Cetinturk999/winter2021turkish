package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 = new Encapsulation();
		// obj1.getOkulIsmi() ne getirdiðini görmek icin syso icine yazdýk
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
 		System.out.println(obj1.getOkulAcikMi());  // boolean ifadelerin getter ý "is" 'dir.
		// get ile datalarý okuyoruz
 		
        obj1.setOkulIsmi("Mehmet Koleji");   // obj1 ýcýn okul ismini degistirdik
        // set methodu ile atayabiliyoruz
        // static olmayan variableler objeye baglýdýr.
        
        Encapsulation obj2 = new Encapsulation();
        System.out.println(obj2.getOkulIsmi());   // Yýldýz Koleji
        System.out.println(obj1.getOkulIsmi());   // Mehmet Koleji obj1 uzerinden islem yaptýgýmýz icin ve degisikliði dahil etti
        
        // encapsulatýon isimli class olusturduk
        // obj 1 olusturduk  
        // Yýldýz Koleji => obj1 uzerinden mehmet koleji atadýk ve sadece obj1 degisti
        // Hes no =>
        // okul acýk mý => 
        
        // obj2 olusturduk  (obj1 den ilk degerleri aldý ve obj1 uzerinde yapýlan degisiklikleri almaz)
        //  System.out.println(obj2.getOkulIsmi());  => Yýldýz Koleji verdi   
        //  System.out.println(obj1.getOkulIsmi());  =>  Mehmet Koleji
        
        
        
        
        
	}

}
