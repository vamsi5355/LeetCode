class Solution {
    public int pivotIndex(int[] nums) {
        int [] prefixx=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
                prefixx[i+1]=prefixx[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(prefixx[i]==(prefixx[nums.length]-prefixx[i+1]))return i;
        }
        return -1;
    }
}