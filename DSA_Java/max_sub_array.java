import java.util.*;

class Maxsub {

	public static void main(String args[]) {

		// Geting a input

		Scanner input = new Scanner(System.in);

		String lineStr = input.nextLine();

		String[] Arrstr = lineStr.split(",");

		int[] arr = new int[Arrstr.length];

		for (int i = 0; i < Arrstr.length; i++) {
			arr[i] = Integer.parseInt(Arrstr[i]);
		}
		
		// Processing a input

		int max = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = 0;

			for (int j = i; j < arr.length; j++) {

				sum = sum + arr[j];

				if (sum > max) {
					max = sum;
				}
			}
		}

		System.out.println("The ans : " + max);


	}
}