class Sel {
	public static void main(String args[]) {
		int[] arr = {13, 45, 1, 32, 2, 56, 8, 9};
		int l = arr.length;
		
		// Loop through the array except the last element
		for (int i = 0; i <= l - 2; i++) {
			int min = i;
			
			// Find the minimum element in the unsorted part
			for (int j = i; j <= l - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			// Swap the found minimum element with the first element of the unsorted part
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}
		
		// Print the sorted array
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}