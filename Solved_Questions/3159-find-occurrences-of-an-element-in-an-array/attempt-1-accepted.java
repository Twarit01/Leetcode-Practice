import java.util.*;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        // Step 1: collect indices of all occurrences of x in nums
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                indices.add(i);
            }
        }

        // Step 2: create answer array for queries
        int m = queries.length;
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int q = queries[i];
            // we want the q-th occurrence → index q-1 in our list
            if (q - 1 < indices.size()) {
                answer[i] = indices.get(q - 1);
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
