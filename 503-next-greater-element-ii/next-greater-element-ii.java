class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            boolean c=false;
            for(int j=i+1;j<nums.length+i;j++){
                int k;
                if(j>nums.length-1)k=j-nums.length;
                else k=j;
                if(nums[i]<nums[k]){
                    ans[i]=nums[k];
                    c=true;
                    break;
                }
            }
            if(c==false)
            ans[i]=-1;
        }
        return ans;
    }
}