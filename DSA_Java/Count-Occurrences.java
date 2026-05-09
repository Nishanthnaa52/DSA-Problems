

class countOccurr {

	int bruteForce (int[] arr, int x) {
		int n = arr.length;

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) count++;
		}

		return count;
	}

	


	public static void main(String args[]) {

		int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};

		int x = 3;

		countOccurr count = new countOccurr();

		System.out.println(count.bruteForce(arr,x));

	}

}