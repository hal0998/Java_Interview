package Weekly_Testing;

import org.testng.annotations.Test;

public class Two_dimentional_Array {

	@Test
	public void Two_dimentional_Array_Testing() {

		int[][] numarr = { { 1, 2, 3 },
				           { 4, 3, 2 },
				           };

		int sum = 0;

		for (int row = 0; row < numarr.length; row++) {

			for (int col = 0; col < numarr[row].length; col++) {

				for (int secrow = row + 1; secrow < numarr.length; secrow++) {

					for (int secol = 0; secol < numarr[row].length; secol++) {

						sum = sum + numarr[row][col] + numarr[secrow][secol];
						System.out.println(
								"The sum of " + numarr[row][col] + " and " + numarr[secrow][secol] + " is " + sum);
						sum = 0;
					}
				}
			}
		}

	}

}
