class Solution {
    public long getDescentPeriods(int[] prices) {
        long c=1,res=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i]==prices[i-1]-1)c++;
            else c=1;
            res+=c;
        }
        return res;
    }
}