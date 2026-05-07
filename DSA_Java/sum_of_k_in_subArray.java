import java.util.*;

class subArray {

    static int[] inputArr(Scanner input) {

        String val = input.nextLine();
        String[] arrVal = val.split(",");

        int[] arr = new int[arrVal.length];

        for(int i = 0; i < arrVal.length; i++) {
            arr[i] = Integer.parseInt(arrVal[i]);
        }

        return arr;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] arr = inputArr(input);

        int k = input.nextInt();
        int count = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {

        	s = 0;

            for (int j = i; j < arr.length; j++) {

                s = 0;

                s = s + arr[j];
                // for (int c = i; c <= j; c++) {
                //     s += arr[c];
                // }

                if (s == k) {
                    count++;
                }

            }
        }

        System.out.println(count);
    }
}