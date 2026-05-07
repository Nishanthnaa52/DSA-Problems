import java.util.*;

class Main {

	static int[] Inp() {

		Scanner input = new Scanner(System.in);

		String Valstr = input.nextLine();

		String[] ValArr = Valstr.split(",");

		int[] arr = new int[ValArr.length];

		for (int i = 0; i < ValArr.length; i++) {
			arr[i] = Integer.parseInt(ValArr[i].trim());
		}

		return arr;

	}

	public static void main(String args[]) {

		int[] arr = Inp();
		int k = 2;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}


		int l = -1;

		int[] num = new int[k+1];

		for (int i = 0; i < k; i++) {
			num[i] = arr[l];
			l = l - 1;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}