package Interview;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.*;

public class Find_Duplicated {

	@Test
	public void find_Duplication() {

		String[] names = { "Murat", "Murzat", "Muhtar", "Muradil", "Mutallip", "Shahzada", "Murat", "muhtar" };
		int arrsize = names.length;

		Set<String> nameSet = new HashSet<String>();

		for (int index = 0; index < arrsize; index++) {

			if (nameSet.add(names[index]) == false) {

				System.out.println(names[index] + " is Duplicated element !");

			} else {

				System.out.println(names[index] + " is Not Duplicated element");

			}
		}

		for (int index = 0; index < arrsize; index++) {

			for (int index1 = index + 1; index1 < arrsize; index1++) {

				if (names[index].equalsIgnoreCase(names[index1])) {

					System.out.println(names[index] + " is duplicated element !");
				}
			}
		}

	}

}
