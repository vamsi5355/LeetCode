class Solution {
    public int maxDistance(int[] position, int m) {
        int l=0;
        Arrays.sort(position);
        int r=position[position.length-1]-1;
        int ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(position,m,mid)){
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
    public boolean check(int[] p,int m,int mid){
            int l=0,c=1;
        for(int i=1;i<p.length;i++){
            if(p[i]-p[l]>=mid){
                c++;
                l=i;
            }
        }
        return c>=m;
    }
}