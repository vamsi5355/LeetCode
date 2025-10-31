class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int []ans=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))ans[k++]=nums[i];
            else set.add(nums[i]);
        }
        return ans;
    }
}