import java.util.*;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        int count1 = 0, count2 = 0;

        // count nums1 elements that appear in nums2
        for (int x : nums1) {
            if (set2.contains(x)) count1++;
        }

        // count nums2 elements that appear in nums1
        for (int x : nums2) {
            if (set1.contains(x)) count2++;
        }

        return new int[] { count1, count2 };
    }
}
