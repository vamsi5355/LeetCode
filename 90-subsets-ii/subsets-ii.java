class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> dum=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0,nums);
        return ans;
    }
    public void backtrack(int idx,int[] nums){
        ans.add(new ArrayList<>(dum));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1])continue;
            dum.add(nums[i]);
            backtrack(i+1,nums);
            dum.remove(dum.size()-1);
        }
    }
}