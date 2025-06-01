package loops;

public class InnerOuterLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println("Printing Number " + i + "of" + j);
			}
		}
	}

}
