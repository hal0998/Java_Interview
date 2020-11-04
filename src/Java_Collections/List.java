package Java_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class List {

	@Test
	public void Array_Testing() {

		Set<String> id = new HashSet<String>();

		id.add("sas4344342tdskj");

		Iterator<String> windowId = id.iterator();

		while (windowId.hasNext()) {

			System.out.println(windowId.next());

		}

	}

}
