package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayAscending {

	public static void main(String[] args) {
		int arr[] = { 100, 300, 600, 760, 580 };
		System.out.println("Before sorting" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting " + Arrays.toString(arr));
	}

}
