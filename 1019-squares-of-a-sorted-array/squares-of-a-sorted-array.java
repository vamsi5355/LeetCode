class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int k = nums.length - 1;
        int[] res = new int[nums.length];

        while (l <= r) {
            int leftSq = nums[l] * nums[l];
            int rightSq = nums[r] * nums[r];

            if (leftSq > rightSq) {
                res[k--] = leftSq;
                l++;
            } else {
                res[k--] = rightSq;
                r--;
            }
        }
        return res;
    }
}
