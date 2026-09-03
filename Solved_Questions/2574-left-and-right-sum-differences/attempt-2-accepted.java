class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int leftSum = 0;
        int rightSum = 0;

        // find total right sum
        for (int x : nums) {
            rightSum += x;
        }

        for (int i = 0; i < n; i++) {
            rightSum -= nums[i]; // after removing current, right side remains
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i]; // add current to left for next step
        }
        return ans;
    }
}
