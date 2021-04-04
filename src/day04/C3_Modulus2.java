package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		// kullan�c�dan 4 basamakl� say� alal�m ve 
		// say�n�n basamaklar�n� ters s�rada yazd�ral�m  ( 52 ==> 25 )
		
		// bir say�n�n basamaklar�n� elde etmek i�in 2 i�lemi tekrar tekrar yapar�z
		// 1. ci i�lem en sondaki basamag� elde etmek
		// 2. ci i�lem en sondaki basamag� yok etmek
		// bu i�lem basamak say�s� kadar devam eder.4 basamakl� ise 4 kez.
		// 4. kez yap�lan say� son rakamd�r.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamkalarini bulmak icin 4 basamakli bir sayi giriniz");

		int sayi=scan.nextInt(); // bu satirdan itibaren elimizde 4 basamkli bir sayi var
		
		// 4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz 
		
		// 1.tekrar
		
		int birlerBas= sayi %10;  // 4 basamakl� say� dedi�i i�in integer olacak
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
		System.out.println( binlerBas);  // prntln �nce print yapar sonra alt sat�ra ge�er
		
		// System.out.println(); yukaridaki son print'i println yaparsam 
		// bu satira ihtiyac kalmaz
		
		// sayinin rakamlari toplamini bulalim
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas); 
		
		
		// rakamlari toplamini degil sayilari yanyana yazdirmak istersek
		System.out.println("Yazdiginiz sayinin tersten yazilisi : "+birlerBas+onlarBas+yuzlerBas+binlerBas);
		// "" yazarsak toplama de�il yan yana yazma i�lemi yapar
		
		scan.close();		
	}

}
