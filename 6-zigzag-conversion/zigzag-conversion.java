class Solution {
    public String convert(String s, int numRows) {
        int c=0,d=0;
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        while(c<s.length()){
            d++;
            c+=numRows;
            if(c<s.length()){
                d+=(numRows-2);
                c+=(numRows-2);
            }
        }
        char[][] a=new char[numRows][d];
        c=0;
        int j=0;
        StringBuilder ans=new StringBuilder();
        while(c<s.length()){
            for(int i=0;i<numRows && c<s.length();i++){
                a[i][j]=s.charAt(c);
                c++;
            }
            j++;
            for(int i=numRows-2;i>0 && c<s.length();i--){
                a[i][j]=s.charAt(c);
                c++;
                j++;
            }
        }
        for(int i=0;i<numRows;i++){
            for(int k=0;k<d;k++){
                if(a[i][k]!='\u0000')ans.append(a[i][k]);
            }
        }
        return ans.toString();
    }
}