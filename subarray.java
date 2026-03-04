class Solution {
    public int maxSubArray(int[] nums) {
        int count=0;
        if(nums.length==1){
            return nums[0];
        }
        else{
            for(int i=0;i<nums.length;i++){
            count=count+nums[i];
                
            }
        }
        return count;
    }
}
