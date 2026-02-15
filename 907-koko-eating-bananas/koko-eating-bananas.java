class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=Arrays.stream(piles).max().getAsInt();
        int ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] piles,int h,int speed){
        long hrs=0;
        for(int pile:piles){
            hrs+=(Math.ceilDiv(pile,speed));
            if(hrs>h)return false;
        }
        return hrs<=h;
    }
}