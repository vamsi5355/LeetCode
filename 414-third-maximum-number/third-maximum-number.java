class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int k=0;
        int[] n=new int[set.size()];
        for(int i:set){
            n[k++]=i;
        }
        Arrays.sort(n);
        if(n.length>2)return n[n.length-3];
        else return n[n.length-1];
    }
}