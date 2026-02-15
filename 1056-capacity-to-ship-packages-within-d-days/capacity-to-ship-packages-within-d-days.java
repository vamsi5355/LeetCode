class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Arrays.stream(weights).max().getAsInt(),r=Arrays.stream(weights).sum();
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(weights,days,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] ww,int d,int mw){
        int min=0,md=0;
        for(int w=0;w<ww.length;w++){
            min+=ww[w];
            if(min==mw){
                md++;
                min=0;
            }else if(min>mw){
                min=ww[w];
                md++;
            }
        }
        if(min!=0)md++;
        return md<=d;
    }
}