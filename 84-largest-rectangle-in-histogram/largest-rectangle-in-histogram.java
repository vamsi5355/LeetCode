class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        heights=Arrays.copyOf(heights,heights.length+1);
        for(int i=0;i<heights.length;i++){

            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int height=heights[st.pop()];
                int rightBoundary=i;
                int leftBoundary=!st.isEmpty() ? st.peek() : -1;
                int width=rightBoundary-leftBoundary-1;
                max=Math.max(max,height*width);
            }
            st.push(i);
        }
        return max;
    }
}