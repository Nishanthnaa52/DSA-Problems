import java.util.*;

class sumArr {

	public static void main(String args[]) {

		int[] arr = {-2, -3, -7, -2, -10, -4};

		int maxi = Integer.MIN_VALUE;

		int s = 0;

		int startVal = -1;
		int endVal = -1;
		int start = -1;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (0 == s){
				start = i;
			}

			s = s + arr[i];

			if (s > maxi) {
				maxi = s;
				startVal = start;
				endVal = i;
			}

			if (s < 0) {
				s = 0 ;
			}

		}

		int[] ans = new int[endVal - startVal + 1];

		System.out.println(maxi);
		
		int j = 0;

		for (int i = startVal; i <= endVal; i++) {
			ans[j] = arr[i];
			j++;
		}

		System.out.println(Arrays.toString(ans));
	}

}