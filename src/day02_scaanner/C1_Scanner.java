package day02_scaanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// scanner ile kullan�c�dan bilgi alabiliriz.
		// 3 ad�mda scanner i�lmini ger�ekle�tiriyoruz
		
		// 1.Ad�m : Scanner Objesi Olu�turaca��z
		
		Scanner scan = new Scanner(System.in);  
		
		// new:yeni Javada ne zaman new kelimesini g�r�rsek yeni obje olu�turuluyordur.
		// parantezin i�ine yaz�lanlara parametreler diyoruz ve scanner i�in System.in yazmam�z gerekir.
		// bir kod yazd���m�zda kodun alt�nda k�rm�z� �izgi olu�uyorsa veya sat�r numaras�
		// olan k�s�mda k�rm�z� x olu�uyorsa bir�eyler yanl�� demektir.
		// java.util java n�n bizim i�in haz�rlad��� k�t�phanedir.ihtiyac�m�z oldu�unda ihtiyac�m�z olan kodlar�
		// clas'a import etmemiz yeterlidir.
		// scan olu�turdugumuz Scanner objesine verdigimiz isimdir.farkl� isimler de verebiliriz ancak
		// scan ismi t�m programc�lar taraf�ndan kullan�lan bir isimdir.
		// kodumuzun anla��labilir ve rahat okunabilir olmas� i�in scan ismini kullanmam�z tavsiye edilir
		
		
		// 2.Ad�m : kullan�c�ya bir mesaj yaz�n.ne istedi�imizi s�ylemeliyiz
		
		 System.out.println("Karenin bir kenar uzunlu�unu girin");
		 

		 // 3. Ad�m : kullan�c�n�n konsola girdi�i de�eri program�m�za alaca��z
		 // ve bir variable olu�turup bu de�eri atayaca��z
		 // kullan�c�dan bir kenar uz istedi�im i�in kullan�c� say�da girebilir b�y�k bir
		 // say�da yazabilir.tam say� yada virg�ll� say�da yazabilir.
		 
		 
		 double kenar=scan.nextDouble();
		 
		 
		 System.out.println("girdi�iniz kenar uzunlu�una sahip karenin alan� ="+kenar*kenar);
		 //5,2 *5,2 =27.04
		
		
		scan.close();
		
	}

}
