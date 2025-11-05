class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map =new HashMap<>();
        List<Integer> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:arr2){
            l2.add(i);
        }
        for(int i=0;i<arr1.length;i++){
            if(!l2.contains(arr1[i]))l.add(arr1[i]);
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        Collections.sort(l);
        int [] ans=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<map.get(arr2[i]);j++){
                ans[k++]=arr2[i];
            }
        }
        for(int i:l){
            ans[k++]=i;
        }
        return ans;
    }
}