package Interview;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Concept {

	public static void main(String[] args) {

		Integer[] num = { 1, 4, 7, 9 };
		List arrayList = new ArrayList(Arrays.asList(num));

		int arraysize = arrayList.size();
		System.out.println(arraysize);

		for (int index = 0; index <= arraysize; index++) {

			/*
			 * this is for checking weather array size even or odd , and break the loop when
			 * it is reach to last index of arrayList
			 */

			if (index % 2 == 0 && index == arraysize) {

				int center = arraysize / 2;

				System.out.println("This is even size array, array size is  :  " + index);
//				System.out.println("The Array size is "+arraysize+" The center is : "+center);
				System.out.println("The Lefet center of even size array " + arrayList.get(center - 1));
				System.out.println("The right center of even size array " + arrayList.get(center));
				break;

			} else if (index % 2 != 0 && index == arraysize) {

				int center = arraysize / 2;

				System.out.println("This is odd size number, array size is  : " + index);
//				System.out.println("The Array size is "+arraysize+" The center is : "+center);
				System.out.println("The center of odd size array " + arrayList.get(center));
				break;
			}

		}

		int[] odd_number = { 1, 3, 5, 7, 9, 11 };
		int[] even_number = { 2, 4, 6, 8, 10 };

		int[] merged_number = new int[odd_number.length + even_number.length];

		int oddindex = 0;
		int evenindex = 0;
		int merindex = 0;

		while (oddindex < odd_number.length & evenindex < even_number.length) {

			if (odd_number[oddindex] < even_number[evenindex]) {

				merged_number[merindex] = odd_number[oddindex];
				merindex++;
				oddindex++;
				
			} else {

				merged_number[merindex] = even_number[evenindex];
				merindex++;
				evenindex++;

			}

		}

		while (evenindex < even_number.length) {

			merged_number[merindex] = even_number[evenindex];
			evenindex++;
			merindex++;

		}

		while (oddindex < odd_number.length) {

			merged_number[merindex] = odd_number[oddindex];
			merindex++;
			oddindex++;

		}
		

		System.out.println(Arrays.toString(merged_number));

	}

}
