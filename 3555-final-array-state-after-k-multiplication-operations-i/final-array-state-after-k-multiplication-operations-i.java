class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- >0){
            int min=nums[0];
            int indx=0;
            for(int i=0;i<nums.length;i++){
                if(min>nums[i]){
                    indx=i;
                    min=nums[i];
                }
            }
            nums[indx]=nums[indx]*multiplier;
        }
        return nums;
    }
}