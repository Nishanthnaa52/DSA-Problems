

class Search {


	// Brute force approch 
	// Time complexity - O(n)
	int bruteForce(int[] arr, int x) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) return i;
		}

		return -1;

	}

	// optimal solution by using binary search.
	// Time complexity - O(log n);
	int optimal(int[] arr, int x) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] == x) return mid;

			if (arr[mid] >= arr[low]) {

				if (x >= arr[low] && x <= arr[mid]) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
			else {
				if (x >= arr[mid] && x <= arr[high]) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
 
		}

		return -1;
	}

	public static void main(String args[]) {

		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;

		Search sol = new Search();

		// System.out.println(sol.bruteForce(arr, target));

		System.out.println(sol.optimal(arr, target));

	}
}