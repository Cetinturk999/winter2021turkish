package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		// 
		
		Scope1 obj4= new Scope1();   // bu obje Scope1 class'ndan
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		
	    //	obj4.isim;   // olmad� nedeni: class i�inde sorun yok.class d�s�nda old i�in kimlerin ulasacag� s�ylenmeli.
		
		obj4.isim= "Ahmet";
		obj4.soyisim="Can"; 
		
		System.out.println(obj4.isim + " " + obj4.soyisim);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
