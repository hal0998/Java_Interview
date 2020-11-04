package Weekly_Testing;

import org.testng.annotations.Test;

public class Array_Testing {

	@Test
	public void Two_Dimentional_Array() {

		String[][] name = { { "Murat", "Muhtar", "Murzat" }, { "Elyar", "elham", "Enam" } };

		for (int row = 0; row < name.length; row++) {
			for (int col = 0; col < name[row].length; col++) {

				System.out.printf("%s", "The student name is " + name[row][col] + "\n");

				if (name[row][col].equals("elham")) {

					name[row][col] = "Elham";

				}

			}

		}
		

	}

}
