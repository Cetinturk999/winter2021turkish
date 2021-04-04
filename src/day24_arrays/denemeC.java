package day24_arrays;

import java.util.Arrays;

public class denemeC {

	public static void main(String[] args) {
		
		String str = "Hava, bugun cok guzel olmalý.";
		
		String arr1[] = str.split(",");
		System.out.println(Arrays.toString(arr1));	// [Hava,  bugun cok guzel olmalý.]	
		
		String arr2[] = str.split(" ");
		System.out.println(Arrays.toString(arr2));  // [Hava,, bugun, cok, guzel, olmalý.]
		
		String arr3[] = str.split("");
		System.out.println(Arrays.toString(arr3)); 
		// [H, a, v, a, ,,  , b, u, g, u, n,  , c, o, k,  , g, u, z, e, l,  , o, l, m, a, l, ý, .]
	}

}
