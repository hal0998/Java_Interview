package Method_Over_Loading;

import org.testng.annotations.Test;

public class method_Overloading_SwapMethod {

	static String FIRST_NAME = "Halmurat";
	String LAST_NAME = "Muhtar";

	public static void main(String[] args) {

		String firstname = "Halmurat";
		String lastname = "Muhtar";
		FIRST_NAME = lastname;
		System.out.println("The Overwrite the global variable " + FIRST_NAME);
		
		
		
	String name=new method_Overloading_SwapMethod().LAST_NAME=firstname="MURAT";
	
	System.out.println("The Last name after overwrite is "+name+" "+firstname);
	
	}

	@Test
	public void Method_Testing() {
		String lastname = "Muhtar";

		FIRST_NAME = lastname;
		System.out.println("The value in Test is " + FIRST_NAME);
	}

	public void first_name() {

		System.out.println("The First Name Method");
	}

	public void last_name() {

		System.out.println("The Last Name Method");

	}

}
