import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        int n = potions.length;
        
        for (int i = 0; i < spells.length; i++) {
            long spell = spells[i];
            int low = 0, high = n - 1, ans = n;
            
            while (low <= high) {
                int mid = (low + high) / 2;
                if (spell * potions[mid] >= success) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            res[i] = n - ans;
        }
        
        return res;
    }
}
