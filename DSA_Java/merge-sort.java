import java.util.*;

class arrSort {

	public static void mergeSort(int[] arr, int left, int right) {

		if (left >= right) return;

		int mid = left + (right - left) / 2;

		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);

		merge(arr,left,mid,right);

	}

	public static void merge(int[] arr, int left, int mid, int right) {

		int[] temp = new int[right - left + 1];

		int i = left, j = mid+1, k = 0;

		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}

		while (j <= right) {
			temp[k++] = arr[j++];
		}

		for (int p=0; p < temp.length; p++) {
			arr[left+p] = temp[p];
		}

	}

	public static void main(String args[]) {

		int[] arr = {3,5,1,4,-1,-5,1,0,7,10};

		System.out.println(Arrays.toString(arr));

		int left = 0;	
		int right = arr.length - 1;

		mergeSort(arr,left, right);

		System.out.println(Arrays.toString(arr));

 
	}

}

