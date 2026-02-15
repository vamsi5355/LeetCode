class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < (long)m * k) return -1;

        int l = 1, r = 0;
        for (int day : bloomDay) {
            r = Math.max(r, day);
        }

        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private boolean canMake(int[] b, int m, int k, int cur) {
        int count = 0, bouquets = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] <= cur) {
                count++;
                if (count == k) {
                    bouquets++;
                    if (bouquets >= m) return true;  
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }
}
