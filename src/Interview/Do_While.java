package Interview;

public class Do_While {

	public static void main(String[] args) {

		int in = 1;

		do {
			System.out.println("name\t" + in++);
		} while (in < 10);

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int num : numbers) {
			System.out.println("The Number in array is " + num);
		}

	}

}
