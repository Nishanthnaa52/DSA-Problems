import java.util.*;

class permu {

	static int[] getInput() {
		Scanner input = new Scanner(System.in);

		String Value = input.nextLine();

		String[] VarArr = Value.split(",");

		int[] arr = new int[VarArr.length];

		for (int i = 0; i < VarArr.length; i++) {
			arr[i] = Integer.parseInt(VarArr[i].trim());
		} 

		return arr;
	}
 		

 	static void reverse(int[] arr,int start, int end) {

 		while (start < end) {
 			int tmp = arr[start];
 			arr[start] = arr[end];
 			arr[end] = tmp;

 			start++;
 			end--;
 		}
 	}


	public static void main(String args[]) {

		int[] arr = getInput();
		int init = -1;
		int n = arr.length;

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i+1]) {
				init = i;

				break;
			}
		}
		System.out.println(init);

		if (init == -1) {
			reverse(arr, 0, n - 1);
			System.out.println(Arrays.toString(arr));
		}

		for (int i = arr.length - 1; i >= init; i--) {
			if (arr[i] > arr[init]) {
				// int tmp = arr[i];
				// arr[i] = arr[init];
				// arr[init] = tmp;

				reverse(arr, init, i);

				break;
			}
		}

		reverse(arr, init+1 ,arr.length-1);

		System.out.println(Arrays.toString(arr));

	}
}