package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C8_ImmutableSlaytOrnek {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("7");
		
		for(String s : list) {
			}
        System.out.println(list);   // [one, two, 7]
	}

}
