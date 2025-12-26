class Solution {
    public int bestClosingTime(String customers) {
        int []sufx=new int[customers.length()+1];
        sufx[customers.length()]=0;
        int []prfx=new int[customers.length()+1];
        prfx[0]=0;
        for(int i=customers.length()-1;i>=0;i--){
            if(customers.charAt(i)=='Y'){
                sufx[i]=sufx[i+1]+1;
            }
            else{
                sufx[i]=sufx[i+1];
            }
        }
        for(int i=1;i<=customers.length();i++){
            if(customers.charAt(i-1)=='N'){
                prfx[i]=prfx[i-1]+1;
            }
            else{
                prfx[i]=prfx[i-1];
            }
        }
        int min=Integer.MAX_VALUE;
        int mini=0;
        int []penalty=new int[customers.length()+1];
        for(int i=customers.length();i>=0;i--){
            penalty[i]=sufx[i]+prfx[i];
            if(penalty[i]<=min){
                min=penalty[i];
                mini=i;
            }
        }
        return mini;
    }
}