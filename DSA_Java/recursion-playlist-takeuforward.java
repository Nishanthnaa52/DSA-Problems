
class recursion {
	
	

	// static int sumof(int number1, int number2) {
	// 	int sumOfTwoNumber;

	// 	sumOfTwoNumber = number1 + number2;

	// 	return sumOfTwoNumber;
	// }

	// static void counter(int count) {

	// 	if (count > 4) {
	// 		return;
	// 	}

	// 	System.out.println(count);
	// 	counter(count + 1);
		
	// }

	// static void nameOfPersion(String name, int printTime) {

	// 	if (printTime < 0) {
	// 		return;
	// 	}

	// 	System.out.println(name);

	// 	nameOfPersion(name, printTime - 1);


	// }

	static void numberPrint(int num) {
		
		if (num < 0) {
			return;
		}

		numberPrint(num - 1);
		System.out.println(num);

	}

	public static void main(String args[]) {

		numberPrint(10);
	}
}