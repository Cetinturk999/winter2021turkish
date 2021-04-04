package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		
		// Java da saat ile islem yapmak icin 
		// LocalTime class'ýndan obje kullanýrýz
		
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);

		for (int i = 0; i < 1000000 ; i++) {
			i+=1;
		}
		
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2);
		System.out.println(saat);
		
	    System.out.println(saat.plusHours(15));
		
		System.out.println("...." + saat.getSecond());  // 39
		System.out.println(saat.minusSeconds(121233454));  // 17:58:47.395254200
		
		System.out.println(saat.now(ZoneId.of("Japan")));
		System.out.println(saat.now(ZoneId.of("America/Chicago")));
	}

}
