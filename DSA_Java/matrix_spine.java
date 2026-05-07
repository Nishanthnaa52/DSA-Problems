import java.util.*;

class spine {

	public static void main(String args[]) {

		int[][] matrix = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};

		System.out.println(Arrays.deepToString(matrix));

		int size = matrix.length * matrix[0].length;
		int[] ans = new int[size];

		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		int index = 0;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				ans[index++] = matrix[top][i];
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				ans[index++] = matrix[i][right];
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					ans[index++] = matrix[bottom][i];
				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					ans[index++] = matrix[i][left];
				}
				left++;
			}
		}

		System.out.println(Arrays.toString(ans));
	}
}