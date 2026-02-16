class Solution {
    public int subarraySum(int[] nums, int k) {
        // int[] prfx=new int[nums.length];
        // prfx[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     prfx[i]=prfx[i-1]+nums[i];
        // }
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k)c++;
            }
        }
        return c;
    }
}