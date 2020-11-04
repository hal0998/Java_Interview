package Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Array_Test {

	public static void main(String[] args) {

		int evennumber[] = { 2, 4, 6, 8, 10, 11 };
		int oddNumber[] = { 1, 3, 5, 7, 9 };

		int even = 0;
		int odd = 0;
		int num = 0;

		int[] mergedNum = new int[evennumber.length + oddNumber.length];

		while (even < evennumber.length && odd < oddNumber.length) {

			if (evennumber[even] < oddNumber[odd]) {

				mergedNum[num] = evennumber[even];
				even++;
				num++;
			} else {
				mergedNum[num] = oddNumber[odd];
				num++;
				odd++;
			}
		}

		while (odd < oddNumber.length) {
			mergedNum[num] = oddNumber[odd];
			num++;
			odd++;
		}

		while (even < evennumber.length) {
			mergedNum[num] = evennumber[even];
			num++;
			even++;

		}

		System.out.println("The merged Array " + Arrays.toString(mergedNum));

		for (int numb = 1; numb < 11; numb++) {

			for (int numa = 1; numa < numb; numa++) {
				System.out.print(numa);
			}
			System.out.println();
		}

		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] rev = new int[number.length];
		int arr = 0;

		for (int size = number.length - 1; size >= 0; size--) {

			rev[arr++] = number[size];

		}
		System.out.println("The reversed array : " + Arrays.toString(rev));

		int[] ages = { 12, 13, 14, 15, 15, 16, 18, 20, 19, 20 };

		Set<Integer> numSet = new HashSet<Integer>();

		for (int size = 0; size < ages.length; size++) {

			boolean duplicate = numSet.add(ages[size]);
			if (duplicate == false) {
				System.out.println("The duplicated Age is : " + ages[size]);
			}
		}

		int arrSize = numSet.size();
		Iterator it = numSet.iterator();
		List<Integer> agelist = new ArrayList<Integer>();

		while (it.hasNext()) {

			int ind = (int) it.next();
			System.out.println(ind);
			agelist.add(ind);

		}
		Object[] ageobj = agelist.toArray();
		Arrays.sort(ageobj);
		System.out.println(Arrays.toString(ageobj));

		for (int size = 0; size < ages.length; size++) {
			for (int size1 = size + 1; size1 < ages.length; size1++) {
				System.out
						.println("The Sum of " + ages[size] + " + " + ages[size1] + " = " + (ages[size] + ages[size1]));

			}

		}

		int index = 0;
		while (index < ages.length) {
			if (ages[index] % 2 == 0) {
				System.out.println(ages[index] + " is even Number");
			} else {
				System.out.println(ages[index] + " is odd Number");
			}
			index++;
		}

		int[] evenNum = { 2, 4, 6, 8 };
		int[] oddNum = { 1, 3, 5, 7 };
		int[] merdNum = new int[evenNum.length + oddNum.length];

		System.arraycopy(evenNum, 0, merdNum, 0, evenNum.length);
		System.arraycopy(oddNum, 0, merdNum, evenNum.length, oddNum.length);
		
		System.out.println("The Merged Num is Below :\n"+Arrays.toString(merdNum));

	}
}
