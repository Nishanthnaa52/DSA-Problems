import java.util.*;

class nthNum {

	static int bruteforce(int n, int m) {

		for (int i = 0; i <= m; i++) {
			long power = (long) Math.pow(i,n);

			if (power == m) return i;

			if (power > m) break;
		}

		return -1;

	}

	static int optimal(int n, int m) {

		int low = 0;
		int high = m;


		while(low <= high) {

			int mid = (low + high) / 2;

			long power = (long)Math.pow(mid,n);

			if (power == m) return mid;

			if (power < m) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}

		}

		return -1;

	}

	public static void main(String args[]) {

		// int n = 3;
		// int m = 27;

		// System.out.println(optimal(n,m));

		 // Format: {n (root), m (number), expected_output}
	    int[][] testCases = {
	        {3, 27, 3},       // Standard cube root (3^3 = 27)
	        {4, 16, 2},       // Standard 4th root (2^4 = 16)
	        {2, 100, 10},     // Square root (10^2 = 100)
	        {5, 1, 1},        // 1 raised to any power is 1
	        {3, 0, 0},        // 0 raised to any power is 0
	        {3, 26, -1},      // Imperfect root (returns -1)
	        {2, 50, -1}       // Imperfect root (returns -1)
	    };

	    int passed = 0;
	    for (int i = 0; i < testCases.length; i++) {
	        int n = testCases[i][0];
	        int m = testCases[i][1];
	        int expected = testCases[i][2];
	        int actual = optimal(n, m);

	        if (actual == expected) {
	            System.out.println("Test " + (i + 1) + " PASSED");
	            passed++;
	        } else {
	            System.out.println("Test " + (i + 1) + " FAILED! Input: n=" + n + ", m=" + m + 
	                               " | Expected: " + expected + " | Got: " + actual);
	        }
	    }
	    System.out.println("\nTotal Passed: " + passed + "/" + testCases.length);

	}

}