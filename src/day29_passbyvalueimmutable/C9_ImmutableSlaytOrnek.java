package day29_passbyvalueimmutable;

import java.util.ArrayList;

public class C9_ImmutableSlaytOrnek {

	public static void main(String[] args) {
		
		ArrayList<Integer> values = new ArrayList<>();
		
		values.add(4);
		values.add(5);
		values.set(1,6);
		values.remove(0);
		values.add(4);
		
		for (Integer v : values) {
			}
		
		System.out.println(values);  // [6, 4]
	}

}
