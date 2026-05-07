import java.util.*;


class Dublicate {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String ValStr = input.nextLine();

		String[] ArrStr = ValStr.split(",");

		int[] num = new int[ArrStr.length];

		for (int i = 0; i < ArrStr.length; i++) {
			num[i] = Integer.parseInt(ArrStr[i].trim());
		}

		// The code logic of this problem.

		int n = num[0];
		int count = 1;

		for (int i = 0; i < ArrStr.length; i++) {

			if (num[i] > n) {

				count = count + 1;
				n = num[i];
			}
		}

		System.out.println(count);

		int[] ans = new int[count];

		for (int i = 0; i < ans.length; i++) {

			if (num[i] == 0) {
				ans[i] = i;
			}
			else {
				ans[i] = i+1;
			}
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}

