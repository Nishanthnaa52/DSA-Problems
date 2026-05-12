import java.util.*;

class singleEle {

	static int bruteforce(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if ( entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return -1;
	}

	public static void main(String args[]) {

		//int[] arr = {1,1,2,3,3,4,4,8,8};

		int[] arr = {3,3,7,7,10,11,11};

		//bruteforce(arr);
 
		System.out.println(bruteforce(arr));

	}

}