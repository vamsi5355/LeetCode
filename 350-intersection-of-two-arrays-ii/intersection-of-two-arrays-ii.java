class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean[] visited=new boolean[nums2.length];
        int k=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !visited[j]){
                    visited[j]=true;
                    l.add(nums1[i]);
                    break;
                }
            }
        }
        int a[]=new int[l.size()];
        for(int i:l){
            a[k++]=i;
        }
        return a;
    }
}