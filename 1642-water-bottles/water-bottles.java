class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>0){
            int rem=0;
            if(numBottles>=numExchange)
            rem=numBottles%numExchange;
            System.out.println(numBottles+" "+rem);
            numBottles=(numBottles/numExchange);
            ans+=numBottles;
            numBottles+=rem;
        }
        return ans;
    }
}