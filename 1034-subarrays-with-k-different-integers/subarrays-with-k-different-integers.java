class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
    public int func(int[] nums, int k){
        Map<Integer,Integer> l=new HashMap<>();
        int left=0,count=0;
        for(int i=0;i<nums.length;i++){
            l.put(nums[i],l.getOrDefault(nums[i],0)+1);
            while(l.size()>k){
                l.put(nums[left],l.get(nums[left])-1);
                if(l.get(nums[left])==0)l.remove(nums[left]);
                left++;
            }
            count+=(i-left+1);
        }
        return count;
    }
}