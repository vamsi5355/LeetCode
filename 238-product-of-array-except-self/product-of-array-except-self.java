class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []prfx=new int[nums.length];
        int []sufx=new int[nums.length];
        int []ans=new int[nums.length];
        prfx[0]=nums[0];
        sufx[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            prfx[i]=prfx[i-1]*nums[i];
            sufx[nums.length-1-i]=sufx[nums.length-i]*nums[nums.length-1-i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=((i-1>=0) ? prfx[i-1] : 1)*((i+1<nums.length) ? sufx[i+1] : 1);
        }
        return ans;
    }
}