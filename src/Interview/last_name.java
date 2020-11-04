package Interview;

public class last_name extends name {

	public void last_name() {

		System.out.println("The last name class");
	}

	public static void main(String[] args) {

		name nm = new last_name();
		nm.last_name();

	}

}

class name {

	public void last_name() {

		System.out.println("The last name calss");
	}

}
