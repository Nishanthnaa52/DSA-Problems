import java.util.*;

class Learn {

	static int H;
	static int B;
	static boolean flag = true;

	// This Static block is run before the main function.
	static {

		Scanner input = new Scanner(System.in);

		H = input.nextInt();
		B = input.nextInt();

		if (H <= 0 || B <= 0) {
			flag = false;
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}

	}

	public static void main(String args[]) {

		if (flag) {
			int area = H * B;
			System.out.println(area);	
		}


	}

}