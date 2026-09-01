class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>lst= new ArrayList<>();
        for(int i=0;i<nums.length; i++){
            int k = target - nums[i];
            if(lst.contains(k)){
                return new int[]{lst.indexOf(k), i};
            }
            lst.add(nums[i]);
        }
        return new int[]{};
        }
    }
