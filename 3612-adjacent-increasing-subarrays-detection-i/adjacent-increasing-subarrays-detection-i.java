class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i <= nums.size() - 2 * k; i++) {
            int j = i + k;
            if (isincreasing(nums, i, j, k)) return true;
        }
        return false;
    }

    public boolean isincreasing(List<Integer> n, int i, int j, int k) {
        for (int t = i + 1; t < i + k; t++) {
            if (n.get(t) <= n.get(t - 1)) return false;
        }

        for (int t = j + 1; t < j + k; t++) {
            if (n.get(t) <= n.get(t - 1)) return false;
        }

        return true;
    }
}
