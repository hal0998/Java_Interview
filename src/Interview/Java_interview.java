package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Java_interview {

	@Test
	public void Interview_Practice() {

		Integer[] number = { 1, 2, 3, 4, 5, 6, 7 };
		String ind2 = String.valueOf(number[2]);
		System.out.println("The Value of ind 2 is : "+ind2);
		
		int ind = number[1];
		System.out.println(ind);

		List<Integer> numlist = new ArrayList<>(Arrays.asList(number));
//	     String num=  Arrays.toString(numlist.get(0));
//	     System.out.println(num);

		String[] name = { "firstname", "lastname", "Age" };
		List<String> numberlist = new ArrayList<>(Arrays.asList(name));

	}

}
