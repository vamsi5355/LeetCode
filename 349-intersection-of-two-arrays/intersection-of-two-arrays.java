class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i :nums2){
            if(set.contains(i))ans.add(i);
        }
        int a[]=new int[ans.size()];
        int k=0;
        for(int i:ans){
            a[k++]=i;
        }
        return a;
    }
}