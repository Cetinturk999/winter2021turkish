package day08_ifelseifnestedif;

public class deneme2 {

	public static void main(String[] args) {
		
		// Nested : ic ice
		
		/*
		 Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
		 yazdiran bir java programi yaziniz
		 Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
		 calisan erkekse 65 yasindan buyukse emekli olabilir. 

		 */

		
		String cinsiyet="kadin";
		int yas=56;
		
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		} else if(cinsiyet.equalsIgnoreCase("erkek")&& yas>=65) {
			System.out.println("Emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("emekli olamazsin");
		} else if (cinsiyet.equalsIgnoreCase("kadin")&& yas>=60) {
			System.out.println("Emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("kadin")&& yas<60) {
			System.out.println("emekli olamazsin");
		} else {
			System.out.println("Cinsiyet veya yas tanimsiz");
		}	
		
		
		
		System.out.println("Nested if ile sonuc");
		
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {        // erkek olursa burası calisir
			if (yas<0) {
				System.out.println("erkek yas negatif olamaz");
			} else if(yas<65) {
				System.out.println("emekli olamazsin");
			} else {
				System.out.println("emekli olabilirsin");
			}
			
			
		} else if(cinsiyet.equalsIgnoreCase("Kadin")) {   // kadin olursa burasi calisir
			if (yas<0) {
				System.out.println("kadin yas negatif olamaz");
			} else if(yas<60) {
				System.out.println("Bu yastaki kadin emekli olamaz");
			} else {
				System.out.println("Bu yastaki kadin emekli olabilir");
			}
			
			

		} else {                                          // gecerli bir cinsiyet girilmediyse
			System.out.println("Yazdiginiz cinsiyet sisteme kayitli degildir");   
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}		
		
}