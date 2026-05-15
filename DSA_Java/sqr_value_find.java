
class sqr {

	static int bruteforce(int n){
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if ((long)i * i <= n){
				ans = i;
			}else {
				break;
			}
		}

		return ans;
	}

	static int optimal(int n) {

		int low = 0;
		int high = n;

		int ans = 0;

		while (low <= high) {

			int mid = (low + high) / 2;

			if ((long)mid * mid <= n) {
				ans = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}

		}

		return ans;

	}

	public static void main(String args[]) {

		int n = 10;

		System.out.println(optimal(n));

	}

}