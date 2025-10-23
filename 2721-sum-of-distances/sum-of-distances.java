class Solution {
    public long[] distance(int[] nums) {
        long[] ans =new long[nums.length];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map.computeIfAbsent(nums[i],k->new ArrayList()).add(i);
        }
        map.forEach((k,v)->{
            int siz=v.size();
            long[] prfx=new long[siz];
            prfx[0]=v.get(0);
            for(int i=1;i<siz;i++){
                prfx[i]=prfx[i-1]+v.get(i);
            }
            for(int i=0;i<siz;i++){
                long lftsum=0,rtsum=0;
                if(i>0)lftsum=((long)i*v.get(i)-prfx[i-1]);
                if(i<siz-1)rtsum=(prfx[siz-1]-prfx[i])-((long)(siz-1-i)*v.get(i));
                ans[v.get(i)]=lftsum+rtsum;
            }
        });
        return ans;
    }
}