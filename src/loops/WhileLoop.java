package loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i + ": Even Number");
			} else {
				System.out.println(i + ": Odd Number");
			}
			i++;

		}

	}

}
