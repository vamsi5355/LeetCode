class Solution {
    public int maxScore(String s) {
        int [] prefix0=new int[s.length()+1];
        int [] prefix1=new int[s.length()+1];
        for(int i=0; i<s.length(); i++){
    prefix0[i+1] = prefix0[i] + (s.charAt(i) == '0' ? 1 : 0);
    prefix1[i+1] = prefix1[i] + (s.charAt(i) == '1' ? 1 : 0);
}

        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(prefix0[i+1]+(prefix1[s.length()]-prefix1[i+1])>max){max=prefix0[i+1]+(prefix1[s.length()]-prefix1[i+1]);
            }
        }
        return max;
    }
}