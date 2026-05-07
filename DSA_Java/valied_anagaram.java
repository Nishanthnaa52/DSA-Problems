
class Valied {

	public static void main(String args[]) {
		String inputStr = "Marge, let's \"[went].\" I await {news} telegram.";
		

		String change = inputStr.replaceAll("[^a-zA-Z0-9]", "");
		change = change.toLowerCase();

		char[] charArr = change.toCharArray();
		int left = 0; int right = change.length() - 1;

		while(left < right) {
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}

		String reverse = new String(charArr);

		System.out.println(reverse);

		System.out.println(change);

		System.out.println(reverse.equals(change));
	}

}