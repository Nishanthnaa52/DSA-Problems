import java.util.*;
/*
class hash {

    public static void check(int test, int[] arr) { 

        System.out.println(test + " Is come " + arr[test]);

    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[7];
        int test, val;

        // Input the array of value.
        for(int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        
        int[] ans = new int[10];

        // Check a frequncy of a array of value.
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]]++;
        }

        test = input.nextInt();

        for (int j = 0; j < test; j++) {
            val = input.nextInt();
            check(val, ans);
        }

        
        
    }

}
*/

class hash {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> d = new HashMap<>();
        int num = input.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int j : arr) {

            if (d.containsKey(j)) {
                d.put(j, d.get(j)+1);
            }
            else {
                d.put(j,1);
            }
        }
        System.out.print(d);

        int max = 0;
        int min = 1;
        int maxVal = 0, minVal = 0;

        for (int k = 0; k < arr.length; k++) {

            if (max <= d.get(arr[k])) {
                max = d.get(arr[k]);
                maxVal = arr[k];
            }
            
            if (min >= d.get(arr[k])) {
                min = d.get(arr[k]);
                minVal = arr[k];
            }
        }

        System.out.print("\nMax : "+maxVal);
        System.out.print("\nMin "+minVal);

    }

}