package Wrapper;

public class Data_Convertion {

	public static void main(String[] args) {

		int num = 123;
		String numstr = String.valueOf(num);
		System.out.println("The int to string " + 123 + numstr);

		double dou = Double.parseDouble(numstr);
		System.out.println("The string to double " + dou);

		int numint = Integer.parseInt(numstr);
		System.out.println("Double To Integer " + numint);

	}

}
