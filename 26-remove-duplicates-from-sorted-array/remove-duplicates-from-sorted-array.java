class Solution {
    public int removeDuplicates(int[] nums) {
        int i,k=1,prev=nums[0];
        for(i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                nums[k++]=nums[i];
                prev=nums[i];
            }
        }
        return k;
    }
}