package day16_forLoop2;

public class C4_ForLoop4 {

	public static void main(String[] args) {

		// 50'den buyuk 150'den kucuk olan tamsay�lardan
		// 7 ile tam b�l�nebilenleri toplay�p
		// sonucu yazd�ran bir kod yaz�n�z

		int top = 0;

		for (int i = 51; i < 150; i++) {

			if (i % 7 == 0) {
				// toplam=toplam+i;
				top += i;
			}
		}

		System.out.println(top);

	}

}
