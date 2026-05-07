import java.util.*;

class typeOfCode {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		// Convert Int --> String.
		String numStr = String.valueOf(num);

		if (numStr instanceof String) {
			System.out.println("Good job");
		}
		else {
			System.out.println("Wrong answer");
		}

	}

}