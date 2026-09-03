class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0; // pointer for next non-zero position

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // fill remaining positions with zeros
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}
