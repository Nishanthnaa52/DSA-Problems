import java.util.*;

class Parity {

	public static void main(String args[]) {

		int[] arr = {1, 2, 3, 4};

		

		int [] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] % 2 != arr[j] % 2 ) {
					ans[i]++;
				} 
			}

		}


		System.out.println(Arrays.toString(ans));
	}

}