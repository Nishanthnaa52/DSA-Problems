import java.util.*;

class Ele{

	static int[] inputprocess() {

		Scanner input = new Scanner(System.in);

		String ValStr = input.nextLine();

		String[] ArrStr = ValStr.split(",");

		int[] num = new int[ArrStr.length];

		for (int i = 0; i < ArrStr.length; i++) {
			num[i] = Integer.parseInt(ArrStr[i].trim());
		}

		return num;
	}

	// Time complexity - O(n)
	static int larEle(int[] arr) {

		int lar = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (lar < arr[i]) {
				lar = arr[i];
			}
		}
		
		int seclar = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if ((lar > arr[i]) && (seclar < arr[i])) {
				seclar = arr[i];
			}
		}

		return seclar;
	}

	public static void main(String args[]) {

		int[] arr = inputprocess();

		System.out.println(larEle(arr));
	}
}