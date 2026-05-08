import java.util.*;

class element {

	static int lowerBound (int[] arr, int x) {

		int low = 0;
		int high = arr.length;
		
		int ans = arr.length;

		while (low <= high) {

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

	static int  upperBound (int[] arr, int x) {
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

	static int[] BruteForce(int[] arr, int target) {

		int n = arr.length;

		int[] ans = {-1,-1};

		for (int i = 0; i < n; i++) {

			if(arr[i] == target && ans[0] == -1) {
				ans[0] = i;
			}
			if(arr[i] == target && ans[0] != -1) {
				ans[1] = i;
			}

		}
		return ans;

	}

	static int[] better (int[] arr, int target) {

		int[] ans = {-1,-1};

		int low = lowerBound(arr, target);

		if (low == arr.length || arr[low] != target) return ans;

		ans[0] = low;
		ans[1] = upperBound(arr, target) - 1;

		return ans;

	}

	public static void main(String args[]) {

		int[] arr = {5,7,7,8,8,8,8,10};

		int target = 8;

		System.out.println(Arrays.toString(better(arr,target)));

	}

}