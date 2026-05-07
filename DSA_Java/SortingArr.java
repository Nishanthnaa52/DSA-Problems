import java.util.*;

class Main {


	static boolean processOut(int[] arr) {

		for(int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1]) {
				
				for (int j = 0; j < i-1; j++) {
					if (arr[j] < arr[j+1]) {
						return true;
					}
				}
			}
			
		}
		return false;

	}


	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String StrVal = input.nextLine();

		String[] StrArr = StrVal.split(",");

		int[] Arr = new int[StrArr.length];

		for (int i = 0; i < StrArr.length; i++) {
			Arr[i] = Integer.parseInt(StrArr[i].trim());
		}

		for (int i = 0; i < StrArr.length; i++) {
			System.out.println(Arr[i]);
		}

		

		System.out.println(processOut(Arr));
	}


}