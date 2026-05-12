
class MinArr {

	static int bruteforce (int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

		}

		return min;
	}

	static int optimal (int[] arr) {

		int low = 0;
		int high = arr.length - 1;

		int ans = Integer.MAX_VALUE;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[low] <= arr[mid]) {
				ans = Math.min(ans, arr[low]);
				low = mid + 1;
			}
			else {
				ans = Math.min(ans, arr[mid]);
				high = mid - 1;
			}

		}

		return ans;

	}

	public static void main(String args[]) {

		//int[] arr = {4,5,6,7,0,1,2};

		int[] arr = {3,4,5,1,2};

		// System.out.println(bruteforce(arr));

		System.out.println(optimal(arr));
	}

}