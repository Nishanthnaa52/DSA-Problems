import java.util.*;

class Median {

    static double optimalSolution(int[] a, int[] b) {

        int m = a.length;
        int n = b.length;

        if (m > n) {
            return optimalSolution(b, a);
        }

        int low = 0;
        int high = m;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];

            int r1 = (cut1 == m) ? Integer.MAX_VALUE : a[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : b[cut2];

            if (l1 <= r2 && l2 <= r1) {

                if ((m + n) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }

            } else if (l1 > r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }

    public static void main(String[] args) {
        int[] a = {7, 12, 14, 15};
        int[] b = {1, 2, 3, 4, 9, 11};

        System.out.println(optimalSolution(a, b));
    }
}