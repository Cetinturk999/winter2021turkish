package day13_stringmanipulations;


public class C3_StartWithIsEmpty {

	public static void main(String[] args) {
		
		String str= "Her gun Java olsa";
		
		System.out.println(str.startsWith("H"));  // t
		
		System.out.println(str.startsWith("Her "));  // t
		
		System.out.println(str.startsWith("g", 4));   // t
		
		System.out.println(str.startsWith("Java", 7));  // f
		
		System.out.println(str.isEmpty());  // f
		
		String str2="";
		System.out.println(str2.isEmpty());  // t
		
		String str3=null;   // str3'un hicbirseye esit olmadýgýný gosteren pointer(isaret)'dir. 
		
	    System.out.println(str3.isEmpty());  // RTE
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
