class Solution {
    public int triangularSum(int[] nums) {
        while(nums.length>1){
            nums=func(nums);
        }
        return nums[0];
    }
    public int[] func(int nn[]){
        int[] n=new int[nn.length-1];
        for(int i=0;i<nn.length-1;i++){
            n[i]=nn[i]+nn[i+1];
            if(n[i]>9)n[i]-=10;
        }
        return n;
    }
}