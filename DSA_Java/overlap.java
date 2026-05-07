import java.util.*;

class Overlap {

	public static void main(String args[]) {
		int[][] intervals={{1,3},{2,6},{8,10},{15,18}};

        // Sort the arr a by compare the two elements.
		Arrays.sort(
            intervals,
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // List to store ans intervals
        List<List<Integer>> ans = new ArrayList<>();

        // Traverse through all intervals
        for (int[] interval : intervals) {
            
            // If ans list is empty or no overlap
            if ( ans.isEmpty() || ans.get(ans.size() - 1).get(1) < interval[0]) {
                
                // Add current interval as a new block
                ans.add(
                    Arrays.asList(interval[0], interval[1])
                );
                

            } else {
                
                // Overlapping: update end to max of both
                int last = ans.size() - 1;


                int maxEnd = Math.max(
                    ans.get(last).get(1),
                    interval[1]
                );
                
                ans.get(last).set(1, maxEnd);
            
            }
        }

        System.out.println(ans);

	}

}