class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean n=false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    n=true;
                    
                }
            }
        }
        return n;
        
    }
}
