import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // correct index for the value
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // mark visited
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {         // positive => this index + 1 didn't appear
                result.add(i + 1);
            }
        }

        return result;
    }
}
