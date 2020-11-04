package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Increamental_Testing {

	public static void main(String[] args) {

		int[] onum = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] evnum = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] merarr = new int[onum.length + evnum.length];

//		System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(onum, 0, merarr, 0, onum.length);
		System.arraycopy(evnum, 0, merarr, onum.length, evnum.length);

		System.out.println(Arrays.toString(merarr));

		Set<String> name = new HashSet<String>();

		name.add("alim");
		name.add("Murat");

		for (String na : name) {

			System.out.println(na);
		}

		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "muart");
		map.put("age", "21");

		Set<String> allkey = map.keySet();

		for (String key : allkey) {

			System.out.println("The key is : " + key + ", The value is : " + map.get(key));

		}
		
		

	}

}
