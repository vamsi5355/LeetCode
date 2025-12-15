class Solution {
    public int countPartitions(int[] nums) {
        int p[]=new int[nums.length];
        int s[]=new int[nums.length];
        int c=0;
        p[0]=nums[0];
        s[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            s[i]=s[i+1]+nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            if((p[i]-s[i+1])%2==0)c++;
        }
        return c;
    }
}