package loops;

public class Factorialnumber {

	public static void main(String[] args) {
		int number = 6;
        long factorial = 1; // Using long to handle larger results

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by i in each iteration
        }

        System.out.println("Factorial of " + number + " is " + factorial);
	}

}
