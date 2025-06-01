package Arrays;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		int ar[] = { 20, 60, 58, 97, 124, 88 };
		Arrays.sort(ar);
		System.out.println("After sorting:" + Arrays.toString(ar));
// Printing the index of the last element
		System.out.println(ar[ar.length - 2]);
	}

}
