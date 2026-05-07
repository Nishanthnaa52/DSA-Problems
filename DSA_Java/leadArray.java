import java.util.*;

public class lead {

    public static int[] inputVal() {
        Scanner input = new Scanner(System.in);
        String Valarr = input.nextLine();
        String[] arrVal = Valarr.split(",");

        int[] arr = new int[arrVal.length];
        for (int i = 0; i < arrVal.length; i++) {
            arr[i] = Integer.parseInt(arrVal[i].trim());
        }
        return arr;
    }

    public static void main(String args[]) {

        int[] arr = inputVal();

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        int maxVal = -1;
        int currentVal = 0;
        
        for (int i = list.size() - 1; i >= 0; i--) {
                
            currentVal = list.get(i);

            list.set(i,maxVal);

            if (currentVal > maxVal) {
                maxVal = currentVal;
            } 
        }

        System.out.println(list);
    }
}
