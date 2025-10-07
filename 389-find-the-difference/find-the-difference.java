class Solution {
    public char findTheDifference(String s, String t) {
        char[] ar1=s.toCharArray();
        char[] ar2=t.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        for(int i=0;i<t.length()-1;i++){
            if(ar2[i]!=ar1[i])return ar2[i];
        }
        return ar2[t.length()-1];
    }
}