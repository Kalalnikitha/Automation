package Arrays;

import java.util.Arrays;

public class LargestNumInArray {

	public static void main(String[] args) {
		int arry[] = { 3, 7, 89, 67, 96 };
		// Sorting the array in ascending order
		Arrays.sort(arry);
		System.out.println("After sorting:" + Arrays.toString(arry));
		// Printing the length of the array
		System.out.println(arry.length);
		// Printing the index of the last element
		System.out.println(arry.length - 1);
		// // Printing the largest number in the array.(After sorting, the largest
		// number is at the last index)
		System.out.println("LargestNumber is:" + arry[arry.length - 1]);
	}

}
