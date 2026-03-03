class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            System.out.print(Arrays.toString(nums));
        }
        else{
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length-1;j++){
                    if(nums[j]==0){
                        int mem=nums[j+1];//1
                        nums[j+1]=nums[j];
                        nums[j]=mem;
                        

                    }
                }
            }System.out.print(Arrays.toString(nums));

        }
        
    }
}
