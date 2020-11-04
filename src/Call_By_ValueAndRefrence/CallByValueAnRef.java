package Call_By_ValueAndRefrence;

public class CallByValueAnRef {

	int amount = 42000;
	int month = 60;
	double rate = 3.99;

	public void intresr_RateByValue(int amount, int month, double rate) {

		System.out.println("The intrest rate for " + month + " month is : " + (rate / month) * amount);

	}

	public void intresr_RateByRef(CallByValueAnRef ref) {

		System.out.println("The intrest rate for " + month + " month is : " + (rate / month) * amount);

	}

	public static void main(String[] args) {

		new CallByValueAnRef().intresr_RateByValue(new CallByValueAnRef().amount, new CallByValueAnRef().month,
				new CallByValueAnRef().rate);

		new CallByValueAnRef().intresr_RateByRef(new CallByValueAnRef());

		String num = "123";

		int num1 = Integer.parseInt(num);
		String num2 = String.valueOf(num1);
		double num3 = Double.parseDouble(num2);
	}

}
