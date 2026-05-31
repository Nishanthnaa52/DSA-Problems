import java.util.*;


class findMat {


	static int bruteforce(int[][] mat) {

		int m = mat.length;
		int n = mat[0].length;
		int ansCount = 0;
		int ans = -1;
		for (int i = 0; i < m; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 1) {
					count++;
				}
			}
			
			if (ansCount < count) {
				ans = i;
				ansCount = count;
			}
		}

		return ans;
	}
 	
 	static int optimal(int[][] mat) {
 		int m = mat.length;
 		int ans = -1;
 		int preCount = 0;
 		for (int i = 0; i < m; i++) {
 			int count = binarySearch(mat[i], 1);
 			
 			if (count > preCount) {
 				ans = i; 
 				preCount = count;
 			}
 		}
 		return ans;
 	}

 	static int binarySearch(int[] arr, int x) {
 		int n = arr.length;
 		int low = 0;
		int high = arr.length;
		
		int ans = 0;

		while (low < high) {

			int mid = (low + high) / 2;

			if (arr[mid] >= x) {
				ans = n - mid;
				high = mid - 1;
			}
			else {
				low  = mid + 1;
			}

		}

		return ans;
 	}

	public static void main(String args[]) {
		int[][] mat = {{0,0,0}, {0,0,0},{0,0,0}};

		System.out.println(optimal(mat));
	}

}