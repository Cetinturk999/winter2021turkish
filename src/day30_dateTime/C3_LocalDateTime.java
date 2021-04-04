package day30_dateTime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		
		// 
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);             // 2021-03-19T22:04:55.124152600
		
		System.out.println(ldt.toString());  // 2021-03-19T22:06:10.884931
		
        String time =ldt.toString();  // java yeni string olusturacak
		                              // time. dendiðinde string methodlarý cýkacak
		
        System.out.println(time.startsWith("2021"));    // t         
		
	}

}
