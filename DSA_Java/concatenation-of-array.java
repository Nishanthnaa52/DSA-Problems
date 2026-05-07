import java.util.*;

class concatenation {

	public static void main(String args[]) {

		int[] arr = {1,2,1};

		int n = arr.length;

		int[] ans = new int[n*2];

		int index = 0;

		for (int i = 0; i < n*2; i++) {
			if (i < n) {
				ans[index++] = arr[i]; 
			} else {
				ans[index++] = arr[i - n];
			}
		}

		System.out.println(Arrays.toString(ans));

	}

}