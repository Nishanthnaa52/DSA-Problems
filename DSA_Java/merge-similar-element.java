import java.util.*;

class arrSort {

	  public static void main(String args[]) {

		int[][] items1 = {{1,1},{4,5},{3,8}}; 
        int[][] items2 = {{3,1},{1,5}};

        Map<Integer, Integer> map = new HashMap<>();

        // add items1
        for (int[] item : items1) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }

        // add items2
        for (int[] item : items2) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }       	

        // convert to sorted result
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> keys = new ArrayList<>(map.keySet());

        Collections.sort(keys);

        for (int key : keys) {
            ans.add(Arrays.asList(key, map.get(key)));
        }

        System.out.println(ans);


	  }
}