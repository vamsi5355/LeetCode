class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean []visited=new boolean[strs.length];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> dum=new ArrayList<>();
            if(!visited[i]){
                dum.add(strs[i]);
                visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && issame(strs[i],strs[j])){
                    dum.add(strs[j]);
                    visited[j]=true;
                }
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