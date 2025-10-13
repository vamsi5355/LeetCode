import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!isana(words[i], words[i - 1])) {
                ans.add(words[i]);
            }
        }
        return ans;
    }

    private boolean isana(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
