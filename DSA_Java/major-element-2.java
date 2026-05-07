import java.util.*;

class Major {

    public static void main(String args[]) {

        int[] num = {1,3};

        int l = num.length / 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // Count frequencies
        for (int i = 0; i < num.length; i++) {

            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
        }

        // Collect result
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > l) {
                ans.add(entry.getKey());
            }
        }

        System.out.println(ans);
    }
}