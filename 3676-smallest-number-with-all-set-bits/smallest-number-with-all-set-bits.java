class Solution {
    public int smallestNumber(int n) {
        while(Integer.toBinaryString(n).contains("0"))n++;
        return n;
    }
}