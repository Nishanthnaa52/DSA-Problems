import java.util.*;

class maxInt {
    public static void main(String args[]) {

        int[] nums = {2,3,-2,4};
        int n = nums.length;

        int max = nums[0];
		int min = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
		    int curr = nums[i];

		    if (curr < 0) {
		        int temp = max;
		        max = min;
		        min = temp;
		    }

		    max = Math.max(curr, max * curr);
		    min = Math.min(curr, min * curr);

		    result = Math.max(result, max);
		}

		System.out.println(result);
    }
}