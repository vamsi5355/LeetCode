class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int l=0,r=1,count=0;
        while(l<n-1 && r<n){
            if(colors.charAt(l)==colors.charAt(r)){
                if(neededTime[l]>neededTime[r]){
                    count+=neededTime[r];
                    r++;
                }
                else{
                     count+=neededTime[l];
                     l=r;
                     r++;
                }
            }
            else{
                l=r;
                r++;
            }
        }
        return count;
    }
}