class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(max<map.getOrDefault(i,0))max=map.getOrDefault(i,0);
        }int sum=0;
        for(int i:map.values()){
            if(i==max)sum+=max;
        }
        return sum;
    }
}