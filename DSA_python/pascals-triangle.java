import java.util.*;

class triangle {
    public static void main(String args[]) {

        List<List<Integer>> ans = new ArrayList<>();

        int numRow = 5;

        for (int i = 0; i < numRow; i++) {

            List<Integer> sub = new ArrayList<>();
            sub.add(1);

            if (i > 0) {
                List<Integer> prev = ans.get(i - 1);

                for (int j = 1; j < i; j++) {
                    sub.add(prev.get(j - 1) + prev.get(j));
                }

                sub.add(1);
            }

            ans.add(sub);
        }

        System.out.println(ans);
    }
}