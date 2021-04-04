package day13_stringmanipulations;

public class deneme3 {

	public static void main(String[] args) {
		
		String str="Her gun java olsa";
		
		System.out.println(str.startsWith("H"));

		System.out.println(str.startsWith("He "));
		
		System.out.println(str.startsWith("g", 4));
		
		System.out.println(str.startsWith("Java", 7));  // f
		
		System.out.println(str.startsWith(" ", 7));    // t
		
		System.out.println(!str.startsWith("Java", 4));  // t
		
		System.out.println(str.startsWith("Java", 7));   // f
		
		
		// isemty örnekleri;
		
		System.out.println(str.isEmpty());
		
		String str2="";
		
		System.out.println(str2.isEmpty()); //  t
		
	//	String str3=null;
		
	//	System.out.println(str3.isEmpty());   // RTE
		
		
	}

}
