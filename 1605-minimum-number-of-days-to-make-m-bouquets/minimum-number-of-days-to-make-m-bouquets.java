class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k)return -1;
        int l=Arrays.stream(bloomDay).min().getAsInt(),r=Arrays.stream(bloomDay).max().getAsInt(),ans=l;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(bloomDay,k,mid)>=m){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int check(int[] b,int k,int cur){
        int cl=0,md=0;
            for(int i=0;i<b.length;i++){
                    if(b[i]<=cur){
                        cl++;
                    }else{
                        cl=0;
                    }
                    if(cl==k){
                        md++;
                        cl=0;
                    }
            }
            return md;
    }
}