class Solution {
    public List<String> removeAnagrams(String[] words) {
        if(words.length==1)return new ArrayList<>(Arrays.asList(words[0]));
        List<String> ans=new ArrayList<>();
        int[] rmvd=new int[words.length];
        int[] used=new int[words.length];
        for(int i=1;i<words.length;i++){
            int j=i-1;
            while(j>=0 && rmvd[j]==1)j--;
            if(isana(words[i],words[j])){
                rmvd[i]=1;
                if(used[j]==0){
                ans.add(words[j]);
                used[j]=1;
                }
            }
            else{
                if(used[j]==0){
                    ans.add(words[j]);
                    used[j]=1;
                }
                if(used[i]==0){
                    ans.add(words[i]);
                    used[i]=1;
                }
            }
        }
        return ans;
    }
    public boolean isana(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<s1.length();i++){
            if(c1[i]!=c2[i])return false;
        }
        return true;
    }
}