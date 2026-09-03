class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int arr[]=new int[2];
        //int n=nums.length;
        //for(int i=0;i<n;i++){
        //    for(int j= i+1; j<n ; j++){
        //       if(nums[i]+ nums[j] ==target ){
        //           arr[0]=i;
        //            arr[1]=j;
         //       }
        //    }
        //}
        //return arr;
        /*int array[]=nums.clone();
        Array.sort(array);
        int result []=new int[2];
        int left=array[0];
        int right=array[array.length-1];
        while(left<right){
            if(array[left]+array[right] == target){
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==array[left]){
                        result[0]=i;
                    }
                }
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==array[right]){
                        result[1]=j;
                    }
                    else if (sum<target){
                        left++;
                    }
                }
            }*/
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
