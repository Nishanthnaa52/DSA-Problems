import java.util.*;

class PrimeRange {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 13;

        int l = n;

        int reversed = 0;

        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        reversed *= sign;



        System.out.println(reversed);

        int sum = 0;

        for (int i = l; i <= reversed; i++) {
            if (isPrime(i)) {
               sum += i;
            }
        }

        System.out.println(sum);
    }
}