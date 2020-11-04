package Interview;

import org.testng.annotations.Test;

public class PrimeNumber {

	@Test
	public void Prime_Num_Test() {

		int num = 12;
		boolean flag = false;

		for (int min = 2; min <= num / 2; min++) {

			if (num % min == 0) {

				flag = true;

			}

		}
		if (!flag)
			System.out.println(num + " is prime number!");

		else
			System.out.println(num + " is not prime number!");

	}

}
