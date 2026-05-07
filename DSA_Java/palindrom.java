

class palindrom {

	public static void main(String args[]) {
		int x = 121;
		int ans = 0;
		int dop = x;
		while (x > 0) {
			int digit = x % 10;
			ans = ans * 10 + digit;
			x = x / 10;
		}

		System.out.println(ans == dop);
	}

}