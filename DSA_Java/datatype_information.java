import java.util.*;

class DataTypeReange {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		System.out.println(n);

		for (int i = 0; i < n; i++) {

			 try
            {
                long x = input.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)System.out.println("* byte");
                if(x >= Short.MIN_VALUE && x <= Byte.MAX_VALUE)System.out.println("* short");
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)System.out.println("* int");
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }
		}

	}

}