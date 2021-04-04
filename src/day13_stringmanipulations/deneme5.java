package day13_stringmanipulations;

public class deneme5 {

	public static void main(String[] args) {
		
		//
		
		String str= "Java ogren, mutlu ol, Java candýr 12345";
		
		System.out.println(str.replace("Java", "hava"));
		
		
		System.out.println(str.replaceAll("\\w", "*"));
		
		System.out.println(str.replaceAll("\\W", "*"));
		
		System.out.println(str.replaceAll("\\d", "."));
		
		System.out.println(str.replaceAll("\\D", "."));
		
		System.out.println(str.replaceAll("\\s", "&"));
		
		System.out.println(str.replaceAll("\\S", "&"));
		
		System.out.println(str.replaceAll("\\d", ""));
		
		
	}

}
