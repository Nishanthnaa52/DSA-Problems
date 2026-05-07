import java.util.*;

class lowerBound {

	static int BruteForce (int[] arr, int x) {

		for (int i = 0; i < arr.length; i++) {


			if (arr[i] >= x) {
				return i;
			}

		}

		return arr.length;
	}

	// recusion implemention.
	static int OptimalLowerBound (int[] arr, int left, int right, int x) {
		if (left >= right) return arr.length;

		int ans = arr.length;

		int mid = (left + right) / 2;

		if (arr[mid] >= x) {
			ans = mid;

			int betterAns = OptimalLowerBound(arr, left, mid - 1, x);

			return (betterAns == arr.length)? ans : betterAns;
		}

		return OptimalLowerBound(arr, mid + 1, right, x);
	}

	static int Optimal (int[] arr, int x) {

		int low = 0;
		int high = arr.length;
		
		int ans = arr.length;

		while (low < high) {

			int mid = (low + high) / 2;

			if (arr[mid] >= x) {
				ans = mid;
				high = mid - 1;
			}
			else {
				low  = mid + 1;
			}

		}

		return ans;

	}

	public static void main(String args[]) {

		int[] num = {1,3,5,6};
		int x = 2;

		// System.out.println(BruteForce(num,x));

		// int left = 0;
		// int right = num.length;

		// System.out.println(OptimalLowerBound(num,left,right,x));


		// Time complexity - O(log>base2 n)
		System.out.println(Optimal(num,x));

	}

}