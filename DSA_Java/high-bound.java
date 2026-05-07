

class HighBound {

	// Time complexity - O(n)
	static int bruteforce (int[] arr, int x) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				return i;
			}
		}

		return arr.length;

	}

	static int Optimal (int[] arr, int x) {
		int low = 0;
		int high = arr.length;

		int ans = arr.length;	

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] > x) {
				ans = mid;
				high = mid - 1;
			} 
			else {
				low = mid + 1;
			}
		}

		return ans;
	}

	static int OptimalRecureionImplemention (int[] arr, int low, int high, int x) {

		if (low >= high) return arr.length;

		int mid = (low  + high) / 2;

		int ans = arr.length;

		if (arr[mid] > x) {
			ans = mid;

			int betterAns = OptimalRecureionImplemention(arr, low, mid - 1, x);

			return (betterAns == arr.length) ? ans : betterAns;
		}

		return OptimalRecureionImplemention(arr,mid + 1, high, x);

	}


	public static void main(String args[]) {

		int[] arr = {1,2,2,3};
		int x = 2;

		// System.out.println(Optimal(arr, x));

		int low = 0;
		int high = arr.length;

		System.out.println(OptimalRecureionImplemention(arr,low,high,x));

	}

}