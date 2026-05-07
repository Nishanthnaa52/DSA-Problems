

// class pairs {

// 	public static void main(String args[]) {

// 		int[] arr = {-5,-5};

// 		int count = 0;

// 		for (int i = 0; i < arr.length; i++) {

// 			for (int j = i+1; j < arr.length; j++) {

// 				if(arr[i] > (arr[j] * 2)) {

// 					count++;

// 				}

// 			}

// 		}

// 		System.out.println(count);

// 	}

// }

class pairs {
	public static void main(String args[]) {
		int[] nums = {-5, -4, -3, -2, -1};

		Solution sol = new Solution();

		int ans = sol.reversePairs(nums);

		System.out.println(ans);
	}
}


class Solution {

	

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;

        int count = 0;

        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid + 1, right);
        count += countPairs(nums, left, mid, right);

        merge(nums, left, mid, right);

        return count;
    }

    private int countPairs(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;

        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        return count;
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // copy back
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }
}