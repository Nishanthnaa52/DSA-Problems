
// class num {

// 	public static void main(String args[]) {
// 		int n = 8;
// 		int ans = -1;
// 		int total = n * (n + 1) / 2;

// 		int leftSum = 0;

// 		for (int i = 1; i <= n; i++) {
// 			leftSum += i;
// 			int rightSum = total - leftSum + i;

// 			if (leftSum == rightSum) {
// 				ans = i;
// 				break;
// 			}
// 		}

// 		System.out.println(ans);
// 	}

// }


class num {
    public static void main(String[] args) {
        int n = 8;

        int total = n * (n + 1) / 2;
        System.out.println(total);
        int x = (int)Math.sqrt(total);
        System.out.println(x);

        if (x * x == total) {
            System.out.println(x);
        } else {
            System.out.println(-1);
        }
    }
}