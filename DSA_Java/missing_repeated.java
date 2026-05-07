// import java.util.*;

// class numbres {

// 	public static void main(String args[]) {

// 		int[] arr = {1, 1};

// 		Arrays.sort(arr);

// 		System.out.println(Arrays.toString(arr));

// 		int[] ans = new int[2];
// 		int count = 0;

// 		for (int i = 0; i < arr.length - 1; i++) {
// 			if (arr[i] == arr[i+1]) {
// 				ans[count++] = arr[i];
// 			}
// 		}
			
// 		int maxInteger = arr[arr.length - 1];

// 		int sumOfNaturalNumber = maxInteger * (maxInteger + 1) / 2;

// 		int arrSum = Arrays.stream(arr).sum() - Arrays.stream(ans).sum();

// 		ans[1] = sumOfNaturalNumber - arrSum;

// 		System.out.println(Arrays.toString(ans));


// 	}

// }




import java.util.*;

class numbers {
    public static void main(String args[]) {

        int[] arr = {1,2,2,4,5};
        int n = arr.length;

        int sum = 0, sqSum = 0;

        for (int num : arr) {
            sum += num;
            sqSum += num * num;
        }

        // System.out.println(sum);
        // System.out.println(sqSum);

        int expectedSum = n * (n + 1) / 2;
        int expectedSqSum = n * (n + 1) * (2 * n + 1) / 6;

        // System.out.println(expectedSum);
        // System.out.println(expectedSqSum);

        int sumDiff = sum - expectedSum;          // A - B
        int sqDiff = sqSum - expectedSqSum;       // A² - B²

        // System.out.println(sumDiff);
        // System.out.println(sqDiff);

        int sumAB = sqDiff / sumDiff;             // A + B

        // System.out.println(sumAB);

        int A = (sumDiff + sumAB) / 2;            // duplicate
        int B = sumAB - A;                        // missing

        System.out.println(Arrays.toString(new int[]{A, B}));
    }
}