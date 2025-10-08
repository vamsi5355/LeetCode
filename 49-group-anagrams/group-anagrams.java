class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean []visited=new boolean[strs.length];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> dum=new ArrayList<>();
            if(!visited[i]){
                dum.add(strs[i]);
                visited[i]=true;
            int l=i+1,r=strs.length-1;
            while(l<=r){
                if(!visited[l] && issame(strs[i],strs[l])){
                    dum.add(strs[l]);
                    visited[l]=true;
                }
                if(l!=r && !visited[r] && issame(strs[i],strs[r])){
                    dum.add(strs[r]);
                    visited[r]=true;
                }
                l++;r--;
            }
            }
            if(dum.size()>0)
            ans.add(dum);
        }
        return ans;
    }
    public boolean issame(String s1,String s2){
         if (s1.length() != s2.length())
            return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}