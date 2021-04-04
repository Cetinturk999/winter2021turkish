package day40_exceptions;

import day40_exceptions.Exceptions01.InvalidEmailIdCheckedException;

public class Exceptions02 {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		String email="rasit@hotmail.com";
		
		mailDogrula(email) ;

	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		
		if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println("mailiniz basariyla kaydedildi");
		} else {
			//throw new InvalidEmailIdCheckedException("email uygun degil");
		}
		
	}

}