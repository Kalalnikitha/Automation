package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {

	public static void main(String[] args) {
		Integer arr[] = { 100, 300, 600, 760, 580 };
		System.out.println("Before sorting" + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("After sorting" + Arrays.toString(arr));
	}

}
