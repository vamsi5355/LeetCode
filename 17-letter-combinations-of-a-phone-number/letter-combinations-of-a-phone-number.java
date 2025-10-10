import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();

        String[] a = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();

        int[] d = new int[4];
        int p = 0;
        for (char c : digits.toCharArray()) {
            d[p++] = c - '0';
        }

        if (digits.length() == 1)
            return new ArrayList<>(Arrays.asList(a[d[0]].split("")));

        for (int i = 0; i < a[d[0]].length(); i++) {
            String res1 = "" + a[d[0]].charAt(i);
            for (int j = 0; j < a[d[1]].length(); j++) {
                String res2 = res1 + a[d[1]].charAt(j);
                if (digits.length() == 2) ans.add(res2);

                if (digits.length() >= 3)
                    for (int k = 0; k < a[d[2]].length(); k++) {
                        String res3 = res2 + a[d[2]].charAt(k);
                        if (digits.length() == 3) ans.add(res3);

                        if (digits.length() == 4)
                            for (int l = 0; l < a[d[3]].length(); l++) {
                                ans.add(res3 + a[d[3]].charAt(l));
                            }
                    }
            }
        }

        return ans;
    }
}
