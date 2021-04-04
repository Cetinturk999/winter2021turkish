package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		// kullanýcýdan 4 basamaklý sayý alalým ve 
		// sayýnýn basamaklarýný ters sýrada yazdýralým  ( 52 ==> 25 )
		
		// bir sayýnýn basamaklarýný elde etmek için 2 iþlemi tekrar tekrar yaparýz
		// 1. ci iþlem en sondaki basamagý elde etmek
		// 2. ci iþlem en sondaki basamagý yok etmek
		// bu iþlem basamak sayýsý kadar devam eder.4 basamaklý ise 4 kez.
		// 4. kez yapýlan sayý son rakamdýr.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamkalarini bulmak icin 4 basamakli bir sayi giriniz");

		int sayi=scan.nextInt(); // bu satirdan itibaren elimizde 4 basamkli bir sayi var
		
		// 4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz 
		
		// 1.tekrar
		
		int birlerBas= sayi %10;  // 4 basamaklý sayý dediði için integer olacak
		sayi /= 10;
		
		// bu satirdan itibaren sayimiz 3 basamakli oldu
		// onlar basamagini bulmak icin 2. Tekrar
		
		int onlarBas = sayi % 10 ;
		sayi/=10 ;
		
		// bu satirdan itibaren sayimiz 2 basamakli
		// 3.Tekrar
		
		int yuzlerBas= sayi%10;
		sayi/=10;
		
		// bu satirdan itibaren sayimiz 1 basmakli 
		int binlerBas=sayi % 10; // burada % islemi yapmak zorunda degiliz 
		                         
		// tum basamaklar var
		// tum basamaklari yazdiralim
		System.out.println("Birler basmagi : " + birlerBas);
		System.out.println("Onlar basmagi : " + onlarBas);
		System.out.println("Yuzler basmagi : " + yuzlerBas);
		System.out.println("Binler basmagi : " + binlerBas);
		
		
		// sayiyi tersten yazdiralim
		
		System.out.print( birlerBas);
		System.out.print( onlarBas);
		System.out.print( yuzlerBas);
		System.out.println( binlerBas);  // prntln önce print yapar sonra alt satýra geçer
		
		// System.out.println(); yukaridaki son print'i println yaparsam 
		// bu satira ihtiyac kalmaz
		
		// sayinin rakamlari toplamini bulalim
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas); 
		
		
		// rakamlari toplamini degil sayilari yanyana yazdirmak istersek
		System.out.println("Yazdiginiz sayinin tersten yazilisi : "+birlerBas+onlarBas+yuzlerBas+binlerBas);
		// "" yazarsak toplama deðil yan yana yazma iþlemi yapar
		
		scan.close();		
	}

}
