package Java_Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Map_Collections {

	@Test
	public void Map_Test() {

		int insertionCount = 10;
		for (int count = 1; count <= insertionCount; count++) {
			
			String firstname = new Faker().name().firstName();
			String lastname = new Faker().name().lastName();

			Map<Integer, String> dataMap = new HashMap<Integer, String>();
			dataMap.put(count, firstname);

			Set<Integer> keyset = dataMap.keySet();
			
			Iterator<Integer> it=keyset.iterator();
			while(it.hasNext()) {
				
				System.out.println("The Key is : "+it.next());
				
			}
			
			
			for (int key : keyset) {

				System.out.println("The Customer First Name is : " + dataMap.get(key));

			}

			System.out.println("===================");
			Hashtable<Integer, String> datatable = new Hashtable<Integer, String>();

			datatable.put(count, lastname);

			Set<Integer> tableset = datatable.keySet();
			for (int key : tableset) {

				System.out.println("The Customer last name is : " + datatable.get(key));
			}
			System.out.println("=======================");
		}

	}

}
