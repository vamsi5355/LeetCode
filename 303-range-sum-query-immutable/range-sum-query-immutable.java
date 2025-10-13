class NumArray {
        int [] prefixx;
    public NumArray(int[] nums) {
        prefixx=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefixx[i+1]=prefixx[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefixx[right+1]-prefixx[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */