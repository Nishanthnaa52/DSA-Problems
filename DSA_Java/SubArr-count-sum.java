import java.util.*;

// Leetcode problem - 560

class sub {

	static int[] Get(Scanner input) {

		String arrStr = input.nextLine();

		String[] arrint = arrStr.split(",");

		int arr[] = new int[arrint.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(arrint[i].trim());
		}

		return arr;
	}

	public static void main(String args[]) {

		
		Scanner input = new Scanner(System.in);

		int[] arr = Get(input);

		int k = input.nextInt();

		HashMap<Integer, Integer> prefixSum = new HashMap<Integer, Integer>();
		prefixSum.put(0,1);
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

			int rem = sum - k;

			if(prefixSum.containsKey(rem)) {
				count += prefixSum.get(rem);
			}

			prefixSum.put(sum, prefixSum.getOrDefault(sum,0)+1);

		}

		System.out.println(count);

	}

}