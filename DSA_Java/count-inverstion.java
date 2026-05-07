import java.util.*;


class count {

	static public int brute (int[] arr) { 

		// Time complexity - O(n^2)

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[j] < arr[i]) count++;

			}

		}

		return count;

	}

	public static void main(String args[]) {

		int[] arr = {5,3,2,1,4};

		int count = 0;

		System.out.println(brute(arr));

	}

}