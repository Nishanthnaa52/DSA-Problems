import java.util.*;

class SortMerge {

	public static void main(String arge[]) {

		int[] num1 = {4,5,6,0,0,0};
		int[] num2 = {1,2,3};
		int m = 3;
		int n = 3;
		int j = 0;

		for (int i = m ; i < m+n; i++) {
			num1[i] = num2[j];
			j++;
		}


		System.out.println("Before sorting : " + Arrays.toString(num1));

		Arrays.sort(num1);

		System.out.println("After sorting : " + Arrays.toString(num1));


		//List<Integer> ans = new ArrayList<>();



		// for (int i = 0; i < m; i++) {
		// 	ans.add(num1[i]);
		// }
		// for (int j = 0;j < n; j++) {
		// 	ans.add(num2[j]);
		// }

		// System.out.println(ans);
		// Collections.sort(ans);
		// System.out.println(ans);
	}

}