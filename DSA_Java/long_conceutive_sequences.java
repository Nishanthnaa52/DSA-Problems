import java.util.*;

class longConSeq {

	
	public static void main(String args[]) {
		
		int[] arr = inputGet();

		System.out.println(Arrays.toString(arr));

		// betterSolution(arr);

		optimalSoluction(arr);	

	}

	static void optimalSoluction(int[] arr) {

		Set<Integer> setArr = new HashSet<>();

		int langest = 1;

		for (int i = 0; i < arr.length; i++) {
			setArr.add(arr[i]);
		}

		System.out.println(setArr);

		for (int it : setArr) {

			if (!setArr.contains(it - 1)) {
				int count = 1;
				int x = it;

				while (setArr.contains(x+1)) {
					x = x + 1;
					count = count + 1;
				}
				langest = Math.max(langest, count);
			}

		}

		System.out.println(langest);
	}

	static void betterSolution(int[] arr) {
		
		Arrays.sort(arr);

		int count = 0;
		int lastSmall = Integer.MIN_VALUE;
		int longVal = 1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] - 1 == lastSmall) {
				count = count + 1;
				lastSmall = arr[i];
			}
			else if (arr[i] != lastSmall) {
				count = 1;
				lastSmall = arr[i];
			}

			longVal = Math.max(longVal, count);
		}

		System.out.println(longVal);
	}

	static int[] inputGet() {

		Scanner input = new Scanner(System.in);

		String Val = input.nextLine();

		String[] arrVal = Val.split(",");

		int[] arr = new int[arrVal.length];

		for (int i = 0; i < arrVal.length; i++) {
			arr[i] = Integer.parseInt(arrVal[i].trim());
		}

		return arr;
	}


}