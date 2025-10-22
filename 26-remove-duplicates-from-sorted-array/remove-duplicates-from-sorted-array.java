class Solution {
    public int removeDuplicates(int[] nums) {
        int i,k=0,prev=1000;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=prev){
                nums[k++]=nums[i];
                prev=nums[i];
            }
        }
        return k;
    }
}