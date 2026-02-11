class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,l=0;
        for(int i=0;i<fruits.length;i++){
                map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0 ){
                    map.remove(fruits[l]);
                }
                l++;
             }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}