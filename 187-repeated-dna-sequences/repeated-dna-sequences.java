class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10)return new ArrayList<>();
          Set<String> set=new HashSet<>();
          Set<String> st=new HashSet<>();
        for(int i=0;i<s.length()-9;i++){
            String sb=s.substring(i,i+10);
            if(set.contains(sb)){
                st.add(sb);
            }
            set.add(sb);
        }
        return new ArrayList(st);
    }
}