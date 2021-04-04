package day02_scaanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// scanner ile kullanýcýdan bilgi alabiliriz.
		// 3 adýmda scanner iþlmini gerçekleþtiriyoruz
		
		// 1.Adým : Scanner Objesi Oluþturacaðýz
		
		Scanner scan = new Scanner(System.in);  
		
		// new:yeni Javada ne zaman new kelimesini görürsek yeni obje oluþturuluyordur.
		// parantezin içine yazýlanlara parametreler diyoruz ve scanner için System.in yazmamýz gerekir.
		// bir kod yazdýðýmýzda kodun altýnda kýrmýzý çizgi oluþuyorsa veya satýr numarasý
		// olan kýsýmda kýrmýzý x oluþuyorsa birþeyler yanlýþ demektir.
		// java.util java nýn bizim için hazýrladýðý kütüphanedir.ihtiyacýmýz olduðunda ihtiyacýmýz olan kodlarý
		// clas'a import etmemiz yeterlidir.
		// scan oluþturdugumuz Scanner objesine verdigimiz isimdir.farklý isimler de verebiliriz ancak
		// scan ismi tüm programcýlar tarafýndan kullanýlan bir isimdir.
		// kodumuzun anlaþýlabilir ve rahat okunabilir olmasý için scan ismini kullanmamýz tavsiye edilir
		
		
		// 2.Adým : kullanýcýya bir mesaj yazýn.ne istediðimizi söylemeliyiz
		
		 System.out.println("Karenin bir kenar uzunluðunu girin");
		 

		 // 3. Adým : kullanýcýnýn konsola girdiði deðeri programýmýza alacaðýz
		 // ve bir variable oluþturup bu deðeri atayacaðýz
		 // kullanýcýdan bir kenar uz istediðim için kullanýcý sayýda girebilir büyük bir
		 // sayýda yazabilir.tam sayý yada virgüllü sayýda yazabilir.
		 
		 
		 double kenar=scan.nextDouble();
		 
		 
		 System.out.println("girdiðiniz kenar uzunluðuna sahip karenin alaný ="+kenar*kenar);
		 //5,2 *5,2 =27.04
		
		
		scan.close();
		
	}

}
