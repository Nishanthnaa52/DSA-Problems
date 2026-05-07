import java.util.*;

class Read {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int lineNumber = 1;

		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(lineNumber + " " + line);
			lineNumber++;
		}

		input.close();

	}

}