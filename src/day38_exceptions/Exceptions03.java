package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundaki e nin g?revi
		
		int sayi1=10;
		int sayi2=0;
		
		Exceptions01 exp = new Exceptions01();
		// 	
		try {
		System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
