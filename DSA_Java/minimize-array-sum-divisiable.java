import java.util.*;

class minimizeArr {

	public static void main(String arge[]) {

		int[] arr = {4,2,8,3};


		int a = 0;
		int b = 1;

		for (int i = 0; i < arr.length; i++) {
				
			for (int j = i; j < arr.length; j++) {
				if (arr[i] % arr[j] == 0) {
					arr[i] = arr[j];
				}
			}
			
		}

		System.out.println(Arrays.toString(arr));

	}

}