class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int prfx[]=new int[n];
        int sufx[]=new int[n];
        prfx[0]=0;
        sufx[n-1]=0;
        for(int i=1;i<n;i++){
            prfx[i]=Math.max(height[i-1],prfx[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            sufx[i]=Math.max(height[i+1],sufx[i+1]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            int dum=Math.min(prfx[i],sufx[i])-height[i];
            water+=(dum>0 ? dum : 0);
        }
        return water;
    }
}