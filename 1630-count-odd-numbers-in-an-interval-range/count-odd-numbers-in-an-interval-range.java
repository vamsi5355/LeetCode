class Solution {
    public int countOdds(int low, int high) {
     int c=0;
     if((high-low+1)%2==0){
        return (high-low+1)/2;
     } else{
        if(low%2==0)return (high-low+1)/2;
        else return ((high-low+1)/2)+1;
     }
    }
}