package Interview;

import java.util.Arrays;

public class Java_Array_Concept {

	public static void main(String[] args) {

		int[][] num = new int[2][3];

		// first row
		num[0][0] = 00;
		num[0][1] = 01;
		num[0][2] = 02;

		// second row
		num[1][0] = 10;
		num[1][1] = 11;
		num[1][2] = 12;

		System.out.println(Arrays.deepToString(num));

		String[][] charset = new String[3][3];

		charset[0][0] = "A1";
		charset[0][1] = "B1";
		charset[0][2] = "C1";

		charset[1][0] = "A2";
		charset[1][1] = "B2";
		charset[1][2] = "C2";

		charset[2][0] = "A3";
		charset[2][1] = "B3";
		charset[2][2] = "C3";

		int totalRow = charset.length;
		int totalColumn = charset[0].length;
		int totalCell = totalRow * totalColumn;

		System.out.println("The available cell in array is : " + totalCell);
		System.out.println("All value in array is belwo \n" + Arrays.deepToString(charset) + "\n");
		for (int row = 0; row < totalRow; row++) {

			for (int col = 0; col < charset[row].length; col++) {

				String value = charset[row][col];
				System.out.println("The Row : " + row + " Column : " + col + " value is : " + value);

			}

		}

		int[][] numarray = new int[4][4];

		numarray[0][0] = 1;
		numarray[0][1] = 2;
		numarray[0][2] = 3;

		numarray[1][0] = 4;
		numarray[1][1] = 5;
		numarray[1][2] = 6;

		numarray[2][0] = 7;
		numarray[2][1] = 8;
		numarray[2][2] = 9;

		System.out.println("The intial values of array is below \n" + Arrays.deepToString(numarray));

		int sumofrow = 0;
		int rowindex = 0;

		for (int row = 0; row < numarray.length; row++) { // extract the value row by row

			for (int col = 0; col < numarray[row].length; col++) {

				if (rowindex <= row) { // array row index focus on single line
					
					sumofrow += numarray[row][col];
					rowindex = row;

					if (rowindex == row && col == numarray[0].length - 1) { // storing the row summary to the last
																			// column in the same row
						if (row + 1 != numarray.length) { // save last row as empty

							numarray[row][numarray[0].length - 1] = sumofrow;
//							System.out.println("The Row sum is " + sumofrow);
							sumofrow = 0; // return sum of row to 0

						}
					}
				}
			}
		}

		int sumofcolumn = 0;
		int colindex = 0;

		for (int col = 0; col < numarray[0].length; col++) {

			for (int row = 0; row < numarray.length - 1; row++) {

				if (row < numarray.length - 1) {

					sumofcolumn = sumofcolumn + numarray[row][col];
					colindex = col;

					if (colindex == col && row == numarray.length - 2) {

//						System.out.println("The Row : " + row + " Column : " + col + " value is " + numarray[row][col]
//								+ " The sum is " + sumofcolumn);

						numarray[numarray.length - 1][col] = sumofcolumn;
						sumofcolumn = 0;

					}
				}
			}

		}

		System.out.println(Arrays.deepToString(numarray));

	}

}
