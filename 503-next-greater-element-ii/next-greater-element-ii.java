class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length*2-1;i++){
            int k=i%nums.length;
            while(!st.isEmpty() && nums[st.peek()]<nums[k]){
                    ans[st.pop()]=nums[k];
            }
            if(i<nums.length){
                st.push(i);
            }
        }
        while(!st.isEmpty())ans[st.pop()]=-1;
        return ans;
    }
}