package day30_dateTime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		
		// java da sadece tarih kullanmak istiyorsak
		// LocalDate class'ýndan bir obje uretiriz.
		
		LocalDate tarih = LocalDate.now();
		System.out.println(tarih);                // 2021-03-19  
		
		System.out.println(tarih.plusWeeks(20));  // 2021-08-0
		System.out.println(tarih.plusDays(500));  // 2022-08-01
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));    // 2024-08-31
		
		System.out.println(tarih.minusMonths(15)); // 2019-12-19
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); // 2017-11-09
		
		System.out.println(tarih.getDayOfYear());   // 78
		System.out.println(tarih.getMonthValue());  // 3
		System.out.println("...."+tarih.getDayOfMonth());
		
		LocalDate dogumGunu = LocalDate.of(1995, 10, 5);
		//System.out.println(dogumGunu.getDayOfWeek()); // THURSDAY
		
		System.out.println(tarih.getMonthValue());  // march
		
		System.out.println(tarih.isLeapYear());        // f
		
		// eger suan ki tarih ile degil de eski bir tarih ile islem yapacakasak;
		// LocakDat.of() methodu kullanýlýr
		
		LocalDate tarih1 = LocalDate.of(1995, 12, 15); // öncesi
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2));     // t
		System.out.println(tarih1.isBefore(tarih2));    // f
		
		System.out.println(tarih.getDayOfYear());
		
	}

}
