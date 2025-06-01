package Arrays;

public class Copyingarrays {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3};
		int[] array2 = new int[3];

		System.arraycopy(array1, 0, array2, 0, array1.length);
	}

}
